/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author jakes_000
 */
public class Encrypter {
    private static EncrypterView view;
    private static EncrypterModel model;
    private static ActionListener actionListener;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        view = new EncrypterView();
        view.setVisible(true);
        actionListener = new ActionListener(){//the action listener that actually runs the program
            public void actionPerformed(ActionEvent actionEvent){
                if(actionEvent.getSource() == view.encrypt){//determines what called the listener
                    view.output.setText(model.encrypt(view.encryptData.getText(),view.encryptKey.getText()));
                }
                else if(actionEvent.getSource() == view.decrypt){
                    view.output.setText(model.decrypt(view.decryptData.getText(),view.decryptKey.getText()));
                }
            }
        };
        view.encrypt.addActionListener(actionListener);
        view.decrypt.addActionListener(actionListener);
        // TODO code application logic here
    }
    
}
