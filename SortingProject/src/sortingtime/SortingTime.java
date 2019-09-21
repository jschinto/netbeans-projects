/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtime;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author jakes_000
 */
public class SortingTime {
    private static SortingTimeView view;
    private static SortingTimeModel model;
    private static ActionListener actionListener;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        view = new SortingTimeView();
        view.setVisible(true);
        actionListener = new ActionListener(){//the action listener that actually runs the program
            public void actionPerformed(ActionEvent actionEvent){
                if((String)view.type.getSelectedItem()==("Selection")){//tells what type input is
                    view.output.setText(view.output.getText()+model.selectionSort(view.input.getText())+"\n");
                }
                else if((String)view.type.getSelectedItem()==("Insertion")){
                    view.output.setText(view.output.getText()+model.insertionSort(view.input.getText())+"\n");
                }
                else if((String)view.type.getSelectedItem()==("Merge")){
                    view.output.setText(view.output.getText()+model.mergeSort(view.input.getText())+"\n");
                }
                else if((String)view.type.getSelectedItem()==("Bubble")){
                    view.output.setText(view.output.getText()+model.bubbleSort(view.input.getText())+"\n");
                }
            }
        };
        view.submit.addActionListener(actionListener);
    }
    
}
