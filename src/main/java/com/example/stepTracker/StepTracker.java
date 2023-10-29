package com.example.stepTracker;


import com.google.gson.Gson;

import java.util.HashMap;


public class StepTracker {
    Gson gson = new Gson();

    /*public static void main(String[] args) { //тестирование
        StepTracker stepTracker = new StepTracker();
        stepTracker.monthDataHashMap.get(1).arrayFilling(3, 90);
        int[][] arr = stepTracker.monthDataHashMap.get(1).monthDataArray;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }*/

    public HashMap<Integer, MonthDate> monthDataHashMap = new HashMap<>();

    public StepTracker() { //Конструктор заполняющий hashMap объектами MonthDate
        for (int i = 1; i <= 12; i++) {
            monthDataHashMap.put(i, new MonthDate());
            String month = String.valueOf(Months.getTemplateByCode(i));
            monthDataHashMap.get(i).setMonth(month);
        }
    }

    class MonthDate /*implements MonthDateInterface*/ {
        private String month;
        private int data;
        private int steps;
        int[][] monthDataArray;


        public MonthDate() {
            monthDataArray = new int[30][2];
        }
        /* @Override
         public void creatingAnArrayOfDatesAndSteps() { //создаёт массив с датами и количеством шагов
             int[][] monthData = new int[30][2];
             monthData[data - 1][0] = data;
             monthData[data - 1][1] = steps;
         }

        @Override
        */

        public void arrayFilling(int data, int steps) { //Заполняет массив датой и количеством шагов
            monthDataArray[data - 1][0] = data;
            monthDataArray[data - 1][1] = steps;
            setData(data);
            setSteps(steps);
        }

        //@Override
        public String getMonth() {
            return month;
        }

        //@Override
        public void setMonth(String month) {
            this.month = month;
        }

        //@Override
        public int getData() {
            return data;
        }

        //@Override
        public void setData(int data) {
            this.data = data;
        }

        //@Override
        public int getSteps() {
            return steps;
        }

        //@Override
        public void setSteps(int steps) {
            this.steps = steps;
        }

    }

    public String HashMapConversionToStrings() {
        String monthDataHashMap = gson.toJson(monthDataHashMap);
        return null;
    }


}

