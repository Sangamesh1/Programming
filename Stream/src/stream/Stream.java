/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;
import java.io.*;
import java.io.IOException;
public class Stream {
    public static void main(String[] args) {
       //doTryCatchFinally();
      // doTryWithResourcesMulti();
       doCloseThing();
    }
    public static void doTryCatchFinally(){
        char[] buff=new char[8];
        int length;
        Reader reader = null;
        try {
            reader = Helper.openReader("file1.txt");
            while((length = reader.read(buff)) >= 0){
                System.out.println("\n Length" + length);
                for(int i=0; i<length; i++)
                System.out.println(buff[i]);
            }
        }catch(IOException e){
            System.out.println("e.getClass().getSimpleName()"+" - "+e.getMessage());
        }finally{
            try{
                if(reader != null)
                    reader.close();
            }catch (IOException e2){
                
            System.out.println("e2.getClass().getSimpleName()"+" - "+e2.getMessage());
            }
        }
    }
    
    public void doTryWithResources()
    {
        char[] buff=new char[8];
        int length;
        try (Reader reader = Helper.openReader("file1.txt"))
            ){
            while((length = reader.read(buff)) >= 0){
                System.out.println("\n Length" + length);
                for(int i=0; i<length; i++)
                System.out.println(buff[i]);
            }
        }catch(IOException e){
            System.out.println("e.getClass().getSimpleName()"+" - "+e.getMessage());
        }
    }   
    
    public void doTryWithResourcesMulti(){
        {
        char[] buff=new char[8];
        int length;
        try (Reader reader = Helper.openReader("file1.txt");
             Writer writer  = Helper.openReader("file2.txt"))
            {
            while((length = reader.read(buff)) >= 0){
                System.out.println("\n Length" + length);
               writer write(buff, 0, length);
            }
        }catch(IOException e){
            System.out.println("e.getClass().getSimpleName()"+" - "+e.getMessage());
        }
    }   
    
    }
    
    private static void doCloseThing(){
        try(AutoClosable ac = new AutoClosable())
        {ac.saySomething();
        }catch(IOException e){
            System.out.println("e.getClass().getSimpleName()"+" - "+e.getMessage());
                }
            
    }   
    
    
    }

