package org.usfirst.frc.team4787.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4787.robot.RobotMap;
/**
 *
 */
public class RevolverMotor extends Subsystem {

	//private Solenoid sol; 
	private Jaguar revolver;

	public RevolverMotor(int revolverPin) {
		super();
		
		revolver = new Jaguar(revolverPin);
	}
	
	public void set(double speed) {
		//System.out.println("Set revolver motor speed");
		revolver.set(speed);
	}

  public void stop() {
        revolver.set(0);
  }
	
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new MySpecialCommand());
  }
}

