/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

/**
 *
 * @author AtidSpikes
 */
public class Subsystem {

    private Thread thread;
    private Command currentCommand;

    public Thread setCommand(Command command) {
        currentCommand.interrupt();
        currentCommand = command;
        thread = new Thread(command);
        return thread;
    }

}
