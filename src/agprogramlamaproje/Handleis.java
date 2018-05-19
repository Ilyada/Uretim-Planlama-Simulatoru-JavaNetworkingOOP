/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agprogramlamaproje;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 *
 * @author ilyada
 */
public class Handleis extends Thread{
// Lock to control synchronization with this buffer   

    
    
     private final SynchronizedBuffer buf; // reference to shared object

   // constructor
   public Handleis( SynchronizedBuffer shared )
   {
      buf = shared;
   } // end Producer constructor

   
    @Override
    public void run() {
    
        boolean worker=true;
     try // sleep 0 to 3 seconds, then place value in Buffer
         {
         
            boolean work=false;
              for(Isler is:Info.isler){
                   for(Makine makine:Info.makineler){
                            if( !is.isOnprocess() &&
                                    is.getTur().equalsIgnoreCase(makine.getTur()) &&
                                    makine.getDurum().equalsIgnoreCase("EMPTY"))
                            {
            // if( !(is.done || is.onprocess) ){  //worker=false;
                // synchronized(is){
                      synchronized(makine){
                    buf.setis(is,makine);
            /* for(Makine makine:Info.makineler){
                            if( !is.isOnprocess() &&
                                    is.getTur().equalsIgnoreCase(makine.getTur()) &&
                                    makine.getDurum().equalsIgnoreCase("EMPTY"))
                            {            
                                             //buf.setis();        
                                             work=true;
                            }             
             } */
                      }
                // }  
           //  }
         }}}
         
       //  if(!worker) buf.setis();
    
        
        // else
        
        
             
                 
                 
        // buf.setis();
         } // end try
         // if lines 25 or 26 get interrupted, print stack trace
         catch ( Exception exception ) 
         {
            exception.printStackTrace();
         } 
     
    
    
    
    
    
    
    }
    
    
    
}
