package com.example.stepTracker.menuItems.impl;

import com.example.stepTracker.HashMapDeserializable;
import com.example.stepTracker.StepTracker;
import com.example.stepTracker.TargetNumberOfSteps;
import com.example.stepTracker.menuItems.MenuItems;
import com.example.stepTracker.messageToTheConsole.impl.MessageAboutTheChoiceOfMonth;

import java.util.HashMap;
import java.util.Scanner;

public class Statistics implements MenuItems {
    private int mouthNumber = monthSelection();
    private HashMap<Integer, StepTracker.MonthDate> arrayDataMap = HashMapDeserializable.deserializable();

    int[][] monthDataArray = arrayDataMap.get(mouthNumber).getMonthDataArray();

    @Override
    public void getMenuItems() {
        System.out.println(arrayDataMap.get(mouthNumber).getMonth());
        monthNumberScanning(monthDataArray);
        monthlySteps(monthDataArray);
        maximumNumberOfStepsPerDay(monthDataArray);
        averageNumberOfSteps(monthDataArray);
        distanceCoveredInKM(monthDataArray);
        calorieIntake(monthDataArray);
        bestSeriesOfSteps(monthDataArray, TargetNumberOfSteps.targetNumberOfSteps);
    }

    int monthSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(MessageAboutTheChoiceOfMonth.getTemplate());
        return scanner.nextInt();
    }

    void monthNumberScanning(int[][] monthDataArray) { //Колличество пройденных шагов по дням
        for (int i = 0; i < monthDataArray.length; i++) {
            for (int j = 0; j < monthDataArray[i].length; j++) {
                System.out.print(monthDataArray[i][j]);
                if (j == 0) {
                    System.out.print(" день: ");
                } else if (j == 1) {
                    System.out.print(",  ");

                }
            }
        }
        System.out.println();
    }

    void monthlySteps(int[][] monthDataArray) { //Общее колличсетво шагов за месяц
        int j = 0;
        for (int i = 0; i < monthDataArray.length; i++) {
            j += monthDataArray[i][1];
        }
        System.out.println("Общее колличсетво шагов за месяц: " + j);
    }

    void maximumNumberOfStepsPerDay(int[][] monthDataArray) {
        int columnSteps = 1;
        if (columnSteps < 0 || columnSteps >= monthDataArray[0].length) {
            throw new IllegalArgumentException("Недопустимый индекс столбца");
        }

        int max = monthDataArray[0][columnSteps];
        for (int i = 1; i < monthDataArray.length; i++) {
            if (monthDataArray[i][columnSteps] > max) {
                max = monthDataArray[i][columnSteps];
            }
        }

        System.out.println("Максимально пройденное колличсетво шагов в месяце: " + max);
    }

    void averageNumberOfSteps(int[][] monthDataArray) {
        int column = 1;
        if (column < 0 || column >= monthDataArray[0].length) {
            throw new IllegalArgumentException("Недопустимый индекс столбца");
        }

        int sum = 0;
        for (int i = 0; i < monthDataArray.length; i++) {
            sum += monthDataArray[i][column];
        }
        int average = sum / monthDataArray.length;
        System.out.println("Среднее количество шагов: " + average);
    }

    void distanceCoveredInKM(int[][] monthDataArray) {
        int j = 0;
        for (int i = 0; i < monthDataArray.length; i++) {
            j += monthDataArray[i][1];
        }
        double distanceInKM = j * 75 / 100000;
        System.out.println("Пройденная кистанция: " + distanceInKM + " Км");
    }

    void calorieIntake(int[][] monthDataArray) {
        int j = 0;
        for (int i = 0; i < monthDataArray.length; i++) {
            j += monthDataArray[i][1];
        }
        int calorieIntake = j * 50;
        System.out.println("Сожженные калории: " + calorieIntake);
    }

    void bestSeriesOfSteps(int[][] monthDataArray, int targetNumberOfSteps) {
        int currentStreak = 0;
        int bestStreak = 0;

        for (int i = 0; i < monthDataArray.length; i++) {
            if (monthDataArray[i][1] > targetNumberOfSteps) {
                currentStreak++;
            } else {
                if (currentStreak > bestStreak) {
                    bestStreak = currentStreak;
                }
                currentStreak = 0;
            }
        }

        if (currentStreak > bestStreak) {
            bestStreak = currentStreak;
        }

        System.out.println("Лучшая серия дней: " + bestStreak);
    }
}
