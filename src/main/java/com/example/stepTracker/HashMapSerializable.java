package com.example.stepTracker;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class HashMapSerializable {
    private static HashMap<Integer, StepTracker.MonthDate> HashMap;

    public HashMapSerializable(java.util.HashMap<Integer, StepTracker.MonthDate> hashMap) {
        HashMap = hashMap;
    }


    static void Serializable() {
        try {
            // Создание объекта ObjectOutputStream для записи в файл или поток
            FileOutputStream fileOutputStream = new FileOutputStream("data.bin");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            // Сериализация HashMap
            outputStream.writeObject(HashMap);

            // Закрытие потока
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
