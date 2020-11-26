package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    public final String EAST = "E";
    public final String WEST = "W";
    public final String NORTH = "N";
    public final String SOUTH = "S";
    public final String MOVE = "M";
    public final String LEFT = "L";
    public final String RIGHT = "R";

    @Test
    public void should_return_y_1_when_execute_command_given_N_0_0_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        // when
        marsRover.executeCommands(MOVE);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }

    @Test
    public void should_return_y_neg_1_when_execute_command_given_S_0_0_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);

        // when
        marsRover.executeCommands(MOVE);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(-1, marsRover.getY());
        assertEquals(SOUTH, marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_when_execute_command_given_E_0_0_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, EAST);

        // when
        marsRover.executeCommands(MOVE);

        // then
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    public void should_return_x_neg_1_when_execute_command_given_W_0_0_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, WEST);

        // when
        marsRover.executeCommands(MOVE);

        // then
        assertEquals(-1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(WEST, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_west_when_execute_command_given_N_0_0_L() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        // when
        marsRover.executeCommands(LEFT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(WEST, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_east_when_execute_command_given_N_0_0_R() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        // when
        marsRover.executeCommands(RIGHT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_north_when_execute_command_given_W_0_0_R() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, WEST);

        // when
        marsRover.executeCommands(RIGHT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_south_when_execute_command_given_W_0_0_L() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, WEST);

        // when
        marsRover.executeCommands(LEFT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(SOUTH, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_east_when_execute_command_given_S_0_0_L() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);

        // when
        marsRover.executeCommands(LEFT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_west_when_execute_command_given_S_0_0_R() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);

        // when
        marsRover.executeCommands(RIGHT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(WEST, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_south_when_execute_command_given_E_0_0_R() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, EAST);

        // when
        marsRover.executeCommands(RIGHT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(SOUTH, marsRover.getDirection());
    }

    @Test
    public void should_return_direction_north_when_execute_command_given_E_0_0_L() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, EAST);

        // when
        marsRover.executeCommands(LEFT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_direction_east_when_execute_command_given_N_0_0_R_M_L_M_R() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        // when
        marsRover.executeCommands(RIGHT+MOVE+LEFT+MOVE+RIGHT);

        // then
        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }
}
