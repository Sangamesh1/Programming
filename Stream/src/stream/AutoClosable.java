/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
public class AutoClosable implements AutoCloseable {
   public void saySomething() throws IOException{
       System.out.println("Something");
   }
   @Override
  public void close() throws IOException{
      System.out.println("close");
  }
}
