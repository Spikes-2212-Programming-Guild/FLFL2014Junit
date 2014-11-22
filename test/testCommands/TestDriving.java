/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCommands;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.drive.DriveStraight;
import libraries.commandBased.Command;
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
public class TestDriving {

    public TestDriving() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        CommandBase.init();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    //TODO find why it doesnt work
    @Test
    public void testDriveStraight() {
        Command command = new DriveStraight();
        command.start();
        assertEquals(1, CommandBase.driveTrain.getLeft().getBack().get(), 0);
        assertEquals(-1, CommandBase.driveTrain.getRight().getBack().get(), 0);
        assertEquals(1, CommandBase.driveTrain.getLeft().getFront().get(), 0);
        assertEquals(-1, CommandBase.driveTrain.getRight().getFront().get(), 0);
    }
}
