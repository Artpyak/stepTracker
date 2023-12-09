package com.example.stepTracker.menuItems.impl;

import com.example.stepTracker.TargetNumberOfSteps;
import com.example.stepTracker.menuItems.MenuItems;

import java.util.Scanner;

public class DailyGoal implements MenuItems {
    @Override
    public void getMenuItems() {
        changingTheTargetNumberOfSteps();
    }

    void changingTheTargetNumberOfSteps() {
      System.out.println("Целевое количество шагов на данный момент " + TargetNumberOfSteps.readingTheNumberOfSteps() + "\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Изменение целевого количества шагов: ");
        int targetNumberOfSteps = scanner.nextInt();
        TargetNumberOfSteps.savingTheNumberOfSteps(targetNumberOfSteps);
      // System.out.println(TargetNumberOfSteps.readingTheNumberOfSteps());
    }
}
