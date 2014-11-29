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
public class ElevatorDown extends CommandBase {

    public int i;

    public ElevatorDown() {
        requires(elevator);
    }

    protected void initialize() {
    }

    protected void execute() {
        i++;
        elevator.goDown();
    }

    protected void end() {
        elevator.stop();
    }

    public void interrupted() {
        end();
    }

    public boolean isFinished() {
        if (i > 1000) {
            elevator.getBottom().set(true);
        }
        return elevator.isDown();
    }

}
