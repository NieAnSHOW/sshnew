package com.xrom.ssh.service;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.xrom.ssh.dao.SysDao;
import com.xrom.ssh.entity.Persona;
import com.xrom.ssh.entity.Sysk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SyskService {
    @Autowired
    private SysDao sysDao;

    public void addSysk(Sysk sysk){
        sysDao.addSysk(sysk);
    }

    public void delSysk(int id){
        sysDao.delSysk(id);
    }

    public void updateSysk(Sysk sysk){
        sysDao.updateSysk(sysk);
    }

    public List<Sysk> findSysk(){
        return sysDao.findSysk();
    }

    public Persona findSyskByid(int id){
        return sysDao.findSyskByid(id);
    }
}
