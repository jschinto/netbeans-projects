/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jakes_000
 */
public class CalculatorProject {

    private static CalculatorModel model;
    private static CalculatorProjectFrame view;
    private static ActionListener actionListener;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        view = new CalculatorProjectFrame();
        view.setVisible(true);
        model = new CalculatorModel();
        actionListener = new ActionListener(){
            public void actionPerformed(ActionEvent actionEvent){
                if(actionEvent.getSource() == view.ButtonOne){
                    view.DisplayBox.setText(String.valueOf(model.checker(1)));
                }
                else if(actionEvent.getSource() == view.ButtonTwo){
                    view.DisplayBox.setText(String.valueOf(model.checker(2)));
                }
                else if(actionEvent.getSource() == view.ButtonThree){
                    view.DisplayBox.setText(String.valueOf(model.checker(3)));
                }
                else if(actionEvent.getSource() == view.ButtonFour){
                    view.DisplayBox.setText(String.valueOf(model.checker(4)));
                }
                else if(actionEvent.getSource() == view.ButtonFive){
                    view.DisplayBox.setText(String.valueOf(model.checker(5)));
                }
                else if(actionEvent.getSource() == view.ButtonSix){
                    view.DisplayBox.setText(String.valueOf(model.checker(6)));
                }
                else if(actionEvent.getSource() == view.ButtonSeven){
                    view.DisplayBox.setText(String.valueOf(model.checker(7)));
                }
                else if(actionEvent.getSource() == view.ButtonEight){
                    view.DisplayBox.setText(String.valueOf(model.checker(8)));
                }
                else if(actionEvent.getSource() == view.ButtonNine){
                    view.DisplayBox.setText(String.valueOf(model.checker(9)));
                }
                else if(actionEvent.getSource() == view.ButtonZero){
                    view.DisplayBox.setText(String.valueOf(model.checker(0)));
                }
                else if(actionEvent.getSource() == view.PlusButton){
                    view.DisplayBox.setText("+");
                    model.checker(null);
                    model.operation = "+";
                }
                else if(actionEvent.getSource() == view.MinusButton){
                    view.DisplayBox.setText("-");
                    model.checker(null);
                    model.operation = "-";
                }
                else if(actionEvent.getSource() == view.DivideButton){
                    view.DisplayBox.setText("/");
                    model.checker(null);
                    model.operation = "/";
                }
                else if(actionEvent.getSource() == view.MultiplyButton){
                    view.DisplayBox.setText("*");
                    model.checker(null);
                    model.operation = "*";
                }
                else if(actionEvent.getSource() == view.ClearButton){
                    view.DisplayBox.setText("0");
                    model.checker(null);
                    model.operation = "C";
                    model.operate();
                }
                else if(actionEvent.getSource() == view.EqualsButton){
                    view.DisplayBox.setText("=");
                    model.checker(null);
                    view.DisplayBox.setText(String.valueOf(model.operate()));
                }
                else if(actionEvent.getSource() == view.square){
                    model.sine = "2";
                    model.onScreen = model.trig(model.onScreen);
                    view.DisplayBox.setText(String.valueOf(model.onScreen));
                }
                else if(actionEvent.getSource() == view.sin){
                    model.sine = "s";
                    model.onScreen = model.trig(model.onScreen);
                    view.DisplayBox.setText(String.valueOf(model.onScreen));
                }
                else if(actionEvent.getSource() == view.cos){
                    model.sine = "c";
                    model.onScreen = model.trig(model.onScreen);
                    view.DisplayBox.setText(String.valueOf(model.onScreen));
                }
                else if(actionEvent.getSource() == view.tan){
                    model.sine = "t";
                    model.onScreen = model.trig(model.onScreen);
                    view.DisplayBox.setText(String.valueOf(model.onScreen));
                }
            }
        };
        view.ButtonOne.addActionListener(actionListener);
        view.ButtonTwo.addActionListener(actionListener);
        view.ButtonThree.addActionListener(actionListener);
        view.ButtonFour.addActionListener(actionListener);
        view.ButtonFive.addActionListener(actionListener);
        view.ButtonSix.addActionListener(actionListener);
        view.ButtonSeven.addActionListener(actionListener);
        view.ButtonEight.addActionListener(actionListener);
        view.ButtonNine.addActionListener(actionListener);
        view.ButtonZero.addActionListener(actionListener);
        view.PlusButton.addActionListener(actionListener);
        view.MinusButton.addActionListener(actionListener);
        view.DivideButton.addActionListener(actionListener);
        view.MultiplyButton.addActionListener(actionListener);
        view.EqualsButton.addActionListener(actionListener);
        view.ClearButton.addActionListener(actionListener);
        view.square.addActionListener(actionListener);
        view.sin.addActionListener(actionListener);
        view.cos.addActionListener(actionListener);
        view.tan.addActionListener(actionListener);
    }
    
    
    
    
    
}
