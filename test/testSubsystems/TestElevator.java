/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testSubsystems;

import static edu.wpi.first.wpilibj.templates.commands.CommandBase.elevator;
import edu.wpi.first.wpilibj.templates.subsystems.Elevator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Developer
 */
public class TestElevator {

    public TestElevator() {
    }

    @BeforeClass
    public static void setUpClass() {
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
    public void testUp() {
        Elevator elevator = new Elevator(1, 1);
        elevator.goUp();
        assertEquals(elevator.isUp(), true);
    }

    public void testDown() {
        Elevator elevator = new Elevator(1, 1);
        elevator.goDown();
        assertEquals(elevator.isDown(), true);
    }

}
