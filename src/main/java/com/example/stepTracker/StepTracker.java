package com.example.stepTracker;


import java.io.Serializable;
import java.util.HashMap;


public class StepTracker implements Serializable {
    HashMap<Integer, MonthDate> monthDataHashMap = new HashMap<>();


    public StepTracker() { //Конструктор заполняющий hashMap объектами MonthDate
        for (int i = 1; i <= 12; i++) {
            monthDataHashMap.put(i, new MonthDate());
            String month = String.valueOf(Months.getTemplateByCode(i));
            monthDataHashMap.get(i).setMonth(month);
        }
    }

    class MonthDate implements Serializable { //Класс для хранения переменных: месяца, даты, шагов и массива

        private String month;
        private int data;
        private int steps;
        private int[][] monthDataArray = new int[30][2];


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
    /*public String hashMapConversionToJson() { //Сериализация hash map в json через библиотеку gson
        String jsonMap = gson.toJson(monthDataHashMap);
        return jsonMap;
    }

    public HashMap hashMapConversionFromJson() { //Десериализация hash map из json через библиотеку gson

        String json = hashMapConversionToJson();
        HashMap<Integer, MonthDate> monthDateHashMapFromJson = gson.fromJson(json, HashMap.class);
        return monthDateHashMapFromJson;
    }*/

    /*public void hashMapSerializable() {
        try {
            // Создание объекта ObjectOutputStream для записи в файл или поток
            FileOutputStream fileOutputStream = new FileOutputStream("data.bin");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            // Сериализация HashMap
            outputStream.writeObject(monthDataHashMap);

            // Закрытие потока
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/
    /*HashMap<Integer, MonthDate> deserializedHashMap;
    public void hashMapDeserializable() {


        try {
            // Создание объекта ObjectInputStream для чтения из файла или потока
            FileInputStream fileInputStream = new FileInputStream("data.bin");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            // Десериализация HashMap
            deserializedHashMap = (HashMap<Integer, MonthDate>) inputStream.readObject();

            // Закрытие потока
            inputStream.close();
            fileInputStream.close();
            // Использование десериализованной HashMap
            *//*MonthDate deserializedObject = deserializedHashMap.get(1);
            System.out.println("Array elements:");
            for (int[] element : deserializedObject.getMonthDataArray()) {
                System.out.println(element);
            }*//*

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }*/

    /*public void useOfDeserialisedHashmap() {
        // Использование десериализованной HashMap
        MonthDate deserializedObject = deserializedHashMap.get("key");
        System.out.println("Array elements:");
        for (String element : deserializedObject.getArray()) {
            System.out.println(element);
        }

    }*/


    /*public static void main(String[] args) { // Test
        StepTracker stepTracker = new StepTracker();
        stepTracker.monthDataHashMap.get(1).arrayFilling(3, 90);
        stepTracker.monthDataHashMap.get(1).arrayFilling(4, 95);
        stepTracker.monthDataHashMap.get(1).arrayFilling(5, 100);
        System.out.println("!!!!!!");
        *//*int[][] arr = stepTracker.monthDataHashMap.get(1).monthDataArray;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }*//*
        stepTracker.hashMapSerializable();
        stepTracker.hashMapDeserializable();

        int[][] arr = stepTracker.deserializedHashMap.get(1).monthDataArray;
        System.out.println(stepTracker.deserializedHashMap.get(1).month);
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }*/

}

