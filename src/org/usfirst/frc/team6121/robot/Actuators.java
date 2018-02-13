package org.usfirst.frc.team6121.robot;

import org.usfirst.frc.team6121.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Solenoid;

public class Actuators {
	//all motors variables get created in this file
	
	//Motors
	private static TalonSRX rightDriveMotor;
	private static TalonSRX rightDriveMotorSlave;
	
	private static TalonSRX leftDriveMotor;
	private static TalonSRX leftDriveMotorSlave;
	
	
	
	//Pneumatics
	private static Solenoid examplePneumatic;
	
	//Initializations
	public static void init(){
		//motors
		rightDriveMotor = new TalonSRX(Constants.RIGHT_FRONT_DRIVE_MOTOR_PORT);
		rightDriveMotorSlave = new TalonSRX(Constants.RIGHT_REAR_DRIVE_MOTOR_PORT);
		rightDriveMotorSlave.follow(rightDriveMotor);
		
		
		leftDriveMotor = new TalonSRX(Constants.LEFT_FRONT_DRIVE_MOTOR_PORT);
		leftDriveMotorSlave = new TalonSRX(Constants.LEFT_REAR_DRIVE_MOTOR_PORT);
		leftDriveMotorSlave.follow(leftDriveMotor);
		//pneumatics
		examplePneumatic = new Solenoid(Constants.EXAMPLE_PNEUMATIC_PORT);
		
	}
	
	//Actuator returns below
	public static TalonSRX getRightDriveMotor(){
		return rightDriveMotor;
	}
	public static TalonSRX getRightDriveMotorSlave(){
		return rightDriveMotorSlave;
	}
	public static TalonSRX getLeftDriveMotor(){
		return leftDriveMotor;
	}
	public static TalonSRX getLeftDriveMotorSlave(){
		return leftDriveMotorSlave;
	}
	
	//Pneumatic returns below
	public static Solenoid getExamplePneumatic(){
		return examplePneumatic;
	}
}
