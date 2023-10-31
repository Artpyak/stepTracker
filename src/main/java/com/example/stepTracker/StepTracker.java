package com.example.stepTracker;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;


public class StepTracker {
    Gson gson = new Gson();

    //Type monthDateType = new TypeToken<MonthDate>() {}.getType();

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

    class MonthDate {
        private String month;
        private int data;
        private int steps;
        int[][] monthDataArray = new int[30][2];

        public MonthDate() {
        }


        public void arrayFilling(int data, int steps) { //Заполняет массив датой и количеством шагов
            monthDataArray[data - 1][0] = data;
            monthDataArray[data - 1][1] = steps;
            setData(data);
            setSteps(steps);
        }


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

        public int[][] getMonthDataArray() {
            return monthDataArray;
        }

        public void setMonthDataArray(int[][] monthDataArray) {
            this.monthDataArray = monthDataArray;
        }
    }
    Type hashMapType = new TypeToken<HashMap<String, MonthDate>>() {}.getType();
    public String hashMapConversionToJson() { //Сериализация hash map в json
        String jsonMap = gson.toJson(monthDataHashMap);
        return jsonMap;
    }

    public HashMap hashMapConversionFromJson() { //Десериализация hash map из json

        String json = hashMapConversionToJson();
        HashMap<Integer, MonthDate> monthDateHashMapFromJson = gson.fromJson(json, HashMap.class);
        return monthDateHashMapFromJson;
    }

    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker();
        stepTracker.monthDataHashMap.get(1).arrayFilling(3, 90);
        /*int[][] arr = stepTracker.monthDataHashMap.get(1).monthDataArray;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }*/
        String json = stepTracker.hashMapConversionToJson();
        System.out.println(json);

        HashMap hashMapFromJson = stepTracker.hashMapConversionFromJson();
        System.out.println(hashMapFromJson);

    }

}

