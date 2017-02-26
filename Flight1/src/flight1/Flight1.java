/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package flight1;
    import static flight1.Flight1.resetAllPassengers;
    import static flight1.Flight1.getAllPassengers;
    public class Flight1 extends Passenger {
      
        int passengers;
        int seats;
        
        public int add1Passenger(){
            if(hasSeating())
            passengers +=1;
            else
            handleTooMany();
            allPassengers += 1;
            return allPassengers;
                   
        }
            
        private boolean hasSeating()
        {
            return passengers < seats;
        }
        private void handleTooMany(){
        System.out.println("TOO MANY PASSENGERS IN THE ABOVE FLIGHT ");
        }
        private int getSeats(){
             return seats;
        }
        private void setSeats(int seats){
             this.seats = seats;
        }
        static int allPassengers;
        static int getAllPassengers(){
             return allPassengers;
        }
        static int resetAllPassengers(){
           return allPassengers=0;}
         
    public static void main(String[] args) {
        resetAllPassengers();
        System.out.println("No of passenger before boarding: "+getAllPassengers());
       
        Flight1 delhi= new Flight1();
        Flight1 mumbai = new Flight1();
        delhi.setSeats(10);
        delhi.getSeats();
        System.out.println("MAXIMUM no of Seats for DELHI flight: "+delhi.getSeats());
        mumbai.setSeats(20);
        System.out.println("MAXIMUM no of Seats for MUMBAI flight: "+mumbai.getSeats());
       
        mumbai.add1Passenger();
        mumbai.add1Passenger();
        mumbai.add1Passenger();
        System.out.println("No of passengers boarding MUMBAI Flight: "+mumbai.passengers);

        mumbai = delhi;
        delhi.add1Passenger();
        delhi.add1Passenger();
        delhi.add1Passenger();
        delhi.add1Passenger();
        delhi.add1Passenger();
        delhi.add1Passenger();
        delhi.add1Passenger();
        delhi.add1Passenger();
        delhi.add1Passenger();
        delhi.add1Passenger();
        System.out.println("No of passengers boarding DELHI Flight: "+delhi.passengers);
        delhi.add1Passenger(); 
        System.out.println("No of passengers boarding DELHI Flight: "+delhi.passengers);
       
        System.out.println("If MUMBAI passengers equals DELHI passengers: "+mumbai.passengers);
       
        Flight1 pune = new Flight1();
        pune.setSeats(30);
        System.out.println("MAXIMUM no of Seats for PUNE flight: "+pune.getSeats());
       
        pune.add1Passenger();
        pune.add1Passenger();
        pune.add1Passenger();
        pune.add1Passenger();
       
        System.out.println("No of passengers boarding PUNE Flight: "+pune.passengers);
       
        System.out.println("Total no of Passengers travelling in AIRPORT: " +getAllPassengers());
        System.out.println("----------------------------------------------------------------------");
      
        System.out.println("DETAILS of Boarding Passengers: ");
        System.out.println("----------------------------------------------------------------------");
       
        Passenger jane = new Passenger(2,3);
           System.out.println("FreeBags allowed: "+jane.freeBags+" Checked Bags: " +jane.checkedBags);
    
        Passenger chuckjoe = new Passenger (2);
           System.out.println("per Bag Fee allowed: "+chuckjoe.perBagFee);
           
        Passenger pandit = new Passenger(3);
          System.out.println("No of Bags: " +pandit.freeBags+" Cost to pay: "+pandit.perBagFee);
          
        Passenger raj = new Passenger(4,3);
          System.out.println("No of Bags: "+raj.freeBags+" No of checked bags: "+raj.checkedBags+" Payment: "+raj.perBagFee);
          
        Passenger pappu = new Passenger(1,5);
          System.out.println("No of bags"+pappu.freeBags+" no of checked bags: "+pappu.checkedBags+" per bag fee:"+pappu.perBagFee);
          
          System.out.println("----------------------------------------------------------------");
          System.out.println("To know about the Cargo Space in FLight: ");
                  
                  
    }
    
    }
    

