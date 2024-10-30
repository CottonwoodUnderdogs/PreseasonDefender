package frc.robot;

import java.util.Set;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.Joystick;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Climber {
     private  CANSparkMax m_upMotor;
      private Joystick m_rightStick;
      private Joystick m_leftStick;

      //Constructor
      public Climber(CANSparkMax A, Joystick B, Joystick C) {
        m_upMotor = A;
        m_leftStick = B;
        m_rightStick = C;
      }

public void Joystick_up_down() {

    if(m_leftStick.getRawButton(4)==true && m_rightStick.getRawButton(5)==false  ) {
        m_upMotor.set(0.8);  }
   
    if(m_leftStick.getRawButton(4)==false && m_rightStick.getRawButton(5)==false  ) {
        m_upMotor.set(0);  }

    if(m_leftStick.getRawButton(4)==false && m_rightStick.getRawButton(5)==true  ) {
       m_upMotor.set(-0.8);  }

    if(m_leftStick.getRawButton(4)==true && m_rightStick.getRawButton(5)==true  ) {
        m_upMotor.set(0);  }
    }

    }



/* 
  
 if(m_rightStick.getRawButton(5)==true && left==false){
  m_upMotor.set(0.6);

  } else {
   
    m_upMotor.set(0);
  }
  if(m_leftStick.getRawButton(5)==true){
  m_upMotor.set(-0.6);

  } else {
    m_upMotor.set(0);
  }

}
*/





  
    








   