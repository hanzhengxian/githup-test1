package org.linlinjava.litemall.admin.controller;

import org.linlinjava.litemall.admin.domain.Person;
import org.linlinjava.litemall.admin.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Date 2019-8-20.
 * Author: wang ding
 */

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonMapper personMapper;

    //添加用户
    @RequestMapping("/add")
    @ResponseBody
    public void addPerson(Person person){
        personMapper.addPerson(person);

    }
    @RequestMapping("/findAll")
    @ResponseBody
    public  List<Person> findAll(){
        List<Person> personList = personMapper.queryPersonList();
        return personList;

    }
    @RequestMapping("/update")
    @ResponseBody
    public void update(Person person){
        personMapper.update(person);

    }
    @RequestMapping("/delete")
    @ResponseBody
    public void delete(String id){
        personMapper.deletePersonById(id);

    }


}
