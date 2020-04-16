/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trojuhelniky;


/**
 *
 * @author Dan
 */
public class Trojuhelniky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int prvni =5;
        int druhy = 7;
        int druhy1 = 10;
        Trojuhelnik rovnostranny = new Trojuhelnik(prvni) ;
        Trojuhelnik rovnoramenny = new Trojuhelnik (druhy,druhy1);
        Trojuhelnik vlastni      = new Trojuhelnik ((int)2,(int)4,(int)5);
        
        System.out.println("rovnostranny test obvod "+ rovnostranny.getObvod() +" obsah "+ rovnostranny.getObsah() +" Pravoúhlost "+rovnostranny.getJePravy());
       System.out.println("rovnoramenny test obvod "+ rovnoramenny.getObvod() +" obsah "+ rovnoramenny.getObsah() +" Pravoúhlost "+rovnoramenny.getJePravy());
       System.out.println("vlastni test obvod "+ vlastni.getObvod() +" obsah "+ vlastni.getObsah() +" Pravoúhlost "+vlastni.getJePravy());
        
    }
    
}
