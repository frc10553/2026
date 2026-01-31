package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Constants;

public class ShooterSubsystem implements Subsystem {
    private final TalonFX leftMotor;
    private final TalonFX rightMotor;
    private final double defaultSpeed = 0.9;

    public ShooterSubsystem() {
        leftMotor = new TalonFX(Constants.CanIDs.SHOOTER_LEFT_MOTOR);
        rightMotor = new TalonFX(Constants.CanIDs.SHOOTER_RIGHT_MOTOR);
        SmartDashboard.putNumber("Shooter Speed", this.defaultSpeed);
    }

    public void startMotor() {
        leftMotor.set(SmartDashboard.getNumber("Shooter Speed", this.defaultSpeed));
    }

    public void stopMotor() {
        leftMotor.set(0);
    }
}
