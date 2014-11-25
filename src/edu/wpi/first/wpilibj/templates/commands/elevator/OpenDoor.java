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
public class OpenDoor extends CommandBase {

    public int i;

    public OpenDoor() {
        requires(door);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        i++;
        door.openDoor();
    }

    @Override
    protected boolean isFinished() {
        if (i > 1000) {
            door.getDoorBottom().set(true);
        }
        return door.isOpen();
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
