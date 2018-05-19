/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agprogramlamaproje;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ilyada
 */
public class Handledone extends Thread{

    private final Makine makine;
    private final Isler is;
    private final SynchronizedBuffer buf; // reference to shared object


  
    public Handledone(SynchronizedBuffer shared,Isler gelenis,Makine mak){
            makine=mak;
            buf = shared;
            is=gelenis;
    }
    
    @Override
    public void run() {

       try // sleep 0 to 3 seconds, then place value in Buffer
         {
         synchronized(makine){
         buf.getdone(is, makine);
         }
         } // end try
         // if lines 25 or 26 get interrupted, print stack trace
         catch ( Exception exception ) 
         {
            exception.printStackTrace();
         } 
    
    }
    
    
}
