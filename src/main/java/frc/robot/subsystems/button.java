package frc.robot.subsystems;
//import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.XboxController;
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
public class button {
    boolean getXButtonPressed;
    boolean getYButtonPressed;
    XboxController Xbox = new XboxController(0); // 0 is the USB Port to be used as indicated on the Driver Station
    private int CAN_ID_1 = 0;
    // private final WPI_TalonSRX motor = new WPI_TalonSRX(CAN_ID_1);
    private final WPI_TalonFX motor = new WPI_TalonFX(CAN_ID_1);
}
public void main(){
    if (getXButtonPressed = true){
         // should i use getAButton to check the last time the A button was pressed

        /*motor.set(TalonSRXControlMode.Current, 10.0);
        motor.set(TalonSRXControlMode.PercentOutput, 75.0);
        motor.set(TalonSRXControlMode.Velocity, 75.0);
        motor.set(TalonSRXControlMode.Position, 75.0); */
        motor.set(TalonFXCotrolMode.PercentOutput, 100.0);
        System.out.println("Motor is spinning");

        {
             else(getXButtonPressed = false){
            motor.stopMotor();
            System.out.println("Motor is not spinning");
         }
        
        if (getYButtonPressed = true){
            // could I just set the motor as motor.setInverted(true);
           /* motor.setInverted(TalonSRXControlMode.Current, 10.0);
            motor.setInverted(TalonSRXControlMode.PercentOutput, 75.0);
            motor.setInverted(TalonSRXControlMode.Velocity, 75.0);
            motor.setInverted(TalonSRXControlMode.Position, 75.0);*/
            motor.setInverted(TalonFXCotrolMode.PercentOutput, 100.0);
            System.out.println("Motor is spinning");
          {  

            else(getYButtonPressed = false){
                motor.stopMotor();
                System.out.println("Motor is not spinning");
        }

        
        if (getYButtonPressed && getXButtonPressed){
            motor.stopMotor();
        }
}