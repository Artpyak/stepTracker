package com.example.stepTracker.messageToTheConsole;

public class PrintingAnErrorMessage implements ConsoleMessageTemplate {
    @Override
    public String getTemplate() {
        return "Недопустимый вариант\n" +
                "Введите номер действия";
    }
}
