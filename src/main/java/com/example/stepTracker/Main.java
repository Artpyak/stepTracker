package com.example.stepTracker;


import java.lang.reflect.InvocationTargetException;


public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Controller controller = new Controller();
        controller.actionMenuSelection();
//       StepTracker stepTracker = new StepTracker(); //для создания файла с данными
    }

}
