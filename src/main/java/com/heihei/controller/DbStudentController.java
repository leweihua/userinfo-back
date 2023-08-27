package com.heihei.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.heihei.domain.DbStudent;
import com.heihei.mapper.DbStudentMapper;
import com.heihei.service.DbStudentService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@CrossOrigin
@RequestMapping("/stu")
public class DbStudentController {

    @Autowired
    private DbStudentService dbStudentService;

    @ResponseBody
    @GetMapping("/searchById")
    public DbStudent getOneStuInfo(@RequestParam("id")String id){
        System.out.println(id);
        return dbStudentService.selectByPrimaryKey(id);
    }

    @ResponseBody
    @GetMapping("/searchAll")
    public List<DbStudent> getAllInfo(){
        return dbStudentService.selectAllInfo();
    }

    @ResponseBody
    @GetMapping("/findByPage")
    public List<DbStudent> findByPage(@RequestParam("pageNum")Integer pageNum,@RequestParam("pageSize") Integer pageSize){
        System.out.println("pageNum:"+pageNum+","+"pageSize:"+pageSize);
        return dbStudentService.findByPage(pageNum,pageSize);
    }



}
