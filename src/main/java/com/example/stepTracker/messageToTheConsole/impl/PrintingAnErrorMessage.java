package com.example.stepTracker.messageToTheConsole.impl;

import com.example.stepTracker.messageToTheConsole.ConsoleMessageTemplate;

public class PrintingAnErrorMessage implements ConsoleMessageTemplate {
    @Override
    public String getTemplate() {
        return "Недопустимый вариант\n" +
                "Введите номер действия";
    }
}
