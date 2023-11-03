package com.example.stepTracker;


import java.io.*;
import java.util.HashMap;


public class StepTracker implements Serializable {
    private static final long serialVersionUID = 1L;
    HashMap<Integer, MonthDate> monthDataHashMap = new HashMap<>();

    public StepTracker() { //Конструктор заполняющий hashMap объектами MonthDate и проверяющий наличие файла с hashmap
        if (fileExists()) {
            monthDataHashMap = HashMapDeserializable.deserializable();
        } else {
            for (int i = 1; i <= 12; i++) {
                monthDataHashMap.put(i, new MonthDate());
                String month = String.valueOf(Months.getTemplateByCode(i));
                monthDataHashMap.get(i).setMonth(month);
            }
            //saveHashMapToFile();
            HashMapSerializable.Serializable(monthDataHashMap);
        }


    }

    private boolean fileExists() {
        File file = new File("arrayDataMap.bin");
        return file.exists();
    }

    public class MonthDate implements Serializable { //Класс для хранения переменных: месяца, даты, шагов и массива

        private static final long serialVersionUID = 1L;
        private String month;
        private int data;
        private int steps;
        private int[][] monthDataArray = new int[30][2];


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

}

