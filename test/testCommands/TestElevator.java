package testCommands;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.elevator.ElevatorUp;
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
    public static void testElevatorUp() {
        Command c = new ElevatorUp();
        c.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestElevator.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(Relay.Value.kForward.getV(), CommandBase.elevator.getLeftWheel().get().getV());
        assertEquals(Relay.Value.kForward.getV(), CommandBase.elevator.getRightWheel().get().getV());
        c.cancel();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestElevator.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(Relay.Value.kOff.getV(), CommandBase.elevator.getLeftWheel().get().getV());
        assertEquals(Relay.Value.kOff.getV(), CommandBase.elevator.getRightWheel().get().getV());
    }
}