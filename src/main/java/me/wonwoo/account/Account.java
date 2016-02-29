package me.wonwoo.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.wonwoo.address.Address;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by wonwoo on 16. 1. 18..
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "name is required")
    private String name;

    private String email;

    private String password;

    @OneToOne
    @JoinColumn(name="address_id")
    private Address address;

}
