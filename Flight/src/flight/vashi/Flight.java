/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flight.vashi;

/**
 *
 * @author Sangamesh
 */
public class Flight {

    private int passengers;
    private int seats;
     public Flight(){
         passengers= 0;
         seats= 150;
     }
     public void add1Passenger()
     {
         if (passengers < seats)
             passengers += 1;
         else
             handleTooMany();
     }
     
     private void handleTooMany()
     {
         System.out.println("Too Many");
     }
     
     public boolean hasRoom(Flight f2){
         int total = passengers + f2.passengers;
        return total <= seats;
     }
     
     return Flight createNewWithBoth(Flight f2)
     {
         Flight newFlight= new Flight();
         newFlight.seats= seats;
         newFlight.passengers= passengers + f2.passengers;
         return newFlight;
                 
     }
    public static void main(String[] args) {
    Flight flight1 = new Flight();
    flight1.add1Passenger();
    
    Flight lax1= new Flight();
    Flight lax2= new Flight();
    
    Flight lax3= null;
    if(lax1.hasRoom(lax2))
        lax3 = lax1.createNewWithBoth(lax2);

    
    
    }
    
}
