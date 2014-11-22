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

    public abstract void whenPressed(Command command);

    public abstract void whileHeld(Command command);
}
