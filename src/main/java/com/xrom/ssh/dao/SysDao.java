package com.xrom.ssh.dao;

import com.xrom.ssh.entity.Persona;
import com.xrom.ssh.entity.Sysk;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class SysDao {
    @Resource
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    public void addSysk(Sysk sysk){
        getSession().save(sysk);
    }

    public void delSysk(int id){
        getSession().createQuery("delete Sysk where id = ?").setParameter(0,id).executeUpdate();
    }

    public void updateSysk(Sysk sysk){
        getSession().update(sysk);
    }

    public List<Sysk> findSysk(){
        return (List<Sysk>)getSession().createCriteria(Sysk.class).list();
    }

    public Persona findSyskByid(int id){
        return (Persona) getSession().createQuery("from Sysk where id = ?").setParameter(0,id).uniqueResult();
    }





}
