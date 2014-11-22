/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testSubsystems;

import edu.wpi.first.wpilibj.templates.subsystems.Door;
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
public class doorTest {

    public doorTest() {
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
    public void openTest() {
        Door door = new Door(0, 0, 0);
        door.openDoor();
        assertEquals(door.isOpen(), true);
    }

    public void closeTest() {
        Door door = new Door(0, 0, 0);
        door.closeDoor();
        assertEquals(door.isClosed(), true);
    }

    public void stopTest() {
        Door door = new Door(0, 0, 0);
        door.stop();
        assertEquals(door.isOpen(), false);
        assertEquals(door.isClosed(), false);
    }
}
