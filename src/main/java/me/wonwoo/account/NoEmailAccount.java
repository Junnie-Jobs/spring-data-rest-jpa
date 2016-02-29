package me.wonwoo.account;

import org.springframework.data.rest.core.config.Projection;

/**
 * Created by wonwoo on 2016. 3. 1..
 */

@Projection(name = "noEmail", types = { Account.class })
public interface NoEmailAccount {

    String getId();

    String getName();

    String getPassword();
}
