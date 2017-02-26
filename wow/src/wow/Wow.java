/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wow;


public class Wow {
    public void showSum(float x, float y, int count)
    {
        if(count < 1)
            return;
        
        float sum = x+y;
        for(i=0 ;i < count, i++)
            System.out.println(sum);
       return;
    }
    public static void main(String[] args) {
    Wow w = new Wow();
    w.showSum(5.3,4.5,3);
    System.out.println("Sysstem out");
    }
    
}
