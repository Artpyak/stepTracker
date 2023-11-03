package com.example.stepTracker.messageToTheConsole.impl;

import com.example.stepTracker.messageToTheConsole.ConsoleMessageTemplate;

public class MessageAboutSavingData implements ConsoleMessageTemplate {

    @Override
    public String getTemplate() {
        return "Данные сохранены";
    }
}
