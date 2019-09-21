/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguejungleshoppecontroller;

/**
 *
 * @author jakes_000
 */
public class Extend extends Class {
    String enchant;
    Extend(String n,String s,Integer i,String e){
        super(n,s,i);
        enchant = e;//an extension to the model class
    }
    String enchantee(){
        return enchant;
    }
    String disp(){
        return name+" "+shape+" "+enchant+" "+id;//how i formed my list of strings
    }
}
