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
public class CommandGroup extends Command{
    private ArrayList<ArrayList<Command>> commands = new ArrayList<>();
    private int currentCommandBlock = 0;
    private int runningBlock=-1;
    
    protected void addParallel(Command command){
        commands.get(currentCommandBlock).add(command);
    }
    protected void addSequential(Command command){
        addParallel(command);
        commands.add(new ArrayList<>());
        currentCommandBlock++;
    }
    
    private void runBlock(){
        
    }
    
    @Override
    protected void initialize() {
        commands.add(new ArrayList<>());
    }

    @Override
    protected void execute() {
        
    }

    @Override
    protected void end() {
    }

    @Override
    protected void interrupted() {
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
    
}
