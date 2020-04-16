/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trojuhelniky;
import java.util.*;

/**
 *
 * @author Dan
 */
public class Trojuhelnik {
   int stranaA;
   int stranaB;
   int stranaC;
   private int soucetStran;
   private double obsah;
   private boolean jePravy; 
   //rovnostranny
public Trojuhelnik(int strana) {
    stranaA = strana;
    stranaB=  strana;
    stranaC = strana;
    soucetStran = 3*strana;
  
    setObsah();
}
//Rovnoramenny
public Trojuhelnik(int rameno, int zakladna){
    this.stranaA = this.stranaB =rameno;
    this.stranaC =zakladna;
    this.soucetStran = (rameno*2)+zakladna;
    setObsah();
}
// Ruznostranny
public Trojuhelnik(int sA, int sB, int sC){
   stranaA=sA;
    stranaB=sB;
    stranaC=sC;
   soucetStran = sA+sB+sC;
    setObsah();
    
}
    //obsah
    private void setObsah(){
        double s = ((this.soucetStran)/2.0);
        this.obsah = Math.sqrt(s*(s-this.stranaA)*(s-this.stranaB)*(s-this.stranaC));
    }
    //Get
    public int getObvod(){
        return soucetStran;
    }
    //obsah
    public double getObsah(){
        return obsah;
    }
    //pravost
    public boolean getJePravy(){
        ArrayList<Integer> seznam = new ArrayList();
        seznam.add(stranaA);
        seznam.add(stranaB);
        seznam.add(stranaC);
        Collections.sort(seznam);
        
        if((seznam.get(0)*seznam.get(0))+ (seznam.get(1)*seznam.get(1)) == (seznam.get(2)*(seznam.get(2)) )){
            return true;
        }
        else{
            return false;
        }
    }
}

