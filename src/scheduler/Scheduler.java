/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import joystick.Button;

/**
 *
 * @author ThinkRedstone
 */
public class Scheduler {

    public void run() {
        for (Button b : Button.buttons) {
            b.run();
        }
    }
}