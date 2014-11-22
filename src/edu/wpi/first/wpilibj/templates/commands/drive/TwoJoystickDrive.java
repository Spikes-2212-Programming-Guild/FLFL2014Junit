/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.drive;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author dvir42
 */
public class TwoJoystickDrive extends CommandBase {

    public TwoJoystickDrive() {
        requires(driveTrain);
    }
    
    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        driveTrain.twoJoystickDrive(oi.getLeftY(), oi.getRightY());
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        driveTrain.twoJoystickDrive(0, 0);
    }

    @Override
    protected void interrupted() {
        end();
    }
    
}
