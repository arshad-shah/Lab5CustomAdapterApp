package com.example.lab5customadapterapp;

public class nameOfMonth {
    private String nameOfTheMonth;
    private String numberOfTheMonth;

    public nameOfMonth(String nameOfTheMonth, String numberOfTheMonth) {
        setNameOfTheMonth(nameOfTheMonth);
        setNumberOfTheMonth(numberOfTheMonth);
    }

    public String getNameOfTheMonth() {
        return nameOfTheMonth;
    }

    public void setNameOfTheMonth(String nameOfTheMonth) {
        this.nameOfTheMonth = nameOfTheMonth;
    }

    public String getNumberOfTheMonth() {
        return numberOfTheMonth;
    }

    public void setNumberOfTheMonth(String numberOfTheMonth) {
        this.numberOfTheMonth = numberOfTheMonth;
    }
}

