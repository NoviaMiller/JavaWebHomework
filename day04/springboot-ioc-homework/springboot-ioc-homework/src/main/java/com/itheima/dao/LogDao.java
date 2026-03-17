package com.itheima.dao;

import java.util.List;

public interface LogDao {
    //load the data from "log.txt"
    public List<String> findAll();
}
