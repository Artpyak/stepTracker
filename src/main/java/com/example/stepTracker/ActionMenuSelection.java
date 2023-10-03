package com.example.stepTracker;

import com.example.stepTracker.menuItems.*;

public enum ActionMenuSelection {
    NUMBER_OF_STEPS(0, NumberOfSteps.class),
    STATISTICS(1, Statistics.class),
    DAILY_GOAL(2, DailyGoal.class),
    EXIT(3, Exit.class);

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

    public MenuItems getNumberOfSteps() throws IllegalAccessException, InstantiationException {
        return menuItems.newInstance();
    }

}
