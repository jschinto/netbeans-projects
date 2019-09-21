/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguejungleshoppecontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 *
 * @author jakes_000
 */
public class LeagueJungleShoppeController {

    private static Class model;
    private static ShoppeView view;
    private static ActionListener actionListener;
    private static Extend extend;
    public static Integer inv = 16;
    public static String[] listi;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        view = new ShoppeView();
        view.setVisible(true);
        //Objects created here:
        Extend poachRune = new Extend("Poacher's Knife","Knife",0,"Runeglaive");
        Extend poachCinder = new Extend("Poacher's Knife","Knife",1,"Cinderhulk");
        Extend poachDevour = new Extend("Poacher's Knife","Knife",2,"Devourer");
        Extend poachWar = new Extend("Poacher's Knife","Knife",3,"Warrior");
        Extend rangerRune = new Extend("Ranger's Trailblazer","Axe",4,"Runeglaive");
        Extend rangerCinder = new Extend("Ranger's Trailblazer","Axe",5,"Cinderhulk");
        Extend rangerDevour = new Extend("Ranger's Trailblazer","Axe",6,"Devourer");
        Extend rangerWar = new Extend("Ranger's Trailblazer","Axe",7,"Warrior");
        Extend skirmishRune = new Extend("Skirmisher's Sabre","Sabre",8,"Runeglaive");
        Extend skirmishCinder = new Extend("Skirmisher's Sabre","Sabre",9,"Cinderhulk");
        Extend skirmishDevour = new Extend("Skirmisher's Sabre","Sabre",10,"Devourer");
        Extend skirmishWar = new Extend("Skirmisher's Sabre","Sabre",11,"Warrior");
        Extend stalkRune = new Extend("Stalker's Blade","Blade",12,"Runeglaive");
        Extend stalkCinder = new Extend("Stalker's Blade","Blade",13,"Cinderhulk");
        Extend stalkDevour = new Extend("Stalker's Blade","Blade",14,"Devourer");
        Extend stalkWar = new Extend("Stalker's Blade","Blade",15,"Warrior");
        //Creating an arraylist because arrays don't work
        ArrayList<String> list = new ArrayList<String>();
        list.add(poachRune.disp());
        list.add(poachCinder.disp());
        list.add(poachDevour.disp());
        list.add(poachWar.disp());
        list.add(rangerRune.disp());
        list.add(rangerCinder.disp());
        list.add(rangerDevour.disp());
        list.add(rangerWar.disp());
        list.add(skirmishRune.disp());
        list.add(skirmishCinder.disp());
        list.add(skirmishDevour.disp());
        list.add(skirmishWar.disp());
        list.add(stalkRune.disp());
        list.add(stalkCinder.disp());
        list.add(stalkDevour.disp());
        list.add(stalkWar.disp());
        view.display.setText(list(list));//Setting the display to the current list
        actionListener = new ActionListener(){//the action listener that actually runs the program
            public void actionPerformed(ActionEvent actionEvent){
                if(actionEvent.getSource() == view.addItem){
                    Extend help = new Extend(view.name.getText(),view.shape.getText(),inv,view.enchant.getText());
                    list.add(help.disp());
                    add();//need to use a function because i can't add to variable not in the main
                    view.itemNumber.setText(inv+" items");
                    view.display.setText(list(list));//list function turns my list of strings into a single string
                }
                else if(actionEvent.getSource() == view.search){
                    view.display.setText(list.get(Integer.valueOf(view.idSearch.getText())));
                }
                else if(actionEvent.getSource() == view.Show){
                    view.display.setText(list(list));
                }
            }
        };
        
        
        view.addItem.addActionListener(actionListener);
        view.search.addActionListener(actionListener);
        view.Show.addActionListener(actionListener);
    }
    static void add(){
        inv = inv+1;
    }
    static String list(ArrayList<String> listy){
        String ret = "";
        for(int i=0;i<listy.size();i++){
            ret += listy.get(i)+"\n";
        }
        return ret;
    }
}
