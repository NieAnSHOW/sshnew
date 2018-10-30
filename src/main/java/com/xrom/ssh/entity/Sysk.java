package com.xrom.ssh.entity;

import lombok.Cleanup;
import lombok.Data;
import oracle.jdbc.proxy.annotation.OnError;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sysk")
public class Sysk {
    @Id
    @Column(name = "sid")
    private int sid;

    @Column(name = "emp")
    private String emp;
}
