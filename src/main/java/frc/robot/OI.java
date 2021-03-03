/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.Solenoid1_Forward;
import frc.robot.commands.Solenoid1_Reverse;
import frc.robot.commands.Solenoid2_Forward;
import frc.robot.commands.Solenoid2_Reverse;
import frc.robot.commands.Solenoid3_Forward;
import frc.robot.commands.Solenoid3_Reverse;
import frc.robot.commands.Solenoid4_Forward;
import frc.robot.commands.Solenoid4_Reverse;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public static final Joystick joystick = new Joystick(RobotMap.JOYSTICK_ID);
  public static final JoystickButton tube1button = new JoystickButton(joystick, RobotMap.TUBE_1_BUTTON_ID);
  public static final JoystickButton tube2button = new JoystickButton(joystick, RobotMap.TUBE_2_BUTTON_ID);
  public static final JoystickButton tube3button = new JoystickButton(joystick, RobotMap.TUBE_3_BUTTON_ID);
  public static final JoystickButton tube4button = new JoystickButton(joystick, RobotMap.TUBE_4_BUTTON_ID);

  public double GetJoystickRawAxis(final int axis){
    return joystick.getRawAxis(axis);
  }
  public OI(){
    tube1button.whenPressed(new Solenoid1_Forward());
    tube1button.whenReleased(new Solenoid1_Reverse());
    tube2button.whenPressed(new Solenoid2_Forward());
    tube2button.whenReleased(new Solenoid2_Reverse());
    tube3button.whenPressed(new Solenoid3_Forward());
    tube3button.whenInactive(new Solenoid3_Reverse());
    tube4button.whenPressed(new Solenoid4_Forward());
    tube4button.whenReleased(new Solenoid4_Reverse());
  }
  
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
