/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author auyon.j6356
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Human john = new Human("john");
        Human luis = new BandMember ("luis");
        BandMember jack = new BandMember("jack");
        
        john.printName();
        luis.printName();
        jack.printName();
        
        jack.sing();
        jack.playFavoriteSong();
        
        
        
        
        
    }
    
}
