package com.example.stepTracker.Basket;

import com.example.stepTracker.Months;

import java.util.HashMap;

public class MonthMap {
    HashMap<Integer, String> monthHashMap = new HashMap<>();
    Months[] months = Months.values();

    public MonthMap() {
        for (int i = 0; i < months.length; i++) {
            monthHashMap.put(i + 1, String.valueOf(months[i]));
        }
    }

}
