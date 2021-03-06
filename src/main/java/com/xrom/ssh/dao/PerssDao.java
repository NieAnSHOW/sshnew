package com.xrom.ssh.dao;

import com.xrom.ssh.entity.Persona;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class PerssDao {
    @Resource
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }


    public void addPerson(Persona persona){
        getSession().saveOrUpdate(persona);
        String hql = "from Persona where id = ?";
        Persona up = (Persona)getSession().createQuery(hql).setParameter(0,persona.getId()).uniqueResult();
        String hql_1 = "from Persona where created = ? and username = ?";
        List<Persona> la =(List<Persona>)getSession().createQuery(hql_1).setParameter(0,"cc1").setParameter(1,"123").list();
        for (Persona persona1 : la) {
            persona1.setCreated("cc1");
            persona1.setUsername(up.getUsername());
            persona1.setPhone(up.getPhone());
            persona1.setAddress(up.getAddress());
            persona1.setRemark(up.getRemark());
            updatePerson(persona1);
        }
    }

    public void delPerson(int id){
        getSession().createQuery("delete Persona where id = ?").setParameter(0,id).executeUpdate();
    }

    public void updatePerson(Persona persona){
        getSession().update(persona);

    }



    public List<Persona> findPerson(){
        return (List<Persona>)getSession().createCriteria(Persona.class).list();
    }

    public List<Persona> findPersonByid(int id,int sid,String username){
        String hql = "from Persona where 1=1";
        if (id != 0){
            hql += " and id = "+id;
        }
        if (sid != 0){
            hql += " and sid = "+sid;
        }
        if (username !=null && username.length()>0){
            hql += " and created = '"+username+"'";
        }
        return (List<Persona>) getSession().createQuery(hql).list();
    }

    public List findA(){
        List l = (List)getSession().createQuery("select new com.xrom.ssh.entity.Ba(p.id,p.created,p.username,p.address,p.phone,s.sid,s.emp) from Persona p,Sysk s where p.remark = s.sid order by p.id asc").list();
        return l;
    }

}
