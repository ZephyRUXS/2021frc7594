/**
 * This drive subsystem is created to give you an idea of 
 * what a subsystem would look like. It abstracts the 
 * drive base of the 19 season robot into a java file.
 */

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * This class has four Victor SP motors which are then
 * integrated into one thing called m_drive. m_drive 
 * represents the whole base. It let the m_drive to
 * conduct arcade drive.
 */
public class DriveSubsystem extends SubsystemBase {
  /** Attributes */

  //the Victor SP motor on the left in the front with the port 0
  VictorSP m_frontLeft = new VictorSP(0);

  //the Victor SP motor on the left at the back with the port 1
  VictorSP m_backLeft = new VictorSP(1);

  //combining the two motors on the left
  SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, 
  m_backLeft);

  //same as above
  VictorSP m_frontRight = new VictorSP(2);
  VictorSP m_backRight = new VictorSP(3);
  SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, 
  m_backRight);
  
  //Tntegrate all into a DifferentialDrive instance
  // which is able to conduct the arcadeDrive method.
  //This indicates the whole base.
  private final DifferentialDrive m_drive = new DifferentialDrive
  (m_left, m_right);


  /** Methods */

  /**
   * let the base perform arcadeDrive based on the 
   * input of joysticks
   * 
   * @param joy the joystick
   */
  public void mArcadeDrive(Joystick joy){
    m_drive.arcadeDrive(joy.getY() * -0.6, joy.getZ() * 0.5);
  }
  
  /**
   * the slow version of arcadeDrive
   * 
   * @param joy the joystick
   */
  public void mArcadeDriveSlow(Joystick joy){
    m_drive.arcadeDrive(joy.getY() * -0.4, joy.getZ() * 0.3);
  }  
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
