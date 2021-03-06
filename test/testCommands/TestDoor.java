/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCommands;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.elevator.CloseDoor;
import edu.wpi.first.wpilibj.templates.commands.elevator.OpenDoor;
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
public class TestDoor {

    public TestDoor() {
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
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestDoor.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (command.i <= 1000) {
        }
        assertEquals(Relay.Value.kOff.getV(), CommandBase.door.getDoorRelay().get().getV());
        assertTrue(CommandBase.door.isClosed());
    }
    @Test
    public void testOpenDoor(){
        OpenDoor c = new OpenDoor();
        c.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestDoor.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(c.i<=1000){
            
        }
        assertEquals(Relay.Value.kOff.getV(), CommandBase.door.getDoorRelay().get().getV());
        assertTrue(CommandBase.door.isOpen());
    }
}
