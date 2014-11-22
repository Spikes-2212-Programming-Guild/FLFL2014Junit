/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joystick;

/**
 *
 * @author ThinkRedstone
 */
public class JoystickButton extends Button {

    private final Joystick joystick;
    private final int buttonNum;

    public JoystickButton(Joystick joystick, int buttonNum) {
        this.joystick = joystick;
        this.buttonNum = buttonNum;
    }
}
