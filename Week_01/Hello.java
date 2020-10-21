package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class Hello {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        int even = 0;
        int odd = 0;
        for (Integer num : numList){
            if (num%2 == 1){
                even = even + num;
                even = even * 2;
            } else {
                odd = odd + num;
            }
        }
        int diff = even - odd;
        System.out.println(diff);
    }
}
