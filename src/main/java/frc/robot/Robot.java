// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
//import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
//import edu.wpi.first.wpilibj.motorcontrol
/**
 * This is a demo program showing the use of the DifferentialDrive class, specifically it contains
 * the code necessary to operate a robot with tank drive.
 */
import com.revrobotics.CANSparkLowLevel.MotorType;
public class Robot extends TimedRobot {
  private Joystick m_leftStick;
  private Joystick m_rightStick;
  private XboxController controller; 
  private Climber Climby;

  // cole was here
 
  //private MotorType MyMotor = new kBrushless();

  private final WPI_VictorSPX m_leftMotor = new WPI_VictorSPX(1);
  private final WPI_VictorSPX m_left2Motor = new WPI_VictorSPX(2);
  private final WPI_VictorSPX m_rightMotor = new WPI_VictorSPX(3);
  private final WPI_VictorSPX m_right2Motor = new WPI_VictorSPX(4);
  private final CANSparkMax m_upMotor = new CANSparkMax(5,MotorType.kBrushless);

 public double circumfrence(int radius) {

    return 2*3*radius;

  }

  @Override
  public void robotInit() {
    //SendableRegistry.addChild(m_robotDrive, m_leftMotor);
    //SendableRegistry.addChild(m_robotDrive, m_rightMotor);
    
    m_leftStick = new Joystick(0);
    m_rightStick = new Joystick(1);
    controller = new XboxController(2);

    Climby = new Climber(m_upMotor, m_rightStick, m_leftStick);

    double ballsCircumfrence = circumfrence(5);
    
    // We need to invert one side of the drivetrain so that positive voltages
    // result in both sides moving forward. Depending on how your robot's
    // gearbox is constructed, you might have to invert the left side instead.

    //m_robotDrive = new DifferentialDrive(m_leftMotor::set, m_rightMotor::set);
  

  }

// Look, I made a change!
// :) :)

  @Override
  public void teleopPeriodic() {
    //m_robotDrive.tankDrive(-m_leftStick.getY(), -m_rightStick.getY());
    m_leftMotor.set(-m_leftStick.getY());
    //m_rightMotor.set(-0.2);
    m_left2Motor.set(-m_leftStick.getY());
    
   // m_left2Motor.set(1);

    m_rightMotor.set(-m_rightStick.getY());
    //m_rightMotor.set(-0.2);
    m_right2Motor.set(-m_rightStick.getY());
    
    Climby.Joystick_up_down();
    //m_leftStick.button(0, null)
    if(m_leftStick.getRawButtonPressed(0)==true)
    {

    }
  
    //m_rightStick.button(0, null)
    if(m_rightStick.getRawButtonPressed(0)==true)
    {

    }
    /*
    if(myVairable == 2) {
      console.print("hello world");
    } else {
      console.print("error! :(");
    }
*/

    /* 
    if(-m_leftStick.getY() != 0) {
      m_leftMotor.set(0.2);
    } else if (-m_leftStick.getY() == 0) {
      m_leftMotor.set(0);
    }
    */
  }
}
