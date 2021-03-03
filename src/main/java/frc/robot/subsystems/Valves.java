/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Valves extends Subsystem {
 public DoubleSolenoid solenoid1 = new DoubleSolenoid(RobotMap.TUBE_1_ID, RobotMap.TUBE_1_ID, RobotMap.TUBE_1_ID);
 public DoubleSolenoid solenoid2 = new DoubleSolenoid(RobotMap.TUBE_2_ID, RobotMap.TUBE_2_ID, RobotMap.TUBE_2_ID);
 public DoubleSolenoid solenoid3 = new DoubleSolenoid(RobotMap.TUBE_3_ID, RobotMap.TUBE_3_ID, RobotMap.TUBE_3_ID);
 public DoubleSolenoid solenoid4 = new DoubleSolenoid(RobotMap.TUBE_4_ID, RobotMap.TUBE_4_ID, RobotMap.TUBE_4_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public void ActuateSolenoid (final boolean ON, final boolean OFF){

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for  a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
