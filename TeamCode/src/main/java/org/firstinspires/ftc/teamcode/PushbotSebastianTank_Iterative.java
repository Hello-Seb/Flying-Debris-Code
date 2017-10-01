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

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcontroller.external.samples.HardwarePushbot;



@TeleOp(name="PushbotSebastianTank: Teleop Tank", group="PushbotSebastianTank")

public class PushbotSebastianTank_Iterative extends OpMode{


    HardwareSebastianbot robot       = new HardwareSebastianbot();






    @Override
    public void init() {

        robot.init(hardwareMap);


        telemetry.addData("Say", "Kyler & Alan are awesome!");
    }


    @Override
    public void init_loop() {
    }


    @Override
    public void start() {
    }


    @Override
    public void loop() {
        double left;
        double right;
        double front;



        left = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;
        front = -gamepad1.right_trigger;

        robot.backleft.setPower(right);
        robot.frontright.setPower(left);
        robot.frontleft.setPower(right);
        robot.backright.setPower(left);

        if (gamepad2.a)  {
            robot.Puncher.setPosition(1.0);
        }
        else if (gamepad2.b) {
            robot.Puncher.setPosition(0.0);
        }
        else {
            robot.Puncher.setPosition(0.5);
        }



        if (gamepad2.right_bumper)  {
            robot.Conveyor.setPosition(1.0);
        }
        else if (gamepad2.right_trigger >0.2) {
            robot.Conveyor.setPosition(0.0);
        }
        else {
            robot.Conveyor.setPosition(0.5);
        }

        if (gamepad2.right_bumper)  {
            robot.Beater.setPosition(0.0);
        }
        else if (gamepad2.right_trigger >0.2) {
            robot.Beater.setPosition(1.0);
        }
        else {
            robot.Beater.setPosition(0.5);
        }


        if (gamepad1.right_bumper) {
            robot.strafe.setPower(1.0);
        }
        else if (gamepad1.left_bumper) {
            robot.strafe.setPower(-1.0);
        }
        else {
            robot.strafe.setPower(0);
        }


        if (gamepad2.left_bumper) {
            robot.catapult.setPower(1.0);
        }
        else if (gamepad2.left_trigger >0.2)  {
            robot.catapult.setPower(-1.0);
        }
        else {
            robot.catapult.setPower(0);
        }

        if (gamepad2.dpad_up) {
            robot.Extender.setPosition(1.0);
        } else if (gamepad2.dpad_down) {
            robot.Extender.setPosition(0.0);
        }
        else {
            robot.Extender.setPosition(0.5);
        }

    }


    @Override
    public void stop() {
    }

}
