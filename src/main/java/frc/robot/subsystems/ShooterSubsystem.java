package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class ShooterSubsystem implements Subsystem {
    private final TalonFX leftShooterMotor;
    private final TalonFX rightShooterMotor;
    private final TalonFX hoodMotor;
    private final double defaultSpeed = 0.9;

    // constructor
    public ShooterSubsystem() {
        leftShooterMotor = new TalonFX(100);
        rightShooterMotor = new TalonFX(101);
        hoodMotor = new TalonFX(102);
        SmartDashboard.putNumber("Shooter Speed", this.defaultSpeed);
    }

    public void startMotor() {
        leftShooterMotor.set(SmartDashboard.getNumber("Shooter Speed", this.defaultSpeed));
        rightShooterMotor.set(SmartDashboard.getNumber("Shooter Speed", this.defaultSpeed));
    }

    public void stopMotor() {
        leftShooterMotor.set(0);
        rightShooterMotor.set(0);
    } 
}
