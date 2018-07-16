package com.willow.mapper;

import com.willow.entity.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EmpMapper {
    int deleteByPrimaryKey(Integer id);

    List<Emp>  selectList(Emp emp);

    int insert(Emp record);

    int saveEmp(Emp record);

    Emp selectById(Integer id);

    int updateEmp(Emp record);

    int updateByPrimaryKey(Emp record);
}