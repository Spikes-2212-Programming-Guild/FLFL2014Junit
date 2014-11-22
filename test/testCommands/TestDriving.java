/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCommands;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.drive.DriveRotate;
import edu.wpi.first.wpilibj.templates.commands.drive.DriveStraight;
import edu.wpi.first.wpilibj.templates.commands.drive.TwoJoystickDrive;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    //@Test
    public void testTwoJoystickDrive() {
        Command command = new TwoJoystickDrive();
        command.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestDriving.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(1, CommandBase.driveTrain.getLeft().getBack().get(), 0);
        assertEquals(1, CommandBase.driveTrain.getRight().getBack().get(), 0);
        assertEquals(1, CommandBase.driveTrain.getLeft().getFront().get(), 0);
        assertEquals(1, CommandBase.driveTrain.getRight().getFront().get(), 0);
    }

    //@Test
    public void testDriveRotate() {
        Command command = new DriveRotate();
        command.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestDriving.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(1, CommandBase.driveTrain.getLeft().getBack().get(), 0);
        assertEquals(1, CommandBase.driveTrain.getRight().getBack().get(), 0);
        assertEquals(1, CommandBase.driveTrain.getLeft().getFront().get(), 0);
        assertEquals(1, CommandBase.driveTrain.getRight().getFront().get(), 0);
    }

    //TODO find why it doesnt work
    //@Test
    public void testDriveStraight() {
        Command command = new DriveStraight();
        command.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestDriving.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(1, CommandBase.driveTrain.getLeft().getBack().get(), 0);
        assertEquals(-1, CommandBase.driveTrain.getRight().getBack().get(), 0);
        assertEquals(1, CommandBase.driveTrain.getLeft().getFront().get(), 0);
        assertEquals(-1, CommandBase.driveTrain.getRight().getFront().get(), 0);
    }
}
