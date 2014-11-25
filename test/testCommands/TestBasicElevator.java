/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCommands;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.elevator.CloseDoor;
import java.util.logging.Level;
import java.util.logging.Logger;
import libraries.commandBased.Command;
import libraries.relay.Relay;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ThinkRedstone
 */
public class TestBasicElevator {

    public TestBasicElevator() {
    }

    @BeforeClass
    public static void setUpClass() {
        CommandBase.init();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCloseDoor() {
        CloseDoor command = new CloseDoor();
        command.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestBasicElevator.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(Relay.Value.kForward.getV(), CommandBase.door.getDoorRelay().get().getV());
        while (command.i < 1900) {
        }
        assertEquals(Relay.Value.kOff.getV(), CommandBase.door.getDoorRelay().get().getV());
        assertTrue(CommandBase.door.isClosed());
    }
}
