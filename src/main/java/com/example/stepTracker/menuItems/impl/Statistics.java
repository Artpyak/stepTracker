package com.example.stepTracker.menuItems.impl;

import com.example.stepTracker.HashMapDeserializable;
import com.example.stepTracker.StepTracker;
import com.example.stepTracker.menuItems.MenuItems;
import com.example.stepTracker.messageToTheConsole.impl.MessageAboutTheChoiceOfMonth;

import java.util.HashMap;
import java.util.Scanner;

public class Statistics implements MenuItems {
    int mouthNumber;

    @Override
    public void getMenuItems() {
        monthNumberScanning();
    }

    void monthNumberScanning() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(MessageAboutTheChoiceOfMonth.getTemplate());
        mouthNumber = scanner.nextInt();
        HashMap<Integer, StepTracker.MonthDate> arrayDataMap = HashMapDeserializable.deserializable();
        System.out.println(arrayDataMap.get(mouthNumber).getMonth());
        int[][] monthDataArray = arrayDataMap.get(mouthNumber).getMonthDataArray();

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


}
