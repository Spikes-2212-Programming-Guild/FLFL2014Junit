/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.digitalInput;

/**
 *
 * @author eyal
 */
public class DigitalInput {

    private boolean state;

    public DigitalInput(int port) {
    }

    public boolean get() {
        return state;
    }

    public void set(boolean state) {
        state = state;
    }

}
