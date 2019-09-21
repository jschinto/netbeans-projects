/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rollpay;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.*;

/**
 *
 * @author jakes_000
 */
public class RollPay {

    private static RollPayView view;
    private static RollPayModel model;
    private static ActionListener actionListener;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        view = new RollPayView();
        view.setVisible(true);
        actionListener = new ActionListener(){//the action listener that actually runs the program
            public void actionPerformed(ActionEvent actionEvent){
                model.datel = view.datem.getText();
                model.hours = Float.parseFloat(view.time.getText());
                model.bonus = Float.parseFloat(view.bonus.getText());
                model.ratel = Float.parseFloat(view.rate.getText());
                view.tableModel = (DefaultTableModel) view.table.getModel();
                view.tableModel.addRow(model.tableEdit());
                view.money.setText(Float.toString(model.Owed));
            }
        };
        view.submit.addActionListener(actionListener);
    }
    
}
