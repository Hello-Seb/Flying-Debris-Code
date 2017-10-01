package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.LightSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;


public class HardwareSebastianbot
{

    public DcMotor  backleft   = null;
    public DcMotor  frontright  = null;
    public DcMotor  catapult  = null;
    public DcMotor  strafe  = null;
    public DcMotor  frontleft = null;
    public DcMotor  backright = null;
    public Servo Conveyor = null;
    public Servo Beater = null;
    public Servo Puncher = null;
    public Servo Extender = null;

    public LightSensor lightSensor = null;


    HardwareMap hwMap           =  null;
    private ElapsedTime period  = new ElapsedTime();




    public HardwareSebastianbot(){

    }


    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;




        backleft   = hwMap.dcMotor.get("backLeft");
        frontright  = hwMap.dcMotor.get("frontRight");
        catapult  = hwMap.dcMotor.get("catapult");
        strafe  = hwMap.dcMotor.get("strafe");
        backright = hwMap.dcMotor.get ("backRight");
        frontleft  = hwMap.dcMotor.get("frontLeft");
        Conveyor = hwMap.servo.get("Conveyor");
        Beater = hwMap.servo.get("Beater");
        Puncher = hwMap.servo.get("Puncher");
        Extender = hwMap.servo.get("Extender");
        backleft.setDirection(DcMotor.Direction.FORWARD);
        frontright.setDirection(DcMotor.Direction.REVERSE);
        catapult.setDirection(DcMotor.Direction.REVERSE);
        strafe.setDirection(DcMotor.Direction.FORWARD);
        frontleft.setDirection(DcMotor.Direction.FORWARD);
        backright.setDirection(DcMotor.Direction.REVERSE);
        Conveyor.setDirection(Servo.Direction.REVERSE);
        Puncher.setDirection(Servo.Direction.FORWARD);


        lightSensor = hwMap.lightSensor.get("light_sensor");
        backleft.setPower(0);
        frontright.setPower(0);
        catapult.setPower(0);
        strafe.setPower(0);
        frontleft.setPower(0);
        backright.setPower(0);
        Conveyor.setPosition(0.5);
        Beater.setPosition(0.5);
        Puncher.setPosition(0.5);
        Extender.setPosition(0.5);








    }



    public void waitForTick(long periodMs) {

        long  remaining = periodMs - (long)period.milliseconds();


        if (remaining > 0) {
            try {
                Thread.sleep(remaining);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }


        period.reset();
    }
}

