package libraries.commandBased;

import java.util.ArrayList;

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

    ArrayList<Thread> threads = new ArrayList<Thread>();
    ArrayList<Subsystem> subsystems = new ArrayList<Subsystem>();

    public Command() {
        initialize();
    }

    @Override
    public void run() {
        execute();
        if (isFinished()) {
            for (int i = 0; i < subsystems.size(); i++) {
                subsystems.get(i).runDefault();
            }
        }
    }

    public void start() {
        for (int i = 0; i < subsystems.size(); i++) {
            threads.set(i, subsystems.get(i).setCommand(this));
        }
    }

    protected void requires(Subsystem subsystem) {
        subsystems.add(subsystem);
    }

    public void interrupt() {
        for (Thread t : threads) {
            t.interrupt();
        }
        interrupted();
    }

    protected abstract void initialize();

    protected abstract void execute();

    protected abstract void end();

    protected abstract void interrupted();

    protected abstract boolean isFinished();
}
