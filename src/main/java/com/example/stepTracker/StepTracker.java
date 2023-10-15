package com.example.stepTracker;


import java.util.HashMap;

public class StepTracker {
    public HashMap<Integer, MonthDate> monthDataHashMap = new HashMap<>();

    public StepTracker() {
        for (int i = 1; i <= 12; i++) {
            monthDataHashMap.put(i, new MonthDate());
            String month = String.valueOf(Months.getTemplateByCode(i));
            monthDataHashMap.get(i).setMonth(month);
        }
    }

    class MonthDate implements MonthDateInterface {
        @Override
        public void creatingAnArrayOfDatesAndSteps() {
            int[][] monthData = new int[30][2];
            monthData[data - 1][0] = data;
            monthData[data - 1][1] = steps;
        }

        @Override
        public void arrayFilling(int data, int steps) {
            setData(data);
            setSteps(steps);
            creatingAnArrayOfDatesAndSteps();
        }

        private String month;
        private int data;
        private int steps;

        @Override
        public String getMonth() {
            return month;
        }

        @Override
        public void setMonth(String month) {
            this.month = month;
        }

        @Override
        public int getData() {
            return data;
        }

        @Override
        public void setData(int data) {
            this.data = data;
        }

        @Override
        public int getSteps() {
            return steps;
        }

        @Override
        public void setSteps(int steps) {
            this.steps = steps;
        }

    }


}

