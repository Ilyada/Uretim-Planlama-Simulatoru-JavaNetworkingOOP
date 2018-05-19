package agprogramlamaproje;


// Fig. 26.20: SynchronizedBuffer.java
// Synchronizes access to a shared integer using the Lock and Condition
// interfaces
import agprogramlamaproje.Buffer;
import agprogramlamaproje.Handleis;
import agprogramlamaproje.Info;
import agprogramlamaproje.Isler;
import agprogramlamaproje.Makine;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SynchronizedBuffer implements Buffer
{
   // Lock to control synchronization with this buffer   
   private final Lock accessLock = new ReentrantLock();

   // conditions to control reading and writing
   public final Condition canWrite = accessLock.newCondition();
   public final Condition canRead = accessLock.newCondition();

   private int buffer = -1; // shared by producer and consumer threads
   private boolean occupied = false; // whether buffer is occupied
   

    @Override
    public void setis(Isler is,Makine hedefmakine) throws InterruptedException {
       // accessLock.lock(); // lock this object
               
      // output thread information and buffer information, then wait
      try
      {
   
       if(Info.isler.size()>0 && Info.makineler.size()>0){ 
            Process newprocess=is_ata(is,hedefmakine);
            
            if(newprocess != null){
            Handledone hd=new Handledone(ServerPanel.sharedLocation,newprocess.getIs(),newprocess.getMak());
            hd.start();
            }
       }
      //ServerPanel.handleis.run();

       
        
        // displayState( "Producer writes " + buffer );

         // signal thread waiting to read from buffer
        
      } // end try
      finally
      {
      //   accessLock.unlock(); // unlock this object
      } // end finally
    }

    @Override
    public void getdone(Isler hedefis,Makine hedefmakine) throws InterruptedException {

      //  accessLock.lock(); // lock this object

      // output thread information and buffer information, then wait
      try
      {
         /*  // if there is no data to read, place thread in waiting state
         while ( !occupied ) 
         {
          
            System.out.println( "Consumer tries to read." );
            displayState( "Buffer empty. Consumer waits." );
            canRead.await(); // wait until buffer is full
         } // end while */

         // indicate that producer can store another value 
         // because consumer just retrieved buffer value
         istamamla(hedefis,hedefmakine);
        // readValue = buffer; // retrieve value from buffer
       //  displayState( "Consumer reads " + readValue );

         // signal thread waiting for buffer to be empty
         
       //  canWrite.signal();
    //   ServerPanel.handleis.start();
      // ServerPanel.handleis.run();
        ServerPanel.handleis = new Handleis(ServerPanel.sharedLocation);
        ServerPanel.handleis.start();
      } // end try
      finally
      {
      //   accessLock.unlock(); // unlock this object
      } // end finally

    }
    
    
       
   // display current operation and buffer state
   public void displayState( String operation )
   {
      System.out.printf( "%-40s%d\t\t%b\n\n", operation, buffer, 
         occupied );
   } // end method displayState

   public Process is_ata(Isler is,Makine makine) throws InterruptedException{
              
       
           // for(Isler is:Info.isler){
                  // while buffer is not empty, place thread in waiting state
              
                if(!is.onprocess)
                {
                    
                    if(kontrolmakine(is)){
                      /*  for(Makine makine:Info.makineler){
                            if( !is.isOnprocess() &&
                                    is.getTur().equalsIgnoreCase(makine.getTur()) &&
                                    makine.getDurum().equalsIgnoreCase("EMPTY"))
                            { */
                                
                                makine.setDurum("BUSY");
                                is.onprocess=true;
                                makine.process_is = is;
                                
                                Process newprocess= new Process(is,makine);
                                return newprocess;

                           //     notifyAll(); //signal sallancak bitmiş kontrolü için!
                           // }
                          
                       // if(is.isOnprocess()) break;       
                    
                       // }     
                }
                   /* else { 
                        try {
                                while(!kontrolmakine(is)){
                                    
                                    this.wait();
                                    //canWrite.await();// wait until buffer is empty

                                }
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Handleis.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    } */
                }
      //    }
          return null;
   }
   
   public boolean kontrolmakine(Isler is){

                        for(Makine makine:Info.makineler){
                            if( !is.isOnprocess() &&
                                    is.getTur().equalsIgnoreCase(makine.getTur()) &&
                                    makine.getDurum().equalsIgnoreCase("EMPTY"))
                            {
                                return true;
                            }
                        }
               return false;             
   } 

    private void istamamla(Isler hedefis,Makine hedefmakine) {
                    if(hedefmakine.process_is !=null ){
                         
                         try { 
                             Thread.sleep(hedefmakine.process_is.getIsuzunlugu()*hedefmakine.getHiz());
                             hedefmakine.setDurum("EMPTY");
                             hedefmakine.yapilanisler.add(hedefmakine.process_is);
                             hedefmakine.process_is.done=true;
                             //System.out.println(hedefmakine.getAd()+" isimli makine : "+ hedefmakine.process_is.id+"'idli"+hedefmakine.process_is.getTur()+"isini Tamamladı!.");
                             hedefmakine.process_is=null;
                           
                             
                         } catch (Exception ex) {
                             Logger.getLogger(Handledone.class.getName()).log(Level.SEVERE, null, ex);
                         }
                         
                         
                     }


    }
   
} // end class SynchronizedBuffer


/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/