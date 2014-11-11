/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.relay;

/**
 *
 * @author Developer
 */
public class Relay {
    
    private Value value;
    
    public Relay(int port){
    }
    
    public void set(Value value){
        this.value = value;
    }
    
    public static class Value {
        public static Value kOn;
        public static Value kOff;
        public static Value kForward;
        public static Value kReverse;
    }
    
    public Value get() {
        return value;
    }
        
}
