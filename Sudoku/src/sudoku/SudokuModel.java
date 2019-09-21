/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;
import java.util.Arrays;
/**
 *
 * @author jakes_000
 */
public class SudokuModel {//each row.  answerrow is the answerkey.  inrow is current board from user.
    public static String[] answerRow1 = new String[9];
    public static String[] answerRow2 = new String[9];
    public static String[] answerRow3 = new String[9];
    public static String[] answerRow4 = new String[9];
    public static String[] answerRow5 = new String[9];
    public static String[] answerRow6 = new String[9];
    public static String[] answerRow7 = new String[9];
    public static String[] answerRow8 = new String[9];
    public static String[] answerRow9 = new String[9];
    public static String[] inRow1 = new String[9];
    public static String[] inRow2 = new String[9];
    public static String[] inRow3 = new String[9];
    public static String[] inRow4 = new String[9];
    public static String[] inRow5 = new String[9];
    public static String[] inRow6 = new String[9];
    public static String[] inRow7 = new String[9];
    public static String[] inRow8 = new String[9];
    public static String[] inRow9 = new String[9];
    private static int count;
    private static int[] out = new int[2];
    public static int[] hint(){//randomly selects a row and random position and goes through the board until it finds a place to give a hint.  returns coords of the hint place or 0,0 if no place is available for a hint
        out[0]=0;
        out[1]=0;
        count=0;
        int x = ((int)((Math.random()*9)+1));
        if(x==1){
            return hintOne();
        }
        else if(x==2){
            return hintTwo();
        }
        else if(x==3){
            return hintThree();
        }
        else if(x==4){
            return hintFour();
        }
        else if(x==5){
            return hintFive();
        }
        else if(x==6){
            return hintSix();
        }
        else if(x==7){
            return hintSeven();
        }
        else if(x==8){
            return hintEight();
        }
        else if(x==9){
            return hintNine();
        }
        return out;
    }
    private static int[] hintOne(){//row 1
        int y = ((int)(Math.random()*9));
        for(int i=0;i<9;i++){
            if(y==9){
                y=0;
            }
            if(!inRow1[y].equals("1")&&!inRow1[y].equals("2")&&!inRow1[y].equals("3")&&!inRow1[y].equals("4")&&!inRow1[y].equals("5")&&!inRow1[y].equals("6")&&!inRow1[y].equals("7")&&!inRow1[y].equals("8")&&!inRow1[y].equals("9")){
                out[0]=1;
                out[1]=y+1;
                return out;
            }
            y++;
        }
        if(count==9){
            return out;
        }
        count++;
        return hintTwo();
    }
    private static int[] hintTwo(){//row 2
        int y = ((int)(Math.random()*9));
        for(int i=0;i<9;i++){
            if(y==9){
                y=0;
            }
            if(!inRow2[y].equals("1")&&!inRow2[y].equals("2")&&!inRow2[y].equals("3")&&!inRow2[y].equals("4")&&!inRow2[y].equals("5")&&!inRow2[y].equals("6")&&!inRow2[y].equals("7")&&!inRow2[y].equals("8")&&!inRow2[y].equals("9")){
                out[0]=2;
                out[1]=y+1;
                return out;
            }
            y++;
        }
        if(count==9){
            return out;
        }
        count++;
        return hintThree();
    }
    private static int[] hintThree(){//row 3
        int y = ((int)(Math.random()*9));
        for(int i=0;i<9;i++){
            if(y==9){
                y=0;
            }
            if(!inRow3[y].equals("1")&&!inRow3[y].equals("2")&&!inRow3[y].equals("3")&&!inRow3[y].equals("4")&&!inRow3[y].equals("5")&&!inRow3[y].equals("6")&&!inRow3[y].equals("7")&&!inRow3[y].equals("8")&&!inRow3[y].equals("9")){
                out[0]=3;
                out[1]=y+1;
                return out;
            }
            y++;
        }
        if(count==9){
            return out;
        }
        count++;
        return hintFour();
    }
    private static int[] hintFour(){//row 4
        int y = ((int)(Math.random()*9));
        for(int i=0;i<9;i++){
            if(y==9){
                y=0;
            }
            if(!inRow4[y].equals("1")&&!inRow4[y].equals("2")&&!inRow4[y].equals("3")&&!inRow4[y].equals("4")&&!inRow4[y].equals("5")&&!inRow4[y].equals("6")&&!inRow4[y].equals("7")&&!inRow4[y].equals("8")&&!inRow4[y].equals("9")){
                out[0]=4;
                out[1]=y+1;
                return out;
            }
            y++;
        }
        if(count==9){
            return out;
        }
        count++;
        return hintFive();
    }
    private static int[] hintFive(){//row 5
        int y = ((int)(Math.random()*9));
        for(int i=0;i<9;i++){
            if(y==9){
                y=0;
            }
            if(!inRow5[y].equals("1")&&!inRow5[y].equals("2")&&!inRow5[y].equals("3")&&!inRow5[y].equals("4")&&!inRow5[y].equals("5")&&!inRow5[y].equals("6")&&!inRow5[y].equals("7")&&!inRow5[y].equals("8")&&!inRow5[y].equals("9")){
                out[0]=5;
                out[1]=y+1;
                return out;
            }
            y++;
        }
        if(count==9){
            return out;
        }
        count++;
        return hintSix();
    }
    private static int[] hintSix(){//row 6
        int y = ((int)(Math.random()*9));
        for(int i=0;i<9;i++){
            if(y==9){
                y=0;
            }
            if(!inRow6[y].equals("1")&&!inRow6[y].equals("2")&&!inRow6[y].equals("3")&&!inRow6[y].equals("4")&&!inRow6[y].equals("5")&&!inRow6[y].equals("6")&&!inRow6[y].equals("7")&&!inRow6[y].equals("8")&&!inRow6[y].equals("9")){
                out[0]=6;
                out[1]=y+1;
                return out;
            }
            y++;
        }
        if(count==9){
            return out;
        }
        count++;
        return hintSeven();
    }
    private static int[] hintSeven(){//row 7
        int y = ((int)(Math.random()*9));
        for(int i=0;i<9;i++){
            if(y==9){
                y=0;
            }
            if(!inRow7[y].equals("1")&&!inRow7[y].equals("2")&&!inRow7[y].equals("3")&&!inRow7[y].equals("4")&&!inRow7[y].equals("5")&&!inRow7[y].equals("6")&&!inRow7[y].equals("7")&&!inRow7[y].equals("8")&&!inRow7[y].equals("9")){
                out[0]=7;
                out[1]=y+1;
                return out;
            }
            y++;
        }
        if(count==9){
            return out;
        }
        count++;
        return hintEight();
    }
    private static int[] hintEight(){//row 8
        int y = ((int)(Math.random()*9));
        for(int i=0;i<9;i++){
            if(y==9){
                y=0;
            }
            if(!inRow8[y].equals("1")&&!inRow8[y].equals("2")&&!inRow8[y].equals("3")&&!inRow8[y].equals("4")&&!inRow8[y].equals("5")&&!inRow8[y].equals("6")&&!inRow8[y].equals("7")&&!inRow8[y].equals("8")&&!inRow8[y].equals("9")){
                out[0]=8;
                out[1]=y+1;
                return out;
            }
            y++;
        }
        if(count==9){
            return out;
        }
        count++;
        return hintNine();
    }
    private static int[] hintNine(){//row 9
        int y = ((int)(Math.random()*9));
        for(int i=0;i<9;i++){
            if(y==9){
                y=0;
            }
            if(!inRow9[y].equals("1")&&!inRow9[y].equals("2")&&!inRow9[y].equals("3")&&!inRow9[y].equals("4")&&!inRow9[y].equals("5")&&!inRow9[y].equals("6")&&!inRow9[y].equals("7")&&!inRow9[y].equals("8")&&!inRow9[y].equals("9")){
                out[0]=9;
                out[1]=y+1;
                return out;
            }
            y++;
        }
        if(count==9){
            return out;
        }
        count++;
        return hintOne();
    }
    public static Boolean check(String[] input,int row){//compares a row to the answer and returns true if correct
        if(row==1){
            for(int x=0;x<answerRow1.length;x++){
                if(!answerRow1[x].equals(input[x])){
                    return false;
                }
            }
            return true;
        }
        else if(row==2){
            for(int x=0;x<answerRow2.length;x++){
                if(!answerRow2[x].equals(input[x])){
                    return false;
                }
            }
            return true;
        }
        else if(row==3){
            for(int x=0;x<answerRow3.length;x++){
                if(!answerRow3[x].equals(input[x])){
                    return false;
                }
            }
            return true;
        }
        else if(row==4){
            for(int x=0;x<answerRow4.length;x++){
                if(!answerRow4[x].equals(input[x])){
                    return false;
                }
            }
            return true;
        }
        else if(row==5){
            for(int x=0;x<answerRow5.length;x++){
                if(!answerRow5[x].equals(input[x])){
                    return false;
                }
            }
            return true;
        }
        else if(row==6){
            for(int x=0;x<answerRow6.length;x++){
                if(!answerRow6[x].equals(input[x])){
                    return false;
                }
            }
            return true;
        }
        else if(row==7){
            for(int x=0;x<answerRow7.length;x++){
                if(!answerRow7[x].equals(input[x])){
                    return false;
                }
            }
            return true;
        }
        else if(row==8){
            for(int x=0;x<answerRow8.length;x++){
                if(!answerRow8[x].equals(input[x])){
                    return false;
                }
            }
            return true;
        }
        else if(row==9){
            for(int x=0;x<answerRow9.length;x++){
                if(!answerRow9[x].equals(input[x])){
                    return false;
                }
            }
            return true;
        }
        return true;
    }
    public static void random(){//random board generator.  This was hard because it needed to be solveable
        rowFirst();
        rowTwo(2);
        rowThree(3);//each of these are called to create another row
        rowOne(4);
        rowTwo(5);
        rowThree(6);//if it becomes impossible to create it goes back a row and retrys
        rowOne(7);
        rowTwo(8);
        rowThree(9);
    }
    private static void rowFirst(){
        for(int x=0;x<answerRow1.length;x++){
            answerRow1[x] = Integer.toString((int)(Math.random()*9)+1);
            if(Arrays.asList(answerRow1).indexOf(answerRow1[x])!=x){
                x--;
            }
        }
    }
    private static void rowOne(int row){
        if(row == 4){
            int y=0;
            for(int x=0;x<answerRow4.length;x++){
                answerRow4[x] = Integer.toString((int)(Math.random()*9)+1);
                if(Arrays.asList(answerRow4).indexOf(answerRow4[x])!=x){
                    x--;
                }
                else if(answerRow4[x].equals(answerRow3[x])||answerRow4[x].equals(answerRow2[x])||answerRow4[x].equals(answerRow1[x])){
                    if(y == 100){
                        rowThree(3);
                        x=0;
                        y=0;
                    }
                    else{
                        y++;
                        x--;
                    }
                }
            }
        }
        else if(row == 7){
            int y=0;
            for(int x=0;x<answerRow7.length;x++){
                answerRow7[x] = Integer.toString((int)(Math.random()*9)+1);
                if(Arrays.asList(answerRow7).indexOf(answerRow7[x])!=x){
                    x--;
                }
                else if(answerRow7[x].equals(answerRow6[x])||answerRow7[x].equals(answerRow5[x])||answerRow7[x].equals(answerRow4[x])||answerRow7[x].equals(answerRow3[x])||answerRow7[x].equals(answerRow2[x])||answerRow7[x].equals(answerRow1[x])){
                    if(y == 100){
                        rowThree(6);
                        x=0;
                        y=0;
                    }
                    else{
                        y++;
                        x--;
                    }
                }
            }
        }
    }
    private static void rowTwo(int row){
        if(row == 2){
            int y = 0;
            for(int i=0;i<answerRow2.length;i++){
                answerRow2[i] = Integer.toString((int)(Math.random()*9)+1);
                if(Arrays.asList(answerRow2).indexOf(answerRow2[i])!=i){
                    i--;
                }
                else if(answerRow2[i].equals(answerRow1[i])){
                    if(y == 100){
                        rowFirst();
                        i=0;
                        y=0;
                    }
                    else{
                        y++;
                        i--;
                    }
                }
                else if(i<3){
                    if(answerRow2[i].equals(answerRow1[0])||answerRow2[i].equals(answerRow1[1])||answerRow2[i].equals(answerRow1[2])){
                        if(y == 100){
                            rowFirst();
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
                else if(i>=3&&i<6){
                    if(answerRow2[i].equals(answerRow1[3])||answerRow2[i].equals(answerRow1[4])||answerRow2[i].equals(answerRow1[5])){
                        if(y == 100){
                            rowFirst();
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
                else if(i>=6){
                    if(answerRow2[i].equals(answerRow1[6])||answerRow2[i].equals(answerRow1[7])||answerRow2[i].equals(answerRow1[8])){
                        if(y == 100){
                            rowFirst();
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
            }
        }
        else if(row == 5){
            int y=0;
            for(int i=0;i<answerRow5.length;i++){
                answerRow5[i] = Integer.toString((int)(Math.random()*9)+1);
                if(Arrays.asList(answerRow5).indexOf(answerRow5[i])!=i){
                    i--;
                }
                else if(answerRow5[i].equals(answerRow4[i])||answerRow5[i].equals(answerRow3[i])||answerRow5[i].equals(answerRow2[i])||answerRow5[i].equals(answerRow1[i])){
                    if(y == 100){
                        rowOne(4);
                        i=0;
                        y=0;
                    }
                    else{
                        y++;
                        i--;
                    }
                }
                else if(i<3){
                    if(answerRow5[i].equals(answerRow4[0])||answerRow5[i].equals(answerRow4[1])||answerRow5[i].equals(answerRow4[2])){
                        if(y == 100){
                            rowOne(4);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
                else if(i>=3&&i<6){
                    if(answerRow5[i].equals(answerRow4[3])||answerRow5[i].equals(answerRow4[4])||answerRow5[i].equals(answerRow4[5])){
                        if(y == 100){
                            rowOne(4);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
                else if(i>=6){
                    if(answerRow5[i].equals(answerRow4[6])||answerRow5[i].equals(answerRow4[7])||answerRow5[i].equals(answerRow4[8])){
                        if(y == 100){
                            rowOne(4);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
            }
        }
        else if(row == 8){
            int y=0;
            for(int i=0;i<answerRow8.length;i++){
                answerRow8[i] = Integer.toString((int)(Math.random()*9)+1);
                if(Arrays.asList(answerRow8).indexOf(answerRow8[i])!=i){
                    i--;
                }
                else if(answerRow8[i].equals(answerRow7[i])||answerRow8[i].equals(answerRow6[i])||answerRow8[i].equals(answerRow5[i])||answerRow8[i].equals(answerRow4[i])||answerRow8[i].equals(answerRow3[i])||answerRow8[i].equals(answerRow2[i])||answerRow8[i].equals(answerRow1[i])){
                    if(y == 100){
                        rowOne(7);
                        i=0;
                        y=0;
                    }
                    else{
                        y++;
                        i--;
                    }
                }
                else if(i<3){
                    if(answerRow8[i].equals(answerRow7[0])||answerRow8[i].equals(answerRow7[1])||answerRow8[i].equals(answerRow7[2])){
                        if(y == 100){
                            rowOne(7);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
                else if(i>=3&&i<6){
                    if(answerRow8[i].equals(answerRow7[3])||answerRow8[i].equals(answerRow7[4])||answerRow8[i].equals(answerRow7[5])){
                        if(y == 100){
                            rowOne(7);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
                else if(i>=6){
                    if(answerRow8[i].equals(answerRow7[6])||answerRow8[i].equals(answerRow7[7])||answerRow8[i].equals(answerRow7[8])){
                        if(y == 100){
                            rowOne(7);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
            }
        }
    }
    private static void rowThree(int row){
        if(row == 3){
            int y=0;
            for(int i=0;i<answerRow3.length;i++){
                answerRow3[i] = Integer.toString((int)(Math.random()*9)+1);
                if(Arrays.asList(answerRow3).indexOf(answerRow3[i])!=i){
                    i--;
                }
                else if(answerRow3[i].equals(answerRow2[i])||answerRow3[i].equals(answerRow1[i])){
                    if(y == 100){
                        rowTwo(2);
                        i=0;
                        y=0;
                    }
                    else{
                        y++;
                        i--;
                    }
                }
                else if(i<3){
                    if(answerRow3[i].equals(answerRow1[0])||answerRow3[i].equals(answerRow1[1])||answerRow3[i].equals(answerRow1[2])||answerRow3[i].equals(answerRow2[0])||answerRow3[i].equals(answerRow2[1])||answerRow3[i].equals(answerRow2[2])){
                        if(y == 100){
                            rowTwo(2);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
                else if(i>=3&&i<6){
                    if(answerRow3[i].equals(answerRow1[3])||answerRow3[i].equals(answerRow1[4])||answerRow3[i].equals(answerRow1[5])||answerRow3[i].equals(answerRow2[3])||answerRow3[i].equals(answerRow2[4])||answerRow3[i].equals(answerRow2[5])){
                        if(y == 100){
                            rowTwo(2);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
                else if(i>=6){
                    if(answerRow3[i].equals(answerRow1[6])||answerRow3[i].equals(answerRow1[7])||answerRow3[i].equals(answerRow1[8])||answerRow3[i].equals(answerRow2[6])||answerRow3[i].equals(answerRow2[7])||answerRow3[i].equals(answerRow2[8])){
                        if(y == 100){
                            rowTwo(2);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
            }
        }
        else if(row == 6){
            int y=0;
            for(int i=0;i<answerRow6.length;i++){
                answerRow6[i] = Integer.toString((int)(Math.random()*9)+1);
                if(Arrays.asList(answerRow6).indexOf(answerRow6[i])!=i){
                    i--;
                }
                else if(answerRow6[i].equals(answerRow5[i])||answerRow6[i].equals(answerRow4[i])||answerRow6[i].equals(answerRow3[i])||answerRow6[i].equals(answerRow2[i])||answerRow6[i].equals(answerRow1[i])){
                    if(y == 100){
                        rowTwo(5);
                        i=0;
                        y=0;
                    }
                    else{
                        y++;
                        i--;
                    }
                }
                else if(i<3){
                    if(answerRow6[i].equals(answerRow4[0])||answerRow6[i].equals(answerRow4[1])||answerRow6[i].equals(answerRow4[2])||answerRow6[i].equals(answerRow5[0])||answerRow6[i].equals(answerRow5[1])||answerRow6[i].equals(answerRow5[2])){
                        if(y == 100){
                            rowTwo(5);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
                else if(i>=3&&i<6){
                    if(answerRow6[i].equals(answerRow4[3])||answerRow6[i].equals(answerRow4[4])||answerRow6[i].equals(answerRow4[5])||answerRow6[i].equals(answerRow5[3])||answerRow6[i].equals(answerRow5[4])||answerRow6[i].equals(answerRow5[5])){
                        if(y == 100){
                            rowTwo(5);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
                else if(i>=6){
                    if(answerRow6[i].equals(answerRow4[6])||answerRow6[i].equals(answerRow4[7])||answerRow6[i].equals(answerRow4[8])||answerRow6[i].equals(answerRow5[6])||answerRow6[i].equals(answerRow5[7])||answerRow6[i].equals(answerRow5[8])){
                        if(y == 100){
                            rowTwo(5);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
            }
        }
        else if(row == 9){
            int y=0;
            for(int i=0;i<answerRow9.length;i++){
                answerRow9[i] = Integer.toString((int)(Math.random()*9)+1);
                if(Arrays.asList(answerRow9).indexOf(answerRow9[i])!=i){
                    i--;
                }
                else if(answerRow9[i].equals(answerRow8[i])||answerRow9[i].equals(answerRow7[i])||answerRow9[i].equals(answerRow6[i])||answerRow9[i].equals(answerRow5[i])||answerRow9[i].equals(answerRow4[i])||answerRow9[i].equals(answerRow3[i])||answerRow9[i].equals(answerRow2[i])||answerRow9[i].equals(answerRow1[i])){
                    if(y == 100){
                        rowTwo(8);
                        i=0;
                        y=0;
                    }
                    else{
                        y++;
                        i--;
                    }
                }
                else if(i<3){
                    if(answerRow9[i].equals(answerRow7[0])||answerRow9[i].equals(answerRow7[1])||answerRow9[i].equals(answerRow7[2])||answerRow9[i].equals(answerRow8[0])||answerRow9[i].equals(answerRow8[1])||answerRow9[i].equals(answerRow8[2])){
                        if(y == 100){
                            rowTwo(8);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
                else if(i>=3&&i<6){
                    if(answerRow9[i].equals(answerRow7[3])||answerRow9[i].equals(answerRow7[4])||answerRow9[i].equals(answerRow7[5])||answerRow9[i].equals(answerRow8[3])||answerRow9[i].equals(answerRow8[4])||answerRow9[i].equals(answerRow8[5])){
                        if(y == 100){
                            rowTwo(8);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
                else if(i>=6){
                    if(answerRow9[i].equals(answerRow7[6])||answerRow9[i].equals(answerRow7[7])||answerRow9[i].equals(answerRow7[8])||answerRow9[i].equals(answerRow8[6])||answerRow9[i].equals(answerRow8[7])||answerRow9[i].equals(answerRow8[8])){
                        if(y == 100){
                            rowTwo(8);
                            i=0;
                            y=0;
                        }
                        else{
                            y++;
                            i--;
                        }
                    }
                }
            }
        }
    }
}