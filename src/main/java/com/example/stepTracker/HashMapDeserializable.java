package com.example.stepTracker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

public class HashMapDeserializable implements Serializable {

    private static final long serialVersionUID = 1L;
    private static HashMap<Integer, StepTracker.MonthDate> deserializedHashMap;

    static public HashMap deserializable() {

        try {
            // Создание объекта ObjectInputStream для чтения из файла или потока
            FileInputStream fileInputStream = new FileInputStream("arrayDataMap.bin");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            // Десериализация HashMap
            deserializedHashMap = (HashMap<Integer, StepTracker.MonthDate>) inputStream.readObject();

            // Закрытие потока
            inputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deserializedHashMap;
    }
}
