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
        if (command.equals("M")) {
            switch (this.getDirection()) {
                case "N":
                    this.yPosition++;
                    break;
                case "S":
                    this.yPosition--;
                    break;
                case "E":
                    this.xPosition++;
                    break;
                case "W":
                    this.xPosition--;
                    break;
            }
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
