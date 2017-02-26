/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readkaro;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadKaro {
        int total= 0;
        BufferedReader reader;
    public static void main(String[] args) {
    try{
      reader = new BufferedReader(new FileReader("C:\\Users\\Sangamesh\\Documents\\NetBeansProjects\\$PROJECTHOME\\ReadKaro\\src\\readkaro\\Ismese"));
        String line = null;
        while ((line = reader.readLine())!= null)
            total += Integer.valueOf(line);
        System.out.println("Total :"+total);
        }
    catch(Exception e){
        System.out.println(e.getMessage());
    }    
     finally{
        try{
            if(reader != null)
                reader.close;
        }   catch(Exception e){
            System.out.println(e.getMessage());
         
     }
    }   
    }
}
