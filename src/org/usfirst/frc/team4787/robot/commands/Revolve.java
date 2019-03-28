package org.usfirst.frc.team4787.robot.commands;

import org.usfirst.frc.team4787.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Revolve extends Command {
    
    public Revolve() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.m_revolver);

    }

    protected void initialize() {  
	
    }

    public void start() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.m_revolver.set(0.5);
        Thread revolverThread = new Thread() {
            public void run() {
              try {
                // 1.5 second wait
                Thread.sleep(1500);
                Robot.m_revolver.stop();
              }
              catch(InterruptedException v) {
                System.out.print(v);
              }
            }
          };
          revolverThread.start();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    }

    // Called once after isFinished returns true
    protected void end() {
      Robot.m_Cannon.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
