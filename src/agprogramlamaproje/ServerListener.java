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
public class ServerListener extends Thread {
     private int portnumber;
    private int makineCount;
    private FrameBehavior myFrm;
    private ServerSocket serverSocket;

    
    public ServerListener(String port, FrameBehavior mFrm)
    {
        
        portnumber =Integer.parseInt( port);
        serverSocket = null;
       // Makine g1 = new Makine(null, mFrm);
        Info.makineler = new ArrayList<Makine>();
       // Info.makineler.add(g1);
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
      
                Makine newmakine = new Makine(client, myFrm);
                Info.makineler.add(newmakine);
                
                System.out.println("makine");

            } catch (IOException ex) {
                Logger.getLogger(ServerListener.class.getName()).log(Level.SEVERE, null, ex);
            }
            
              }while(true);
        
      
            
    }
}
