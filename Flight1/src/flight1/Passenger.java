/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flight1;

public class Passenger {
    public int checkedBags;
    public int freeBags;
    public double perBagFee;
    public float usedCargoSpace;
    public float maxCargoSpace= 1000.0f;
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
     public void Package1(float h, float w, float d){
         float size= h*w*d;
         if (hasCargoSpace(size))
             usedCargoSpace += size;
         else
             handleNoSpace();
     }
     private boolean hasCargoSpace(float size){
         return usedCargoSpace + size <= maxCargoSpace;
     }
     private void handleNoSpace(){
         System.out.println("Space not enough: ");
     }
    public static void main(String[] args) {
    
    }    
}
