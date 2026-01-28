package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class TransferSubsystem implements Subsystem {
    private final TalonFX leadIndexMotor;
    private final TalonFX followIndexMotor;
    private final TalonFX beltMotor;
    private final double defaultSpeed = 0.9;

    // constructor it will set up or inizalize the object 
    public TransferSubsystem() {
        leadIndexMotor = new TalonFX(102);
        followIndexMotor = new TalonFX(103);
        beltMotor = new TalonFX(104);
        SmartDashboard.putNumber("Transfer Speed", this.defaultSpeed);
    }
}
