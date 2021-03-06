/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import libraries.commandBased.Subsystem;
import libraries.digitalInput.DigitalInput;
import libraries.relay.Relay;

/**
 *
 * @author eyal
 */
public class Door extends Subsystem {

    private Relay doorRelay;
    private DigitalInput doorTop;
    private DigitalInput doorBottom;

    public Door(Relay doorRelay, DigitalInput doorTop, DigitalInput doorBottom) {
        this.doorRelay = doorRelay;
        this.doorBottom = doorBottom;
        this.doorTop = doorTop;
    }

    public DigitalInput getDoorTop() {
        return doorTop;
    }

    public DigitalInput getDoorBottom() {
        return doorBottom;
    }

    public Door(int doorRelayPort, int doorTopPort, int doorBottomPort) {
        this(new Relay(doorRelayPort), new DigitalInput(doorTopPort), new DigitalInput(doorBottomPort));
    }

    public void closeDoor() {
        doorRelay.set(Relay.Value.kForward);
    }

    public void openDoor() {
        doorRelay.set(Relay.Value.kReverse);
    }

    public void stop() {
        doorRelay.set(Relay.Value.kOff);
    }

    public boolean isOpen() {
        return doorBottom.get();
    }

    public boolean isClosed() {
        return doorTop.get();
    }

    public Relay getDoorRelay() {
        return doorRelay;
    }

    protected void initDefaultCommand() {
    }

}
