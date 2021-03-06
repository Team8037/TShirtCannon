/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  //USB
  public static final int JOYSTICK_ID = 1;


  public static final int TUBE_1_BUTTON_ID = 3;
  public static final int TUBE_2_BUTTON_ID = 4;
  public static final int TUBE_3_BUTTON_ID = 5;
  public static final int TUBE_4_BUTTON_ID = 6;
  
  //Controller Values 
  public static final int Y_AXIS_ID = 1;
  public static final int X_AXIS_ID = 0; 
  public static final int Z_AXIS_ID = 2;
  
  //CAN
  public static final int MOTOR_RIGHT_1_ID = 3;
  public static final int MOTOR_LEFT_1_ID = 1;
  public static final int MOTOR_LEFT_2_ID = 2;
  public static final int MOTOR_RIGHT_2_ID = 4;

  //SOLENOIDS
  public static final int TUBE_1_ID = 1;
  public static final int TUBE_2_ID = 2;
  public static final int TUBE_3_ID = 0;
  public static final int TUBE_4_ID = 3;

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
