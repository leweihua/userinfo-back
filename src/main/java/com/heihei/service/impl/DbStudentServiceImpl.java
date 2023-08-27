package com.heihei.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.heihei.domain.DbStudent;
import com.heihei.mapper.DbStudentMapper;
import com.heihei.service.DbStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbStudentServiceImpl implements DbStudentService {
    @Autowired
    private DbStudentMapper dbStudentMapper;
    @Override
    public DbStudent selectByPrimaryKey(String id) {
        return dbStudentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<DbStudent> selectAllInfo() {
        return dbStudentMapper.selectAll();
    }

    @Override
    public List<DbStudent> findByPage(Integer pageNum, Integer pageSize) {
        Page<DbStudent> page= PageHelper.startPage(pageNum,pageSize);
        List<DbStudent> list=dbStudentMapper.selectAll();
        System.out.println("当前页："+page.getPageNum());
        System.out.println("总页数："+page.getPages());
        System.out.println("页大小："+page.getPageSize());
        System.out.println("总记录数："+page.getTotal());
        System.out.println("当前页数据："+page.getResult());
        return list;
    }


}
