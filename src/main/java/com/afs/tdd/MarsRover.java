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
        switch (command) {
            case "M":
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
                break;
            case "L":
                if ("N".equals(this.getDirection())) {
                    this.direction = "W";
                }
                else if ("W".equals(this.getDirection())) {
                    this.direction = "S";
                }
                else if ("S".equals(this.getDirection())) {
                    this.direction = "E";
                }
                else if ("E".equals(this.getDirection())) {
                    this.direction = "N";
                }
                break;
            case "R":
                if ("N".equals(this.getDirection())) {
                    this.direction = "E";
                }
                else if ("W".equals(this.getDirection())) {
                    this.direction = "N";
                }
                else if ("S".equals(this.getDirection())) {
                    this.direction = "W";
                }
                else if ("E".equals(this.getDirection())) {
                    this.direction = "S";
                }
                break;
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
