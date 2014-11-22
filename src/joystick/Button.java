/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joystick;

import libraries.commandBased.Command;

/**
 *
 * @author ThinkRedstone
 */
public abstract class Button {

    protected Command whenPressed;
    protected Command whileHeld;

    public void whenPressed(Command command) {
        whenPressed = command;
    }

    public void whileHeld(Command command) {
        whileHeld = command;
    }
    public abstract void run();
}
