/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author jakes_000
 */
public class Sudoku {
    private static SudokuView view;
    private static SudokuModel model;
    private static ActionListener actionListener;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        view = new SudokuView();
        view.setVisible(true);
        actionListener = new ActionListener(){//the action listener that actually runs the program
            public void actionPerformed(ActionEvent actionEvent){
                if(actionEvent.getSource() == view.random){//if random was pressed
                    view.log.setText(view.log.getText()+"\n"+"Random Game Generated");
                    model.random();
                    clear();//clears the current board
                    display(model.answerRow1,1);//displays each row
                    display(model.answerRow2,2);
                    display(model.answerRow3,3);
                    display(model.answerRow4,4);
                    display(model.answerRow5,5);
                    display(model.answerRow6,6);
                    display(model.answerRow7,7);
                    display(model.answerRow8,8);
                    display(model.answerRow9,9);
                }
                else if(actionEvent.getSource() == view.check){//if check is pressed
                    push();//put current board into inRow arrays
                    if(model.answerRow1[0]!=null){//removes error of checking no game
                        if(model.check(model.inRow1,1)==true&&model.check(model.inRow2,2)==true&&model.check(model.inRow3,3)==true&&model.check(model.inRow4,4)==true&&model.check(model.inRow5,5)==true&&model.check(model.inRow6,6)==true&&model.check(model.inRow7,7)==true&&model.check(model.inRow8,8)==true&&model.check(model.inRow9,9)==true){
                            view.log.setText(view.log.getText()+"\n"+"Your answer is CORRECT");//
                        }//if correct
                        else{
                            view.log.setText(view.log.getText()+"\n"+"Your answer is INCORRECT");
                        }//if incorrect
                    }
                    else{
                        view.log.setText(view.log.getText()+"\n"+"You must have an active game to check");
                    }//if pressed with no game
                }
                else if(actionEvent.getSource() == view.hint){//if hint pressed
                    push();//put current board to model
                    doHint(model.hint());//displays a hint returned from model
                }
            }
        };
        view.random.addActionListener(actionListener);
        view.check.addActionListener(actionListener);
        view.hint.addActionListener(actionListener);
    }
    private static void display(String[] input,int row){//displays each row with a 30% chance to display each box
        if(row == 1){
            if(((int)(Math.random()*3))==0){
                view.r11.setText(input[0]);
            }
            if(((int)(Math.random()*3))==0){
                view.r12.setText(input[1]);
            }
            if(((int)(Math.random()*3))==0){
                view.r13.setText(input[2]);
            }
            if(((int)(Math.random()*3))==0){
                view.r14.setText(input[3]);
            }
            if(((int)(Math.random()*3))==0){
                view.r15.setText(input[4]);
            }
            if(((int)(Math.random()*3))==0){
                view.r16.setText(input[5]);
            }
            if(((int)(Math.random()*3))==0){
                view.r17.setText(input[6]);
            }
            if(((int)(Math.random()*3))==0){
                view.r18.setText(input[7]);
            }
            if(((int)(Math.random()*3))==0){
                view.r19.setText(input[8]);
            }
        }
        else if(row == 2){
            if(((int)(Math.random()*3))==0){
                view.r21.setText(input[0]);
            }
            if(((int)(Math.random()*3))==0){
                view.r22.setText(input[1]);
            }
            if(((int)(Math.random()*3))==0){
                view.r23.setText(input[2]);
            }
            if(((int)(Math.random()*3))==0){
                view.r24.setText(input[3]);
            }
            if(((int)(Math.random()*3))==0){
                view.r25.setText(input[4]);
            }
            if(((int)(Math.random()*3))==0){
                view.r26.setText(input[5]);
            }
            if(((int)(Math.random()*3))==0){
                view.r27.setText(input[6]);
            }
            if(((int)(Math.random()*3))==0){
                view.r28.setText(input[7]);
            }
            if(((int)(Math.random()*3))==0){
                view.r29.setText(input[8]);
            }
        }
        else if(row == 3){
            if(((int)(Math.random()*3))==0){
                view.r31.setText(input[0]);
            }
            if(((int)(Math.random()*3))==0){
                view.r32.setText(input[1]);
            }
            if(((int)(Math.random()*3))==0){
                view.r33.setText(input[2]);
            }
            if(((int)(Math.random()*3))==0){
                view.r34.setText(input[3]);
            }
            if(((int)(Math.random()*3))==0){
                view.r35.setText(input[4]);
            }
            if(((int)(Math.random()*3))==0){
                view.r36.setText(input[5]);
            }
            if(((int)(Math.random()*3))==0){
                view.r37.setText(input[6]);
            }
            if(((int)(Math.random()*3))==0){
                view.r38.setText(input[7]);
            }
            if(((int)(Math.random()*3))==0){
                view.r39.setText(input[8]);
            }
        }
        else if(row == 4){
            if(((int)(Math.random()*3))==0){
                view.r41.setText(input[0]);
            }
            if(((int)(Math.random()*3))==0){
                view.r42.setText(input[1]);
            }
            if(((int)(Math.random()*3))==0){
                view.r43.setText(input[2]);
            }
            if(((int)(Math.random()*3))==0){
                view.r44.setText(input[3]);
            }
            if(((int)(Math.random()*3))==0){
                view.r45.setText(input[4]);
            }
            if(((int)(Math.random()*3))==0){
                view.r46.setText(input[5]);
            }
            if(((int)(Math.random()*3))==0){
                view.r47.setText(input[6]);
            }
            if(((int)(Math.random()*3))==0){
                view.r48.setText(input[7]);
            }
            if(((int)(Math.random()*3))==0){
                view.r49.setText(input[8]);
            }
        }
        else if(row == 5){
            if(((int)(Math.random()*3))==0){
                view.r51.setText(input[0]);
            }
            if(((int)(Math.random()*3))==0){
                view.r52.setText(input[1]);
            }
            if(((int)(Math.random()*3))==0){
                view.r53.setText(input[2]);
            }
            if(((int)(Math.random()*3))==0){
                view.r54.setText(input[3]);
            }
            if(((int)(Math.random()*3))==0){
                view.r55.setText(input[4]);
            }
            if(((int)(Math.random()*3))==0){
                view.r56.setText(input[5]);
            }
            if(((int)(Math.random()*3))==0){
                view.r57.setText(input[6]);
            }
            if(((int)(Math.random()*3))==0){
                view.r58.setText(input[7]);
            }
            if(((int)(Math.random()*3))==0){
                view.r59.setText(input[8]);
            }
        }
        else if(row == 6){
            if(((int)(Math.random()*3))==0){
                view.r61.setText(input[0]);
            }
            if(((int)(Math.random()*3))==0){
                view.r62.setText(input[1]);
            }
            if(((int)(Math.random()*3))==0){
                view.r63.setText(input[2]);
            }
            if(((int)(Math.random()*3))==0){
                view.r64.setText(input[3]);
            }
            if(((int)(Math.random()*3))==0){
                view.r65.setText(input[4]);
            }
            if(((int)(Math.random()*3))==0){
                view.r66.setText(input[5]);
            }
            if(((int)(Math.random()*3))==0){
                view.r67.setText(input[6]);
            }
            if(((int)(Math.random()*3))==0){
                view.r68.setText(input[7]);
            }
            if(((int)(Math.random()*3))==0){
                view.r69.setText(input[8]);
            }
        }
        else if(row == 7){
            if(((int)(Math.random()*3))==0){
                view.r71.setText(input[0]);
            }
            if(((int)(Math.random()*3))==0){
                view.r72.setText(input[1]);
            }
            if(((int)(Math.random()*3))==0){
                view.r73.setText(input[2]);
            }
            if(((int)(Math.random()*3))==0){
                view.r74.setText(input[3]);
            }
            if(((int)(Math.random()*3))==0){
                view.r75.setText(input[4]);
            }
            if(((int)(Math.random()*3))==0){
                view.r76.setText(input[5]);
            }
            if(((int)(Math.random()*3))==0){
                view.r77.setText(input[6]);
            }
            if(((int)(Math.random()*3))==0){
                view.r78.setText(input[7]);
            }
            if(((int)(Math.random()*3))==0){
                view.r79.setText(input[8]);
            }
        }
        else if(row == 8){
            if(((int)(Math.random()*3))==0){
                view.r81.setText(input[0]);
            }
            if(((int)(Math.random()*3))==0){
                view.r82.setText(input[1]);
            }
            if(((int)(Math.random()*3))==0){
                view.r83.setText(input[2]);
            }
            if(((int)(Math.random()*3))==0){
                view.r84.setText(input[3]);
            }
            if(((int)(Math.random()*3))==0){
                view.r85.setText(input[4]);
            }
            if(((int)(Math.random()*3))==0){
                view.r86.setText(input[5]);
            }
            if(((int)(Math.random()*3))==0){
                view.r87.setText(input[6]);
            }
            if(((int)(Math.random()*3))==0){
                view.r88.setText(input[7]);
            }
            if(((int)(Math.random()*3))==0){
                view.r89.setText(input[8]);
            }
        }
        else if(row == 9){
            if(((int)(Math.random()*3))==0){
                view.r91.setText(input[0]);
            }
            if(((int)(Math.random()*3))==0){
                view.r92.setText(input[1]);
            }
            if(((int)(Math.random()*3))==0){
                view.r93.setText(input[2]);
            }
            if(((int)(Math.random()*3))==0){
                view.r94.setText(input[3]);
            }
            if(((int)(Math.random()*3))==0){
                view.r95.setText(input[4]);
            }
            if(((int)(Math.random()*3))==0){
                view.r96.setText(input[5]);
            }
            if(((int)(Math.random()*3))==0){
                view.r97.setText(input[6]);
            }
            if(((int)(Math.random()*3))==0){
                view.r98.setText(input[7]);
            }
            if(((int)(Math.random()*3))==0){
                view.r99.setText(input[8]);
            }
        }
    }
    private static void clear(){//clears the board
        view.r11.setText("");
        view.r12.setText("");
        view.r13.setText("");
        view.r14.setText("");
        view.r15.setText("");
        view.r16.setText("");
        view.r17.setText("");
        view.r18.setText("");
        view.r19.setText("");
        view.r21.setText("");
        view.r22.setText("");
        view.r23.setText("");
        view.r24.setText("");
        view.r25.setText("");
        view.r26.setText("");
        view.r27.setText("");
        view.r28.setText("");
        view.r29.setText("");
        view.r31.setText("");
        view.r32.setText("");
        view.r33.setText("");
        view.r34.setText("");
        view.r35.setText("");
        view.r36.setText("");
        view.r37.setText("");
        view.r38.setText("");
        view.r39.setText("");
        view.r41.setText("");
        view.r42.setText("");
        view.r43.setText("");
        view.r44.setText("");
        view.r45.setText("");
        view.r46.setText("");
        view.r47.setText("");
        view.r48.setText("");
        view.r49.setText("");
        view.r51.setText("");
        view.r52.setText("");
        view.r53.setText("");
        view.r54.setText("");
        view.r55.setText("");
        view.r56.setText("");
        view.r57.setText("");
        view.r58.setText("");
        view.r59.setText("");
        view.r61.setText("");
        view.r62.setText("");
        view.r63.setText("");
        view.r64.setText("");
        view.r65.setText("");
        view.r66.setText("");
        view.r67.setText("");
        view.r68.setText("");
        view.r69.setText("");
        view.r71.setText("");
        view.r72.setText("");
        view.r73.setText("");
        view.r74.setText("");
        view.r75.setText("");
        view.r76.setText("");
        view.r77.setText("");
        view.r78.setText("");
        view.r79.setText("");
        view.r81.setText("");
        view.r82.setText("");
        view.r83.setText("");
        view.r84.setText("");
        view.r85.setText("");
        view.r86.setText("");
        view.r87.setText("");
        view.r88.setText("");
        view.r89.setText("");
        view.r91.setText("");
        view.r92.setText("");
        view.r93.setText("");
        view.r94.setText("");
        view.r95.setText("");
        view.r96.setText("");
        view.r97.setText("");
        view.r98.setText("");
        view.r99.setText("");
    }
    private static void push(){//pushes the current board into the model
        model.inRow1[0]=view.r11.getText();
        model.inRow1[1]=view.r12.getText();
        model.inRow1[2]=view.r13.getText();
        model.inRow1[3]=view.r14.getText();
        model.inRow1[4]=view.r15.getText();
        model.inRow1[5]=view.r16.getText();
        model.inRow1[6]=view.r17.getText();
        model.inRow1[7]=view.r18.getText();
        model.inRow1[8]=view.r19.getText();
        model.inRow2[0]=view.r21.getText();
        model.inRow2[1]=view.r22.getText();
        model.inRow2[2]=view.r23.getText();
        model.inRow2[3]=view.r24.getText();
        model.inRow2[4]=view.r25.getText();
        model.inRow2[5]=view.r26.getText();
        model.inRow2[6]=view.r27.getText();
        model.inRow2[7]=view.r28.getText();
        model.inRow2[8]=view.r29.getText();
        model.inRow3[0]=view.r31.getText();
        model.inRow3[1]=view.r32.getText();
        model.inRow3[2]=view.r33.getText();
        model.inRow3[3]=view.r34.getText();
        model.inRow3[4]=view.r35.getText();
        model.inRow3[5]=view.r36.getText();
        model.inRow3[6]=view.r37.getText();
        model.inRow3[7]=view.r38.getText();
        model.inRow3[8]=view.r39.getText();
        model.inRow4[0]=view.r41.getText();
        model.inRow4[1]=view.r42.getText();
        model.inRow4[2]=view.r43.getText();
        model.inRow4[3]=view.r44.getText();
        model.inRow4[4]=view.r45.getText();
        model.inRow4[5]=view.r46.getText();
        model.inRow4[6]=view.r47.getText();
        model.inRow4[7]=view.r48.getText();
        model.inRow4[8]=view.r49.getText();
        model.inRow5[0]=view.r51.getText();
        model.inRow5[1]=view.r52.getText();
        model.inRow5[2]=view.r53.getText();
        model.inRow5[3]=view.r54.getText();
        model.inRow5[4]=view.r55.getText();
        model.inRow5[5]=view.r56.getText();
        model.inRow5[6]=view.r57.getText();
        model.inRow5[7]=view.r58.getText();
        model.inRow5[8]=view.r59.getText();
        model.inRow6[0]=view.r61.getText();
        model.inRow6[1]=view.r62.getText();
        model.inRow6[2]=view.r63.getText();
        model.inRow6[3]=view.r64.getText();
        model.inRow6[4]=view.r65.getText();
        model.inRow6[5]=view.r66.getText();
        model.inRow6[6]=view.r67.getText();
        model.inRow6[7]=view.r68.getText();
        model.inRow6[8]=view.r69.getText();
        model.inRow7[0]=view.r71.getText();
        model.inRow7[1]=view.r72.getText();
        model.inRow7[2]=view.r73.getText();
        model.inRow7[3]=view.r74.getText();
        model.inRow7[4]=view.r75.getText();
        model.inRow7[5]=view.r76.getText();
        model.inRow7[6]=view.r77.getText();
        model.inRow7[7]=view.r78.getText();
        model.inRow7[8]=view.r79.getText();
        model.inRow8[0]=view.r81.getText();
        model.inRow8[1]=view.r82.getText();
        model.inRow8[2]=view.r83.getText();
        model.inRow8[3]=view.r84.getText();
        model.inRow8[4]=view.r85.getText();
        model.inRow8[5]=view.r86.getText();
        model.inRow8[6]=view.r87.getText();
        model.inRow8[7]=view.r88.getText();
        model.inRow8[8]=view.r89.getText();
        model.inRow9[0]=view.r91.getText();
        model.inRow9[1]=view.r92.getText();
        model.inRow9[2]=view.r93.getText();
        model.inRow9[3]=view.r94.getText();
        model.inRow9[4]=view.r95.getText();
        model.inRow9[5]=view.r96.getText();
        model.inRow9[6]=view.r97.getText();
        model.inRow9[7]=view.r98.getText();
        model.inRow9[8]=view.r99.getText();
    }
    private static void doHint(int[] coord){//recieves coords of a hint box from model and displays it
        int x = coord[0];
        int y = coord[1];
        if(x==0&&y==0){
            view.log.setText(view.log.getText()+"\n"+"You must have unanswered spaces for a hint");
        }
        else if(x==1&&y==1){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r11.setText(model.answerRow1[0]);
        }
        else if(x==1&&y==2){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r12.setText(model.answerRow1[1]);
        }
        else if(x==1&&y==3){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r13.setText(model.answerRow1[2]);
        }
        else if(x==1&&y==4){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r14.setText(model.answerRow1[3]);
        }
        else if(x==1&&y==5){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r15.setText(model.answerRow1[4]);
        }
        else if(x==1&&y==6){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r16.setText(model.answerRow1[5]);
        }
        else if(x==1&&y==7){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r17.setText(model.answerRow1[6]);
        }
        else if(x==1&&y==8){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r18.setText(model.answerRow1[7]);
        }
        else if(x==1&&y==9){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r19.setText(model.answerRow1[8]);
        }
        else if(x==2&&y==1){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r21.setText(model.answerRow2[0]);
        }
        else if(x==2&&y==2){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r22.setText(model.answerRow2[1]);
        }
        else if(x==2&&y==3){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r23.setText(model.answerRow2[2]);
        }
        else if(x==2&&y==4){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r24.setText(model.answerRow2[3]);
        }
        else if(x==2&&y==5){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r25.setText(model.answerRow2[4]);
        }
        else if(x==2&&y==6){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r26.setText(model.answerRow2[5]);
        }
        else if(x==2&&y==7){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r27.setText(model.answerRow2[6]);
        }
        else if(x==2&&y==8){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r28.setText(model.answerRow2[7]);
        }
        else if(x==2&&y==9){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r29.setText(model.answerRow2[8]);
        }
        else if(x==3&&y==1){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r31.setText(model.answerRow3[0]);
        }
        else if(x==3&&y==2){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r32.setText(model.answerRow3[1]);
        }
        else if(x==3&&y==3){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r33.setText(model.answerRow3[2]);
        }
        else if(x==3&&y==4){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r34.setText(model.answerRow3[3]);
        }
        else if(x==3&&y==5){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r35.setText(model.answerRow3[4]);
        }
        else if(x==3&&y==6){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r36.setText(model.answerRow3[5]);
        }
        else if(x==3&&y==7){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r37.setText(model.answerRow3[6]);
        }
        else if(x==3&&y==8){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r38.setText(model.answerRow3[7]);
        }
        else if(x==3&&y==9){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r39.setText(model.answerRow3[8]);
        }
        else if(x==4&&y==1){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r41.setText(model.answerRow4[0]);
        }
        else if(x==4&&y==2){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r42.setText(model.answerRow4[1]);
        }
        else if(x==4&&y==3){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r43.setText(model.answerRow4[2]);
        }
        else if(x==4&&y==4){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r44.setText(model.answerRow4[3]);
        }
        else if(x==4&&y==5){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r45.setText(model.answerRow4[4]);
        }
        else if(x==4&&y==6){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r46.setText(model.answerRow4[5]);
        }
        else if(x==4&&y==7){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r47.setText(model.answerRow4[6]);
        }
        else if(x==4&&y==8){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r48.setText(model.answerRow4[7]);
        }
        else if(x==4&&y==9){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r49.setText(model.answerRow4[8]);
        }
        else if(x==5&&y==1){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r51.setText(model.answerRow5[0]);
        }
        else if(x==5&&y==2){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r52.setText(model.answerRow5[1]);
        }
        else if(x==5&&y==3){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r53.setText(model.answerRow5[2]);
        }
        else if(x==5&&y==4){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r54.setText(model.answerRow5[3]);
        }
        else if(x==5&&y==5){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r55.setText(model.answerRow5[4]);
        }
        else if(x==5&&y==6){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r56.setText(model.answerRow5[5]);
        }
        else if(x==5&&y==7){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r57.setText(model.answerRow5[6]);
        }
        else if(x==5&&y==8){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r58.setText(model.answerRow5[7]);
        }
        else if(x==5&&y==9){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r59.setText(model.answerRow5[8]);
        }
        else if(x==6&&y==1){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r61.setText(model.answerRow6[0]);
        }
        else if(x==6&&y==2){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r62.setText(model.answerRow6[1]);
        }
        else if(x==6&&y==3){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r63.setText(model.answerRow6[2]);
        }
        else if(x==6&&y==4){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r64.setText(model.answerRow6[3]);
        }
        else if(x==6&&y==5){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r65.setText(model.answerRow6[4]);
        }
        else if(x==6&&y==6){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r66.setText(model.answerRow6[5]);
        }
        else if(x==6&&y==7){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r67.setText(model.answerRow6[6]);
        }
        else if(x==6&&y==8){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r68.setText(model.answerRow6[7]);
        }
        else if(x==6&&y==9){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r69.setText(model.answerRow6[8]);
        }
        else if(x==7&&y==1){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r71.setText(model.answerRow7[0]);
        }
        else if(x==7&&y==2){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r72.setText(model.answerRow7[1]);
        }
        else if(x==7&&y==3){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r73.setText(model.answerRow7[2]);
        }
        else if(x==7&&y==4){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r74.setText(model.answerRow7[3]);
        }
        else if(x==7&&y==5){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r75.setText(model.answerRow7[4]);
        }
        else if(x==7&&y==6){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r76.setText(model.answerRow7[5]);
        }
        else if(x==7&&y==7){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r77.setText(model.answerRow7[6]);
        }
        else if(x==7&&y==8){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r78.setText(model.answerRow7[7]);
        }
        else if(x==7&&y==9){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r79.setText(model.answerRow7[8]);
        }
        else if(x==8&&y==1){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r81.setText(model.answerRow8[0]);
        }
        else if(x==8&&y==2){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r82.setText(model.answerRow8[1]);
        }
        else if(x==8&&y==3){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r83.setText(model.answerRow8[2]);
        }
        else if(x==8&&y==4){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r84.setText(model.answerRow8[3]);
        }
        else if(x==8&&y==5){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r85.setText(model.answerRow8[4]);
        }
        else if(x==8&&y==6){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r86.setText(model.answerRow8[5]);
        }
        else if(x==8&&y==7){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r87.setText(model.answerRow8[6]);
        }
        else if(x==8&&y==8){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r88.setText(model.answerRow8[7]);
        }
        else if(x==8&&y==9){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r89.setText(model.answerRow8[8]);
        }
        else if(x==9&&y==1){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r91.setText(model.answerRow9[0]);
        }
        else if(x==9&&y==2){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r92.setText(model.answerRow9[1]);
        }
        else if(x==9&&y==3){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r93.setText(model.answerRow9[2]);
        }
        else if(x==9&&y==4){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r94.setText(model.answerRow9[3]);
        }
        else if(x==9&&y==5){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r95.setText(model.answerRow9[4]);
        }
        else if(x==9&&y==6){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r96.setText(model.answerRow9[5]);
        }
        else if(x==9&&y==7){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r97.setText(model.answerRow9[6]);
        }
        else if(x==9&&y==8){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r98.setText(model.answerRow9[7]);
        }
        else if(x==9&&y==9){
            view.log.setText(view.log.getText()+"\n"+"Hint Given");
            view.r99.setText(model.answerRow9[8]);
        }
    }
}