package testSubsystems;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.wpi.first.wpilibj.templates.subsystems.DriveTrain;
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
public class TestDriveTrain {

    public TestDriveTrain() {
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
    // @Test
    // public void hello() {}
    @Test
    public void testRotate() {
        DriveTrain driveTrain = new DriveTrain(0, 0, 0, 0, 0, 0, 0);
        for (double i = -1; i <= 1; i += 0.001) {
            driveTrain.rotate(i);
            assertEquals(i, driveTrain.getLeft().getBack().get(), 0);
            assertEquals(i, driveTrain.getRight().getBack().get(), 0);
            assertEquals(i, driveTrain.getLeft().getFront().get(), 0);
            assertEquals(i, driveTrain.getRight().getFront().get(), 0);
        }
    }

    @Test
    public void testStraight() {
        DriveTrain driveTrain = new DriveTrain(0, 0, 0, 0, 0, 0, 0);
        for (double i = -1; i <= 1; i += 0.001) {
            driveTrain.straight(i);
            assertEquals(i, driveTrain.getLeft().getBack().get(), 0);
            assertEquals(-i, driveTrain.getRight().getBack().get(), 0);
            assertEquals(i, driveTrain.getLeft().getFront().get(), 0);
            assertEquals(-i, driveTrain.getRight().getFront().get(), 0);
        }
    }

    @Test
    public void testTwoJoystickDrive() {
        DriveTrain driveTrain = new DriveTrain(0, 0, 0, 0, 0, 0, 0);
        for (double i = -1; i <= 1; i += 0.1) {
            for (double j = -1; j <= 1; j += 0.1) {
                driveTrain.twoJoystickDrive(i, j);
                assertEquals(i, driveTrain.getLeft().getBack().get(), 0);
                assertEquals(j, driveTrain.getRight().getBack().get(), 0);
                assertEquals(i, driveTrain.getLeft().getFront().get(), 0);
                assertEquals(j, driveTrain.getRight().getFront().get(), 0);
            }
        }
    }

    @Test
    public void testSet() {
        DriveTrain driveTrain = new DriveTrain(0, 0, 0, 0, 0, 0, 0);
        for (double i = -1; i <= 1; i += 0.1) {
            driveTrain.set(i);
            assertEquals(i, driveTrain.getLeft().getBack().get(), 0);
            assertEquals(-i, driveTrain.getRight().getBack().get(), 0);
            assertEquals(i, driveTrain.getLeft().getFront().get(), 0);
            assertEquals(-i, driveTrain.getRight().getFront().get(), 0);
        }
    }

}
