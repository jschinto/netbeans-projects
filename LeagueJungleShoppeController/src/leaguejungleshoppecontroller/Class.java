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
public class Class {
    String name;
    String shape;//My model Class.  I had one called ShoppeModel but i deleted it and used this
    Integer id;
    Class(String n, String s, Integer i){
        name = n;
        shape = s;
        id = i;//constructor
    }
    String namee(){
        return name;
    }
    String shapee(){//returns (Methods?)
        return shape;
    }
    Integer idee(){
        return id;
    }
}
