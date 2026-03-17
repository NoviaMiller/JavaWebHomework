package com.itheima.controller;

import cn.hutool.core.io.IoUtil;
import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import com.itheima.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DeptController {

    private final DeptService deptService;
    @Autowired
    public DeptController(DeptService deptService) {
        this.deptService = deptService;
    }

    @RequestMapping("/depts")
    public Result list2(){
       Result result = deptService.findAll();
       return result;
    }

}
