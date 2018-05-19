/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agprogramlamaproje;

/**
 *
 * @author ilyada
 */
public class Isler {
    int id;
    String tur;
    int isuzunlugu; 
    public boolean done;

    public boolean onprocess;

    public boolean isOnprocess() {
        return onprocess;
    }

    public void setOnprocess(boolean onprocess) {
        this.onprocess = onprocess;
    }

    Isler(int idc,String turc,int uzunlukc,boolean onprocessc){
        id=idc;
        tur=turc;
        isuzunlugu=uzunlukc;
        onprocess=onprocessc;
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

    public int getIsuzunlugu() {
        return isuzunlugu;
    }

    public void setIsuzunlugu(int isuzunlugu) {
        this.isuzunlugu = isuzunlugu;
    }
}
