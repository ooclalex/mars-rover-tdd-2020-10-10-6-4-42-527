package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    public final String EAST = "E";
    public final String WEST = "W";
    public final String NORTH = "N";
    public final String SOUTH = "S";
    public final String MOVE = "M";
    public final String LEFT = "L";
    public final String RIGHT = "R";
    private int xPosition;
    private int yPosition;
    private String direction;

    public MarsRover(int xPosition, int yPosition, String direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    // this should appear when last test case appears
    public void executeCommands(String commands) {
        Arrays.asList(commands.split("")).forEach(this::executeCommand);
    }

    public void executeCommand(String command) {
        switch (command) {
            case MOVE:
                this.moveForward();
                break;
            case LEFT:
                this.turnLeft();
                break;
            case RIGHT:
                this.turnRight();
        }
    }

    private void turnRight() {
        switch (this.getDirection()) {
            case NORTH:
                this.direction = EAST;
                break;
            case EAST:
                this.direction = SOUTH;
                break;
            case SOUTH:
                this.direction = WEST;
                break;
            case WEST:
                this.direction = NORTH;
                break;
        }
    }

    private void turnLeft() {
        switch (this.getDirection()) {
            case NORTH:
                this.direction = WEST;
                break;
            case WEST:
                this.direction = SOUTH;
                break;
            case SOUTH:
                this.direction = EAST;
                break;
            case EAST:
                this.direction = NORTH;
                break;
        }
    }

    private void moveForward() {
        switch (this.getDirection()) {
            case NORTH:
                this.yPosition++;
                break;
            case SOUTH:
                this.yPosition--;
                break;
            case EAST:
                this.xPosition++;
                break;
            case WEST:
                this.xPosition--;
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
