/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marys.vashi;

/**
 *
 * @author Sangamesh
 */
public class Marys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valA=10;
        int valB=20;
        int valC=30;
        int valD=40;
        int result1= valA + valB *valC;
        int result2= (valA + valB) *valC;
        int result3= valA / valB * valC + valD;
        
        int a= 60;
        long b= a;
        
        long c= 21;
        int d=(int)c;
        
        int result4= valA / (valB * (valC + valD));
        
        int ass= 29;
        int boot= 40;
        int diff;
        
        float students= 30.0;
        float rooms= 4.0;
        
         if (ass < boot)
             System.out.println("Ass is small i.e = "+ass);
         
         
       else
             System.out.println("boot is small i.e="+boot);
        
     System.out.println(result1);
     System.out.println(result2);
     System.out.println(result3);
     System.out.println(result4);   
    System.out.println(b);   
    System.out.println(d);   
    
    if (rooms> 0.0)
    {
    System.out.println(students);
        System.out.println(rooms);
        float avg = students/rooms;
        
        System.out.println(avg);
    }
    }
    
}
