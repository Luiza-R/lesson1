package ru.geekbrains.qa.java2.lesson1;

public class Player {
    private boolean success;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean s) {
        this.success = s;
    }

    public String getName() {
        return name;
    }
}
