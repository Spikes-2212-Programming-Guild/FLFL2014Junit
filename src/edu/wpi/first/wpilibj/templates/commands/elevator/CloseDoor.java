/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.elevator;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author eyal
 */
public class CloseDoor extends CommandBase {

    public int i;

    public CloseDoor() {
        requires(door);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        i++;
        door.closeDoor();
    }

    @Override
    protected boolean isFinished() {
        if (i > 10000) {
            //assumes we got there for testing
            door.getDoorTop().set(true);
        }
        return door.isClosed();
    }

    @Override
    protected void end() {
        door.stop();
    }

    @Override
    protected void interrupted() {
        end();
    }

}


// CHOO CHOO MOTHA