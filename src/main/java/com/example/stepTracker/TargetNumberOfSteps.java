package com.example.stepTracker;

import java.io.*;

public class TargetNumberOfSteps {

    public static Integer targetNumberOfSteps;//Целевое количество шагов

    public static void nullCheck() {
        targetNumberOfSteps = readingTheNumberOfSteps();
        if (targetNumberOfSteps == null) {
            targetNumberOfSteps = 10000;
        }
        savingTheNumberOfSteps(targetNumberOfSteps);
    }



   static public void savingTheNumberOfSteps(int targetNumberOfSteps) {
        try {
            File file = new File("numberOfSteps.txt"); // Создание объекта файла
            FileWriter fileWriter = new FileWriter(file); // Создание объекта FileWriter для записи в файл
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // Создание объекта BufferedWriter для более эффективной записи

            bufferedWriter.write(String.valueOf(targetNumberOfSteps)); // Преобразование числа в строку и запись в файл
            bufferedWriter.close(); // Закрытие BufferedWriter

            //System.out.println("Число успешно сохранено в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении числа в файл: " + e.getMessage());
        }
    }

   static public Integer readingTheNumberOfSteps() {
        Integer targetNumberOfSteps = 0;
        try {
            File file = new File("numberOfSteps.txt"); // Создание объекта файла
            FileReader fileReader = new FileReader(file); // Создание объекта FileReader для чтения файла
            BufferedReader bufferedReader = new BufferedReader(fileReader); // Создание объекта BufferedReader для более эффективного чтения

            String line = bufferedReader.readLine(); // Чтение строки из файла
            if (line != null) {
                targetNumberOfSteps = Integer.parseInt(line);
            } // Преобразование строки в число

            bufferedReader.close(); // Закрытие BufferedReader

            //System.out.println("Прочитанное число: " + targetNumberOfSteps);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении числа из файла: " + e.getMessage());
        }
        return targetNumberOfSteps;
    }

}
