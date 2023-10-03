package com.example.stepTracker;

import com.example.stepTracker.menuItems.*;
import com.example.stepTracker.menuItems.impl.DailyGoal;
import com.example.stepTracker.menuItems.impl.Exit;
import com.example.stepTracker.menuItems.impl.NumberOfSteps;
import com.example.stepTracker.menuItems.impl.Statistics;

import java.lang.reflect.InvocationTargetException;

public enum ActionMenuSelection {
    NUMBER_OF_STEPS(1, NumberOfSteps.class),
    STATISTICS(2, Statistics.class),
    DAILY_GOAL(3, DailyGoal.class),
    EXIT(4, Exit.class);

    private int typeCode;
    private Class<? extends MenuItems> menuItems;

    ActionMenuSelection(int typeCode, Class<? extends MenuItems> menuItems) {
        this.typeCode = typeCode;
        this.menuItems = menuItems;
    }

    public static ActionMenuSelection getTemplateByCode(int typeCode) {
        for (ActionMenuSelection type : ActionMenuSelection.values()){
            if (type.typeCode == typeCode) {
                return type;
            }
        }
        throw new RuntimeException("Вариант не найден");
    }

    public MenuItems getMenuItemsEnum() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return menuItems.getDeclaredConstructor().newInstance();
    }

}
