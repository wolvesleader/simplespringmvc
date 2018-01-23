package com.quincy.demo;

import quincy.User;

import java.lang.reflect.Method;

/**
 * Created by quincy on 18/1/22.
 */
public class DemoDriver {


    public static void main(String[] args) {

        Class<User> userClass = User.class;
        LocalVariableTableParameterNameDiscoverer tableParameterNameDiscoverer = new LocalVariableTableParameterNameDiscoverer();
        Method[] methods = userClass.getMethods();
        for (Method m: methods
             ) {
            System.out.println("方法");
            String[] parameterNames = tableParameterNameDiscoverer.getParameterNames(m);
            for (String name: parameterNames
                 ) {
                System.out.println("方法参数名称");
                System.out.println(name);
            }
        }

    }
}
