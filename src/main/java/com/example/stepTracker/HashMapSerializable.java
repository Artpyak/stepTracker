package com.example.stepTracker;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class HashMapSerializable implements Serializable {
    private static final long serialVersionUID = 1L;

    public static void Serializable(HashMap<Integer, StepTracker.MonthDate> hashMap) {
        try {
            // Создание объекта ObjectOutputStream для записи в файл или поток
            FileOutputStream fileOutputStream = new FileOutputStream("arrayDataMap.bin");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            // Сериализация HashMap
            outputStream.writeObject(hashMap);

            // Закрытие потока
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
