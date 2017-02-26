/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passenger;


public class Passenger {
    private int checkedBags;
    private int freeBags;
    private double perBagFee;
    public Passenger()
    {
    }
    public Passenger(int freeBags){
        this(freeBags > 1 ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }
    public Passenger(int freebags, int checkedBags){
        this(freebags);
        this.checkedBags = checkedBags;
    }
    private Passenger(double perBagFee){
        this.perBagFee = perBagFee;
    }
    public static void main(String[] args) {
    
        
        Passenger jane = new Passenger(2,3);
           System.out.println("FreeBags allowed: "+jane.freeBags+" Checked Bags: " +jane.checkedBags);
    
         Passenger chuckjoe = new Passenger (0.01d);
           System.out.println("per Bag Fee allowed: "+chuckjoe.perBagFee);
           
         Passenger pandit = new Passenger(3);
          System.out.println("No of Bags: " +pandit.freeBags+" Cost to pay: "+pandit.perBagFee);
          
          Passenger raj = new Passenger(4,3);
          System.out.println("No of Bags: "+raj.freeBags+" No of checked bags: "+raj.checkedBags+" Payment: "+raj.perBagFee);
          
          Passenger pappu = new Passenger(1,5);
          System.out.println("No of bags"+pappu.freeBags+" no of checked bags: "+pappu.checkedBags+" per bag fee:"+pappu.perBagFee)
    
    }
    
}
