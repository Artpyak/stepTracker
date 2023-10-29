package com.example.stepTracker.messageToTheConsole.impl;

import com.example.stepTracker.messageToTheConsole.ConsoleMessageTemplate;

public class MonthEntryRequest implements ConsoleMessageTemplate {
    @Override
    public String getTemplate() {
        return "Введите месяц:";
    }
}
