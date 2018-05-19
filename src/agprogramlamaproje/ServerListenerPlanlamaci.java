/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agprogramlamaproje;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class ServerListenerPlanlamaci extends Thread {
     private int portnumber;
    private int planlamacicount;
    private FrameBehavior myFrm;
    private ServerSocket serverSocket;

    
    public ServerListenerPlanlamaci(String port, FrameBehavior mFrm)
    {
        Info.isler=new ArrayList<Isler>();
        portnumber =Integer.parseInt( port);
        serverSocket = null;
        planlamacicount = 1;
        Planlamaci g1 = new Planlamaci(null, mFrm);
        Info.planlamacilar = new ArrayList<Planlamaci>();
        Info.planlamacilar.add(g1);
        myFrm = mFrm;
    }
       
     @Override
    public void  run(){

 try
        {
            
            serverSocket = new ServerSocket(portnumber);
            
            
        }
        catch (IOException ioEx)
        {
                System.exit(1);
        }
        
      
             do
             {
            try {
                
                Socket client=null;
                client = serverSocket.accept();
          
                Planlamaci newplanlamaci = new Planlamaci(client, myFrm);
                Info.planlamacilar.add(newplanlamaci);
                planlamacicount++; 
                System.out.println("planlamaci");
     
            } catch (IOException ex) {
                Logger.getLogger(ServerListenerPlanlamaci.class.getName()).log(Level.SEVERE, null, ex);
            }
            
              }while(true);
        
      
            
    }
}
