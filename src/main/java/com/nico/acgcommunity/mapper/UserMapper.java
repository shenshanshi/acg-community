package com.nico.acgcommunity.mapper;

import com.nico.acgcommunity.pojo.TestTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM testtable")
    List<TestTable> findAll();

}
