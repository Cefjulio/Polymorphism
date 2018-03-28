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
public interface PlaySong {
    
    public default void PlaySong(String songName){
          System.out.println("Playing " + songName);
    }
    
}
