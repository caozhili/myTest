package com.cn;

import java.util.Arrays;
import java.util.List;

public class Demo002 {
    public static void main(String[] args) {

        String[] str = {"a","b","c"};
        List list = Arrays.asList(str);
//        list.add("aaa") //运行时异常。
        System.out.println(list);
        str[1]= "b2"; // list 中的元素也会随之修改，反之亦然。
        System.out.println(list);


    }
}
