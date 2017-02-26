/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lawrence.vashi;

public class Lawrence  {
    public static void main(String[] args) {
     
        //double[] leftVals= {100.0,25.0,15.0,20.0};
        //double[] rightVals={20.0,30.0,10.0,5.0};
        //char[] opCodes ={'d','b','m','a'};
        //double[] results = new  double[opCodes.length];
        
        
        //double val1=100;
       //double val2=50;
       //double result;
       //char opCode='j';
       MathEquation[] equations = new MathEquation[4];
       equations[0] = create(100.0,20.0,'d');
       equations[1] = create(25.0,30.0,'s');
       equations[2] = create(15.0,10.0,'m');
       equations[3] = create(20.0,5.0,'a');         
              
       for(MathEquation equation : equations) {
           equation.execute();
           System.out.println("result =");
           System.out.println(equation.result);
    }
public static MathEquation create(double leftVal, double rightVal, char opCode) {
    MathEquation equation = new MathEquation();
    equation.leftVal = leftVal; 
    equation.rightVal = rightVal;    
    equation.opCode = opCode;
    return  equation;
}
}