package com.example.stepTracker;

import java.util.HashMap;

public class MonthMap {
    HashMap<Integer, String> monthHashMap = new HashMap<>();
    Months[] months = Months.values();

    public MonthMap() {
        for (int i = 0; i < months.length; i++) {
            monthHashMap.put(i + 1, String.valueOf(months[i]));
        }
    }

    /*public static void main(String[] args) {
        MonthMap monthMap = new MonthMap();
        for (int i = 1; i <= 12; i++) {
            System.out.println(monthMap.monthHashMap.get(i));
        }
        *//*System.out.println();
        for (Months i: months) {
            System.out.println(i);
        }*//*
    }*/
}
