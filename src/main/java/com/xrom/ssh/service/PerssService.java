package com.xrom.ssh.service;

import com.xrom.ssh.dao.PerssDao;
import com.xrom.ssh.entity.Persona;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PerssService {
    @Autowired
    private PerssDao perssDao;

    public void addPerson(Persona persona){
        perssDao.addPerson(persona);
    }

    public void delPerson(int id){
        perssDao.delPerson(id);
    }

    public void updatePerson(Persona persona){
        perssDao.updatePerson(persona);
    }

    public List<Persona> findPerson(){
        return perssDao.findPerson();
    }

    public List<Persona> findPersonByid(int id,int sid,String username){
        return perssDao.findPersonByid(id,sid,username);
    }

    public List findA(){
        return perssDao.findA();}
}
