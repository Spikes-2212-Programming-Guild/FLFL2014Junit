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

    private ArrayList<Thread> threads = new ArrayList<Thread>();
    private ArrayList<Subsystem> subsystems = new ArrayList<Subsystem>();
    private boolean interrupted;

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
            cancel();
        }
    }

    public void start() {
        for (int i = 0; i < subsystems.size(); i++) {
            threads.set(i, subsystems.get(i).setCommand(this));
        }
        interrupted = false;
        threads.get(0).start();
    }

    protected void requires(Subsystem subsystem) {
        subsystems.add(subsystem);
    }

    public void interrupt() {
        interrupted();
        interrupted = true;
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).interrupt();
            //resets the threads
            threads.set(i, null);
        }
    }

    public boolean isInterrupted() {
        return interrupted;
    }

    public void cancel() {
        end();
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).interrupt();
            //resets the threads
            threads.set(i, null);
        }
    }

    protected abstract void initialize();

    protected abstract void execute();

    protected abstract void end();

    protected abstract void interrupted();

    protected abstract boolean isFinished();
}
