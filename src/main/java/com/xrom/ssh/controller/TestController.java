package com.xrom.ssh.controller;

import com.xrom.ssh.entity.Persona;
import com.xrom.ssh.service.PerssService;
import com.xrom.ssh.service.SyskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    @Autowired
    private PerssService perssService;

    @Autowired
    private SyskService syskService;

    @RequestMapping(value = "selectA")
    @ResponseBody
    public List<Persona> findS(){
        return perssService.findPerson();
    }

    @RequestMapping(value = "selectbyid")
    @ResponseBody
    public List<Persona> findSbyid(int id,int sid,String username){
        return perssService.findPersonByid(id,sid,username);
    }

    @RequestMapping(value = "byid")
    public ModelAndView modify(ModelAndView modelAndView,int id,int sid,String username){
        modelAndView.addObject("person",perssService.findPersonByid(id,sid,username));
        modelAndView.setViewName("modify");
        return modelAndView;
    }
    @RequestMapping(value = "del")
    public String del(int id){
        perssService.delPerson(id);
        return "forward:findid";
    }

    @RequestMapping(value = "findid")
    @ResponseBody
    public ModelAndView findByid(ModelAndView modelAndView){
        modelAndView.addObject("personList",perssService.findA());
        modelAndView.addObject("empList",syskService.findSysk());
        modelAndView.setViewName("table");
        return modelAndView;
    }

    @RequestMapping(value = "update")
    public String update(Persona persona){
        perssService.updatePerson(persona);
        return "forward:findid";
    }

    @RequestMapping(value = "add")
    public String addPerson(Persona persona){
        perssService.addPerson(persona);
        return "forward:findid";
    }

    @RequestMapping(value = "selectUp")
    @ResponseBody
    public List select(){
        return perssService.findA();
    }

}
