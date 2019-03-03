
//The code that is required for the robot to be identified and function.

package org.firstinspires.ftc.teamcode.Outreach_Robots;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name = "Tiny_Tank", group= "team")
public class Tiny_Tank extends OpMode {

    //Introduces the programmable parts of the robot and sets different variables.

    Servo Servoleft;
    Servo Servoright;
   // DcMotor Relay;

    double relayset = 0;
    private int currentstep = 0;

    //Initializes the different movable parts of the robot and sets the direction.

    public void init() {
        Servoleft = hardwareMap.servo.get("Servoleft");
        Servoleft.setDirection(Servo.Direction.FORWARD);

        Servoright = hardwareMap.servo.get("Servoright");
        Servoright.setDirection(Servo.Direction.FORWARD);

      //  Relay = hardwareMap.dcMotor.get("Relay");
      //  Relay.setDirection(DcMotorSimple.Direction.FORWARD);

    }

    //Start of the actual code.

    public void loop () {

        //Sets the relay's power to speed.

      //  Relay.setPower(relayset);

        //Allows you to press one button to turn on or off the relay.

    /*    if (currentstep == 0){
            if (gamepad1.a){
                Relay.setPower(relayset = 1);
                currentstep ++;
            }
        }

        if (currentstep == 1){
            if(gamepad1.a){
                Relay.setPower(relayset = 0);
                currentstep --;
            }
        }*/

        //The code that allows the wheels to be controlled by the joysticks on the controllers.

        double joy = gamepad1.right_stick_y;

        double Valadjust = (joy * joy * joy) / 2 + 0.5;

        double Joy = gamepad1.left_stick_y;

        double ValAdjust = (Joy * Joy * Joy) / 2 + 0.5;

        Servoright.setPosition(ValAdjust);
        Servoleft.setPosition(Valadjust);


    }
}
