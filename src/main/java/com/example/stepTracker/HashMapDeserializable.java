package com.example.stepTracker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class HashMapDeserializable {
    private static HashMap<Integer, StepTracker.MonthDate> deserializedHashMap;

    static public HashMap deserializable() {

        try {
            // Создание объекта ObjectInputStream для чтения из файла или потока
            FileInputStream fileInputStream = new FileInputStream("data.bin");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            // Десериализация HashMap
            deserializedHashMap = (HashMap<Integer, StepTracker.MonthDate>) inputStream.readObject();

            // Закрытие потока
            inputStream.close();
            fileInputStream.close();
            // Использование десериализованной HashMap
            /*MonthDate deserializedObject = deserializedHashMap.get(1);
            System.out.println("Array elements:");
            for (int[] element : deserializedObject.getMonthDataArray()) {
                System.out.println(element);
            }*/

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deserializedHashMap;
    }
}
