/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agprogramlamaproje;

import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author ilyada
 */
public class Planlamaci {
    private Socket client;
    private FrameBehavior myFrame;
    private Socket clientmakine;
    public  ArrayBlockingQueue<String> myInputMessages;
    public  ArrayBlockingQueue<String> myOutputMessages;
    private HandlerReciever handleInput;
    private HandlerSender handleOutput;
    
    
       public Planlamaci(Socket socket ,  FrameBehavior frm)
    {
        client = socket;
        myFrame = frm;
        myInputMessages = new ArrayBlockingQueue(100);
        myOutputMessages = new ArrayBlockingQueue(100);
        if(client != null){
            handleInput = new HandlerReciever(socket, myInputMessages, frm, null,this);
            handleOutput = new HandlerSender(socket, myOutputMessages);
            handleInput.start();
            handleOutput.start();
        }
    }
}
