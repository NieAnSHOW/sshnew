package com.xrom.ssh.entity;

import lombok.Data;

/**
 * lian
 */
@Data
public class Ba {
    public Ba(int id, String created, String username, String address, String phone,int sid,String emp) {
        this.id = id;
        this.created = created;
        this.username = username;
        this.address = address;
        this.phone = phone;
        this.sid = sid;
        this.emp = emp;
    }

    private int id;

    private String created;

    private String username;

    private String address;

    private String phone;

    private int sid;

    private String emp;

}
