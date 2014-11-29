/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCommands;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.elevator.ElevatorDown;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class TestElevator {

    public TestElevator() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testElevatorDown() {
        ElevatorDown c = new ElevatorDown();
        c.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestElevator.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (c.i <= 1000) {
        }
        assertEquals(Relay.Value.kReverse.getV(), CommandBase.elevator);
    }
}
