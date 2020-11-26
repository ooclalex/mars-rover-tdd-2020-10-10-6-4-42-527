package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    @Test
    public void should_return_y_1_when_execute_command_given_N_0_0_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.executeCommands("M");

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_y_neg_1_when_execute_command_given_S_0_0_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.executeCommands("M");

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(-1, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_when_execute_command_given_E_0_0_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.executeCommands("M");

        // then
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }
}
