package com.xrom.ssh.entity;

import lombok.Data;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by XRom
 * On 11/16/2017.11:50 PM
 */
@Data
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "pid",strategy = "native")
    @GeneratedValue(generator = "pid")
    private int id;

    @Column(name = "created")
    private String created;

    @Column(name = "username")
    private String username;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "sid")
    private int remark;
}
