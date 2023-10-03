package com.example.stepTracker.messageToTheConsole;

public class MonthEntryRequest implements ConsoleMessageTemplate {
    @Override
    public String getTemplate() {
        return "Введите месяц:";
    }
}
