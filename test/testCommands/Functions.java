/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCommands;

import java.util.logging.Level;
import java.util.logging.Logger;
import libraries.commandBased.Command;

/**
 *
 * @author ThinkRedstone
 */
public class Functions {

    public static void runCommand(Command c) {
        c.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
