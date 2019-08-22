package org.linlinjava.litemall.admin.mapper;



import org.apache.ibatis.annotations.Mapper;
import org.linlinjava.litemall.admin.domain.Person;

import java.util.List;

@Mapper
public interface PersonMapper {

    //查询用户
    public List<Person> queryPersonList();
    //根据id删除用户
    public void deletePersonById(String id);
    //修改用户
    public void update(Person person);
    //添加用户
    public void addPerson(Person person);



}
