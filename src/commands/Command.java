package commands;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AtidSpikes
 */
public abstract class Command implements Runnable {

    Thread thread;

    public Command() {
        init();
    }
    
    public void run(){
        execute();
    }
    public void start(){
        thread.run();
    }

    protected abstract void init();

    protected abstract void execute();
}
