/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryan.vashi;

public class Ryan{
     
        int passengers;
        int seats;
       
       
        public static void main(String[] args)
        
        { 
            void add1Passenger()
        {
            if(passengers < seats)
                passengers += 1;
        }
            
            Ryan flight1 = new Ryan();
            Ryan flight2 = new Ryan();
                   flight1.add1Passenger();
            System.out.println(flight1.passengers);
            
            flight2.add1Passenger();
            System.out.println(flight2.passengers);
            
            
            flight1.add1Passenger();
            flight2.add1Passenger();
            
            }
            
        
       }
        
    

