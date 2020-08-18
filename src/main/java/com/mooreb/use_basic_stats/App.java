package com.mooreb.use_basic_stats;

import com.mooreb.util.Counter;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        Counter<Date> dateCounter = new Counter<>();
        dateCounter.count(new Date());
        System.out.println(dateCounter.toString());
    }
}
