package com.example.stepTracker.menuItems.impl;

import com.example.stepTracker.HashMapDeserializable;
import com.example.stepTracker.HashMapSerializable;
import com.example.stepTracker.StepTracker;
import com.example.stepTracker.menuItems.MenuItems;
import com.example.stepTracker.messageToTheConsole.impl.MessageAboutSavingData;
import com.example.stepTracker.messageToTheConsole.impl.MonthEntryRequest;
import com.example.stepTracker.messageToTheConsole.impl.RequestForDayEntry;
import com.example.stepTracker.messageToTheConsole.impl.RequestToEnterTheNumberOfSteps;

import java.io.Serializable;
import java.util.Scanner;

public class NumberOfSteps implements MenuItems, Serializable {

    int steps;
    int data;
    int monthNumber;

    private static final long serialVersionUID = 1L;
    private java.util.HashMap<Integer, StepTracker.MonthDate> hashMap;

    @Override
    public Object getMenuItems() {
        menuItemRetrieval();
        databaseFilling();
        return null; //Исправить поебень с null
    }

    public void menuItemRetrieval() { //Подпункт меню сканирующий: месяц, дату и шаги.
        MonthEntryRequest monthEntryRequest = new MonthEntryRequest();
        RequestForDayEntry requestForDayEntry = new RequestForDayEntry();
        RequestToEnterTheNumberOfSteps requestToEnterTheNumberOfSteps = new RequestToEnterTheNumberOfSteps();
        Scanner scanner = new Scanner(System.in);

        System.out.println(monthEntryRequest.getTemplate());
        monthNumber = scanner.nextInt();
        System.out.println(requestForDayEntry.getTemplate());
        data = scanner.nextInt();
        System.out.println(requestToEnterTheNumberOfSteps.getTemplate());
        steps = scanner.nextInt();
    }

    public void databaseFilling() { //Определяет месяц для заполнения hashMap
        hashMap = HashMapDeserializable.deserializable();
        hashMap.get(monthNumber).arrayFilling(data, steps);
        HashMapSerializable.Serializable(hashMap);

        MessageAboutSavingData messageAboutSavingData = new MessageAboutSavingData();
        System.out.println(messageAboutSavingData.getTemplate());
    }

}
