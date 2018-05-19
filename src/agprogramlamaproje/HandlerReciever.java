/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agprogramlamaproje;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class HandlerReciever extends Thread{
    private Socket client;
    private Scanner input;
  //  private PrintWriter output;
    private ArrayBlockingQueue<String> myMessages;
    private FrameBehavior myFrame;
    private Makine me;
        private Planlamaci planlamaci;

    
    
    public HandlerReciever(Socket socket , ArrayBlockingQueue<String> msg , 
            FrameBehavior frm , Makine c,Planlamaci p)
    {
        //Set up reference to associated socket...
        client = socket;
        myMessages = msg;
        myFrame = frm;
        if(c ==null)planlamaci=p;
        else
        me = c;
        
        try
        {
            input = new Scanner(client.getInputStream());
        }
        catch(IOException ioEx)
        {
        }
    } 
    public void run()
    {
        String received;
        do
        {
            received = input.nextLine();     
           if(received != null && received != ""){
              
               if(me != null)
                   myFrame.makeActionMakine(received, me);
               else 
                   myFrame.makeActionPlanlamaci(received, planlamaci);

             
           }
           received = "";

        }while (!received.equals("QUIT"));

        try
        {
            if (client!=null)
            {
                System.out.println("Closing down connection...");
                client.close();
            }
        }
        catch(IOException ioEx)
        {
                System.out.println("Unable to disconnect!");
        }
    } 
}
