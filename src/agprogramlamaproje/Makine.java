/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agprogramlamaproje;

import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author ilyada
 */
public class Makine {
    public  String ad;
    public int id;
    public  String tur; 
    public int hiz;
    public  String durum;
    public Isler process_is;
    public ArrayList<Isler> yapilanisler=new ArrayList<Isler>();
    
    private Socket client;
    private FrameBehavior myFrame;
    private Socket clientmakine;
    public  ArrayBlockingQueue<String> myInputMessages;
    public  ArrayBlockingQueue<String> myOutputMessages;
    private HandlerReciever handleInput;
    private HandlerSender handleOutput;
    
    
       public Makine(Socket socket ,  FrameBehavior frm)
    {
        client = socket;
        myFrame = frm;
        myInputMessages = new ArrayBlockingQueue(100);
        myOutputMessages = new ArrayBlockingQueue(100);
        if(client != null){
            handleInput = new HandlerReciever(socket, myInputMessages, frm, this,null);
            handleOutput = new HandlerSender(socket, myOutputMessages);
            handleInput.start();
            handleOutput.start();
        }
    }
    
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
  
    
}
