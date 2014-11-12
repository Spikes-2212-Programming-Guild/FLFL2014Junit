/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.commandBased;

import java.util.ArrayList;

/**
 *
 * @author 207797739
 */
public class CommandGroup extends Command {

    private ArrayList<ArrayList<Command>> commands = new ArrayList<>();
    private int currentCommandBlock = 0;
    //-1 for no block is running
    private int runningBlock = -1;

    protected void addParallel(Command command) {
        commands.get(currentCommandBlock).add(command);
    }

    protected void addSequential(Command command) {
        addParallel(command);
        commands.add(new ArrayList<>());
        currentCommandBlock++;
    }

    private void runBlock(int blockNum) {
        runningBlock = blockNum;
        for (Command c : commands.get(blockNum)) {
            c.start();
        }
    }

    private boolean blockFinished(int blockNum) {
        if (blockNum > -1) {
            return commands.get(blockNum).get(commands.get(blockNum).size() - 1).isFinished();
        } else {
            return true;
        }
    }

    @Override
    protected void initialize() {
        commands.add(new ArrayList<>());
    }

    @Override
    protected void execute() {
        if (blockFinished(runningBlock)) {
            runningBlock++;
            runBlock(runningBlock);
        }
    }

    @Override
    protected void end() {
        runningBlock = -1;
    }

    @Override
    protected void interrupted() {
        end();
    }

    @Override
    protected boolean isFinished() {
        return blockFinished(commands.get(commands.size()-1).size());
    }

}