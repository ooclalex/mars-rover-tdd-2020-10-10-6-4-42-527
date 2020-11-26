package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private int xPosition;
    private int yPosition;
    private String direction;

    public MarsRover(int xPosition, int yPosition, String direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public void executeCommands(String commands) {
        Arrays.asList(commands.split("")).forEach(this::executeCommand);
    }

    public void executeCommand(String command) {
        if (command.equals("M") && this.getDirection().equals("N")) {
            this.yPosition++;
        } else if (command.equals("M") && this.getDirection().equals("S")) {
            this.yPosition--;
        }
    }

    public int getX() {
        return this.xPosition;
    }

    public int getY() {
        return this.yPosition;
    }

    public String getDirection() {
        return this.direction;
    }
}
