package frc.robot.subsystems;
import edu.wipi.first.wpilibj.XboxController;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.hal.FRCNetComm.tResourceType;
import edu.wpi.first.hal.HAL;
import edu.wpi.first.wpilibj.SpeedController;
public class Joystick {
//use gyroscope

    private final XboxController Xbox = new XboxController(0);
    private int CAN_ID_1 = 0;
    private final WPI_TalonFX motor = new WPI_TalonFX(CAN_ID_1);
    //I want to square the joy stick imputs so first i have to get the imputs
    // by  private int CAN_ID_1 = 0;getRightTriggerAxis() And then i have to
    //square the values so so the motor has a more gradual speed change. It gets faster

}
public void Drive(){
    motor.setInverted(true);
}
public void main(double speed){
    motor.setInverted(pid.calculate(encoder.getDistance(), setpoint));
    motor.setInverted(TalonFXControlMode.PercentOutput, speed);

}

public double getLeftStickAxis(){
    getLeftStickAxis = speed;
    speed = new Math.pow(speed, speed);
    System.out.println("speed:" + speed);
    return;
}

