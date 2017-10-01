/*
Copyright (c) 2016 Robert Atkinson

All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted (subject to the limitations in the disclaimer below) provided that
the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list
of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

Neither the name of Robert Atkinson nor the names of his contributors may be used to
endorse or promote products derived from this software without specific prior
written permission.

NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESSFOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.LightSensor;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous(name = "Red Autonomous", group = "Sebastianbot")
public class SebastianbotAutoDriveByTime_Linear extends LinearOpMode {



    LightSensor LightSensor;
    HardwareSebastianbot robot = new HardwareSebastianbot();
    private ElapsedTime runtime = new ElapsedTime();



    @Override
    public void runOpMode() {




        robot.init(hardwareMap);



        telemetry.addData("Status", "Ready to run");
        telemetry.update();

        LightSensor = hardwareMap.lightSensor.get("light_sensor");


        waitForStart();



        robot.backleft.setPower(0.50);
        robot.frontright.setPower(0.50);
        robot.backright.setPower(0.50);
        robot.frontleft.setPower(0.50);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < .15)) {
            telemetry.addData("Raw", LightSensor.getRawLightDetected());
            telemetry.addData("Normal", LightSensor.getLightDetected());
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }



        robot.backleft.setPower(0.0);
        robot.frontright.setPower(0.0);
        robot.backright.setPower(0.0);
        robot.frontleft.setPower(0.0);
        robot.catapult.setPower(0.33);
        robot.Conveyor.setPosition(1);
        robot.Beater.setPosition(1);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 5)) {  //fire catapult  {
            telemetry.addData("Raw", LightSensor.getRawLightDetected());
            telemetry.addData("Normal", LightSensor.getLightDetected());
            telemetry.addData("Path", "Leg 2: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }


        robot.catapult.setPower(0.0);
        robot.Conveyor.setPosition(0.5);
        robot.Beater.setPosition(0.5);
        robot.backleft.setPower(0.50);
        robot.frontright.setPower(0.50);
        robot.backright.setPower(0.50);
        robot.frontleft.setPower(0.50);
        robot.Puncher.setPosition(-1);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1)) {
            telemetry.addData("Raw", LightSensor.getRawLightDetected());
            telemetry.addData("Normal", LightSensor.getLightDetected());
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.catapult.setPower(0.0);
        robot.Puncher.setPosition(0.5);
        robot.Conveyor.setPosition(0.5);
        robot.backleft.setPower(0);
        robot.frontright.setPower(0);
        robot.backright.setPower(0);
        robot.frontleft.setPower(0);
        robot.strafe.setPower(-.5);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1)) {
            telemetry.addData("Raw", LightSensor.getRawLightDetected());
            telemetry.addData("Normal", LightSensor.getLightDetected());
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }




        robot.catapult.setPower(0.0);
        robot.Conveyor.setPosition(0.5);
        robot.backleft.setPower(1.0);
        robot.frontright.setPower(-1.0);
        robot.backright.setPower(-1.0);
        robot.frontleft.setPower(1.0);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < .6)) {
            telemetry.addData("Raw", LightSensor.getRawLightDetected());
            telemetry.addData("Normal", LightSensor.getLightDetected());
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }



        robot.backleft.setPower(0);
        robot.frontright.setPower(0);
        robot.backright.setPower(0);
        robot.frontleft.setPower(0);
        robot.strafe.setPower(0.5);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 2.85)) {
            telemetry.addData("Raw", LightSensor.getRawLightDetected());
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }





        robot.backleft.setPower(.35);
        robot.frontright.setPower(.35);
        robot.backright.setPower(.35);
        robot.frontleft.setPower(.35);
        robot.strafe.setPower(0.0);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1.8)) {
            telemetry.addData("Raw", LightSensor.getRawLightDetected());
            telemetry.addData("Normal", LightSensor.getLightDetected());
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.backleft.setPower(-.5);
        robot.frontright.setPower(-.5);
        robot.backright.setPower(-.5);
        robot.frontleft.setPower(-.5);
        robot.strafe.setPower(0.0);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < .35)) {
            telemetry.addData("Raw", LightSensor.getRawLightDetected());
            telemetry.addData("Normal", LightSensor.getLightDetected());
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }



        robot.backleft.setPower(0.0);
        robot.frontright.setPower(0.0);
        robot.backright.setPower(0.0);
        robot.frontleft.setPower(0.0);
        robot.strafe.setPower(0.0);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 8)) {
            telemetry.addData("Raw", LightSensor.getRawLightDetected());
            telemetry.addData("Normal", LightSensor.getLightDetected());
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }


        if (LightSensor.getLightDetected() < .2) {
            robot.backleft.setPower(.5);
            robot.frontright.setPower(.5);
            robot.backright.setPower(.5);
            robot.frontleft.setPower(.5);
        }
        else if (LightSensor.getLightDetected()> .2) {
            robot.backleft.setPower(0);
            robot.frontright.setPower(0);
            robot.backright.setPower(0);
            robot.frontleft.setPower(0);
        }
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < .5)) {
            telemetry.addData("Raw", LightSensor.getRawLightDetected());
            telemetry.addData("Normal", LightSensor.getLightDetected());
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }


        robot.backleft.setPower(-.5);
        robot.frontright.setPower(-.5);
        robot.backright.setPower(-.5);
        robot.frontleft.setPower(-.5);
        robot.strafe.setPower(0.0);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 2.1)) {
            telemetry.addData("Raw", LightSensor.getRawLightDetected());
            telemetry.addData("Normal", LightSensor.getLightDetected());
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }


        robot.backleft.setPower(1.0);
        robot.frontright.setPower(-1.0);
        robot.backright.setPower(-1.0);
        robot.frontleft.setPower(1.0);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 4)) {
            telemetry.addData("Raw", LightSensor.getRawLightDetected());
            telemetry.addData("Normal", LightSensor.getLightDetected());
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }




        robot.backleft.setPower(0.0);
        robot.frontright.setPower(0.0);
        robot.backright.setPower(0.0);
        robot.frontleft.setPower(0.0);
        robot.strafe.setPower(0.0);
        telemetry.addData("Raw", LightSensor.getRawLightDetected());
        telemetry.addData("Normal", LightSensor.getLightDetected());




        telemetry.addData("Sebastian is", "an awesome programmer");
        telemetry.update();
        while (opModeIsActive());
    }
}
