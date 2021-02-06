/**
 * This drive command is created to give you an idea of 
 * what a command would look like. It incorporates the 
 * method of the drive subsystem to create a certain 
 * task for the robot.
 */

package frc.robot.commands;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

/**
 * This class refers to the drive subsystem class and the 
 * joystick class and incorporates the functions of them
 * to create the command letting the robot to arcadedrive
 */
public class DriveCommand extends CommandBase {
  
  /** Attributes */
  //declaring the parts you need and follow the pattern
  private final DriveSubsystem m_drive;
  private final Joystick m_OI;
  
  //follow this pattern
  public DriveCommand(DriveSubsystem subsystem, Joystick stick) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drive = subsystem;
    m_OI = stick;
    addRequirements(m_drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }
  
  //This is most applied, letting the subsystem to work with the joystick.
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drive.mArcadeDrive(m_OI);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
