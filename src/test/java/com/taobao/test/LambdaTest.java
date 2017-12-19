package com.taobao.test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhouheming on 2017/12/17
 */
public class LambdaTest {

    public static void test(){
        List<String> list = Arrays.asList("lambdaA","lambdaB");
        list.stream().forEach(t -> System.out.println(t));
    }

}
