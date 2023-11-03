package com.example.stepTracker.messageToTheConsole.impl;

import com.example.stepTracker.messageToTheConsole.ConsoleMessageTemplate;

public class MenuMessageTemplateToConsole implements ConsoleMessageTemplate {
    public String getTemplate() {
        return "Выберите номер действия:\n" +
                "1. Ввести количество шагов за определённый день;\n" +
                "2. Напечатать статистику за определённый месяц;\n" +
                "3. Изменить цель по количеству шагов;\n" +
                "4. Выйти из приложения;";
    }
}
