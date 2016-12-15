
package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;
import org.usfirst.frc.team2557.robot.commands.ExampleCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
	
	public void Runforward(){
		
		RobotMap.motorBackRight.set((7/8));
		
	}
	public void Runback(){
		
		RobotMap.motorBackRight.set(-.5);
	}
	public void Runfoward(){
		RobotMap.motorBackRight.set(.75);
	}
	public void Trun(){
		RobotMap.turningRight.getAngle();
	}
	public void Here(){
		RobotMap.solei.get();
	}
	public void This(){
		RobotMap.solei.get();
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
		
		setDefaultCommand(new ExampleCommand());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

