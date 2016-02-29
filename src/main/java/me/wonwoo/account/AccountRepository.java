package me.wonwoo.account;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by wonwoo on 16. 1. 18..
 */

@RepositoryRestResource(collectionResourceRel = "account", path = "account")
public interface AccountRepository extends JpaRepository<Account, Long> {

    Page<Account> findByname(@Param("first_name") String name, Pageable pageable);

    @RestResource(path = "nameStartsWith", rel = "name")
    Page<Account> findByNameStartsWith(@Param("name") String name, Pageable pageable);

}

