package com.example.stepTracker;


import java.util.HashMap;

public class StepTracker {
    HashMap<Integer, MonthDate> monthDataHashMap = new HashMap<Integer, MonthDate>();

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthDataHashMap.put(i, new MonthDate());
        }
    }

    class MonthDate {


        private void dateFiling() {
            HashMap<Integer, Integer> hashMapDate = new HashMap<Integer, Integer>();
            StepTracker stepTracker = new StepTracker();
            hashMapDate.put(stepTracker.data, steps); //разобраться с заполнением
        }
    }

    private String month;
    private int data;
    private int steps;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}

