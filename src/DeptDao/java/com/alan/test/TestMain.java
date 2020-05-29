package com.alan.test;

import com.alan.dao.DeptDao;
import com.alan.util.DefaultSqlSession;

/**
 * @PACKAGE_NAME: com.alan.test
 * @NAME: TestMain
 * @USER: liuhao
 * @DATE: 2020-05-27 16:03
 * @WEEK: Wednesday
 * @PROJECT_NAME: self-mybatis
 **/
public class TestMain {


    public static void main(String[] args) {


        DefaultSqlSession defaultSqlSession = new DefaultSqlSession();

        DeptDao dao = (DeptDao)defaultSqlSession.getMapper(DeptDao.class);

        dao.findAll();


    }

}
