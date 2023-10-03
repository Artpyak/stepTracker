package com.example.stepTracker.messageToTheConsole;

public class RequestForDayEntry implements ConsoleMessageTemplate {
    @Override
    public String getTemplate() {
        return "Введите дату:";
    }
}
