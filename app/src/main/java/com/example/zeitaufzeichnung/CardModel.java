package com.example.zeitaufzeichnung;

public class CardModel {
    String examName;
    String examDate;
    String examMessage;

    public CardModel(String examName, String examDate, String examTitle) {
        this.examName = examName;
        this.examDate = examDate;
        this.examMessage = examTitle;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public String getExamMessage() {
        return examMessage;
    }

    public void setExamMessage(String examMessage) {
        this.examMessage = examMessage;
    }
}
