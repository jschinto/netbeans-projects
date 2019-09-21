/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorproject;



/**
 *
 * @author jakes_000
 */
public class CalculatorModel {
    public static String operation = "";
    public static Integer num1;
    public static Integer num2;
    public static Integer onScreen = 0;
    public static String sine = "";
    private static CalculatorProjectFrame view;
  
    public static int operate(){
        if(operation == "+"){
            num1 = num1+num2;
            num2 = null;
            onScreen = num1;
            num1 = null;
            return onScreen;
        }
        else if(operation == "-"){
            num1 = num1-num2;
            num2 = null;
            onScreen = num1;
            num1 = null;
            return onScreen;
        }
        else if(operation == "/"){
            num1 = num1/num2;
            num2 = null;
            onScreen = num1;
            num1 = null;
            return onScreen;
        }
        else if(operation == "*"){
            num1 = num1*num2;
            num2 = null;
            onScreen = num1;
            num1 = null;
            return onScreen;
        }
        else if(operation == "C"){
            num1 = null;
            num2 = null;
            onScreen = 0;
            return 0;
        }
        return onScreen;
    }
    public static int checker(Integer yes){
        if(yes == null){
            return setOperand(onScreen);
            
        }
        else{
            onScreen = onScreen * 10;
            onScreen = onScreen + yes;
            return onScreen;
        }
    }
    public static int setOperand(Integer operand){
        if(num1 == null){
            num1 = onScreen;
            onScreen = 0;
            return num1;
        }
        else if(num2 == null){
            num2 = operand;
            onScreen = 0;
            return num2;
        }
        return operate();
    }
    public static int trig(Integer number){
        if(sine == "2"){
            return number*number;
        }
        else if(sine == "s"){
            return (int)Math.sin(Math.toRadians(number));
        }
        else if(sine == "c"){
            return (int)Math.cos(Math.toRadians(number));
        }
        else if(sine == "t"){
            return (int)Math.tan(Math.toRadians(number));
        }
        return number;
    }

}