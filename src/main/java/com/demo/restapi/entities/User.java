package com.demo.restapi.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity{

    @Id
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_gen", initialValue = 100, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @Column(name = "ID")
    private Long id;

    @Column(name = "first_name",length = 100, nullable = false)
    private String firstName;

    @Column(name = "last_name",length = 100, nullable = false)
    private String lastName;
}
