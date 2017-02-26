/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sangamesh
 */
public class MathEquation {
    public double leftVal;
    public double rightVal; 
    public double result;
    public char opCode;
    
    public void execute(){
        switch (opCode)
        {
        case 'a':
            result = leftVal + rightVal;
            break;
        case 's':
            result = leftVal - rightVal;
            break;
        case 'm':
            result = leftVal * rightVal;
            break;
        case 'd':
            result = leftVal / rightVal;
            break;
        default:
            System.out.println("Error invalid opCode");
            result = 0.0d;
    }
          
    }
}
