package com.example.stepTracker.messageToTheConsole;

public class RequestToEnterTheNumberOfSteps implements ConsoleMessageTemplate {
    @Override
    public String getTemplate() {
        return "Введите количествошагов:";
    }
}
