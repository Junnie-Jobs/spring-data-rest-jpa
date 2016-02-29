package me.wonwoo.account;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by wonwoo on 16. 1. 19..
 */
@Projection(name = "fullAddress", types = { Account.class })
public interface FullAddress {

    @Value("#{target.address.country} #{target.address.state} #{target.address.street}")
    String getFullAddress();

    String getName();

    String getEmail();

    String getPassword();
}
