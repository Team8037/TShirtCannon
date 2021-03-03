/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.ArcadeDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  private WPI_VictorSPX leftMaster = new WPI_VictorSPX(RobotMap.MOTOR_LEFT_1_ID);
  private WPI_VictorSPX leftSlave = new WPI_VictorSPX(RobotMap.MOTOR_LEFT_2_ID);
  private WPI_VictorSPX rightMaster = new WPI_VictorSPX(RobotMap.MOTOR_RIGHT_1_ID);
  private WPI_VictorSPX rightSlave = new WPI_VictorSPX(RobotMap.MOTOR_RIGHT_2_ID);

  public DifferentialDrive drive = new DifferentialDrive(leftMaster, rightMaster);
  
  public DriveTrain() {
    leftSlave.follow(leftMaster);
    rightSlave.follow(rightMaster);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public void manualDrive(double Move, double Turn){
    if (Math.abs(Move) < 0.025){
      Move = 0;
    }
    if (Math.abs(Turn) < 0.025){
      Turn = 0;
    }

    drive.arcadeDrive(Move, Turn);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ArcadeDrive());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
