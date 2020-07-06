package com.wudimanong.testdemo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author jiangqiao
 */
@Repository
@Mapper
public interface TestDao {

    String TABLE_NAME = " test ";
    String ALL_FIELDS = "name";

    @Insert("INSERT INTO " + TABLE_NAME + "(" + ALL_FIELDS + ") VALUES (#{name})")
    int addUser(@Param("name") String name);
}
