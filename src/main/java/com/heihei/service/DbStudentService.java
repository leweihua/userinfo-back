package com.heihei.service;

import com.heihei.domain.DbStudent;

import java.util.List;

public interface DbStudentService {


    DbStudent selectByPrimaryKey(String id);

    List<DbStudent> selectAllInfo();

    List<DbStudent> findByPage(Integer pageNum, Integer pageSize);
}
