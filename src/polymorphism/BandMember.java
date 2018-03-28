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
public class BandMember extends Human implements Vocalist, Guitarrist {
    
    public BandMember(String name){
        super(name);
    }
    
    public void printName(){
        System.out.println("Band Member Name: " + name);
    }
    
    public void sing(){
        System.out.println("La la la ");
    }
    
    
    
}
