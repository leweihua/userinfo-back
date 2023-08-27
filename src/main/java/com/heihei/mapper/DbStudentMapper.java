package com.heihei.mapper;

import com.heihei.domain.DbStudent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DbStudentMapper {
    int deleteByPrimaryKey(String id);

    int insert(DbStudent record);

    int insertSelective(DbStudent record);

    DbStudent selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DbStudent record);

    int updateByPrimaryKey(DbStudent record);

    List<DbStudent> selectAll();



}