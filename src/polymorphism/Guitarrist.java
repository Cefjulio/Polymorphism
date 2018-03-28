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
public interface Guitarrist extends PlaySong{
    public default void playFavoriteSong (){
        System.out.println("Playing my favorite song ");
        PlaySong("My First Song");
    
    }
}
