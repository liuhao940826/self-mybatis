package com.alan.util;

import com.alan.proxy.MapperProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @PACKAGE_NAME: com.alan.util
 * @NAME: DefaultSqlSession
 * @USER: liuhao
 * @DATE: 2020-05-27 15:59
 * @WEEK: Wednesday
 * @PROJECT_NAME: self-mybatis
 **/
public class DefaultSqlSession {

    /**
     * 代理对象的生成
     * @param classFile
     * @return
     */
//    public Object getMapper(Class classFile){
//
//        //创建代理实现类的对象
//        InvocationHandler agent = new MapperProxy();
//
//        Object proxy = Proxy.newProxyInstance(classFile.getClassLoader(), classFile.getInterfaces(), agent);
//
//        return  proxy;
//
//    }

    /**
     * 代理对象的生成
     * @param classFile
     * @return
     */
    public Object getMapper(Class classFile){

        //创建代理实现类的对象
        InvocationHandler agent = new MapperProxy();

        Class classArray[] = {classFile};

        Object proxy = Proxy.newProxyInstance(classFile.getClassLoader(), classArray, agent);

        return  proxy;

    }
}
