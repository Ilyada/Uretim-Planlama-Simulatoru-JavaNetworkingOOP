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

    final class Process {
    private final Isler is;
    private final Makine mak;

    public Process(Isler isler, Makine makine) {
        this.is = isler;
        this.mak = makine;
    }

    public Isler getIs() {
        return is;
    }

    public Makine getMak() {
        return mak;
    }

}
