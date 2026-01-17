package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Subsystem;

public class ShooterSubsystem implements Subsystem {
    private final TalonFX motor;

    // constructor
    public ShooterSubsystem() {
        motor = new TalonFX(30);
    }

    public void startMotor() {
        motor.set(-1);
    }

    public void stopMotor() {
        motor.set(0);
    } 
}
