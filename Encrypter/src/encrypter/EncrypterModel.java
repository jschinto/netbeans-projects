/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypter;

/**
 *
 * @author jakes_000
 */
public class EncrypterModel {
    public static String encrypt(String input,String key){
        if(key.matches("[a-zA-Z]+")){//checks if key is only letters
            char[] chars = key.toCharArray();//turns the key into a char array
            int vals[] = new int[chars.length];
            int count = 0;//setting up counters
            int count2 = 0;
            for(char c : chars){
                vals[count]=c;//making an int array of the ascii values
                count++;
            }
            char[] Nchars = input.toCharArray();//turns input into a char array
            int Nvals[] = new int[Nchars.length];
            count = 0;
            for(char c : Nchars){
                Nvals[count]=c;//makes int array of ascii values
                count++;
            }
            count = 0;
            int x;
            for(int i : Nvals){//this is all the math
                if(65<=i && i<=90){//uppercase letters
                    if(65<=vals[count2%vals.length] && vals[count2%vals.length]<=90){
                        x = i-65;
                        Nvals[count]=((x+(vals[count2%vals.length]-65))%26)+65;//changing the ascii's of input depending on key ascii's
                        count++;
                        count2++;
                    }
                    else if(97<=vals[count2%vals.length] && vals[count2%vals.length]<=122){
                        x = i-65;
                        Nvals[count]=((x+(vals[count2%vals.length]-97))%26)+65;//same except if key is lowercase
                        count++;
                        count2++;
                    }
                }
                else if(97<=i && i<=122){//lowercase letters
                    if(65<=vals[count2%vals.length] && vals[count2%vals.length]<=90){
                        x = i-97;
                        Nvals[count]=((x+(vals[count2%vals.length]-65))%26)+97;//same with uppercase
                        count++;
                        count2++;
                    }
                    else if(97<=vals[count2%vals.length] && vals[count2%vals.length]<=122){
                        x = i-97;
                        Nvals[count]=((x+(vals[count2%vals.length]-97))%26)+97;//same with lowercase
                        count++;
                        count2++;
                    }
                }
                else{
                    count++;
                }
            }
            count = 0;
            for(int i : Nvals){
                Nchars[count]=(char)i;
                count++;
            }
            String output = new String(Nchars);
            return output;
        }
        return "Key must contain only letters";//output if key in not only letters
    };
    public static String decrypt(String input,String key){//same as encrypt except subtraction/backwards
        if(key.matches("[a-zA-Z]+")){
            char[] chars = key.toCharArray();
            int vals[] = new int[chars.length];
            int count = 0;
            int count2 = 0;
            for(char c : chars){
                vals[count]=c;
                count++;
            }
            char[] Nchars = input.toCharArray();
            int Nvals[] = new int[Nchars.length];
            count = 0;
            for(char c : Nchars){
                Nvals[count]=c;
                count++;
            }
            count = 0;
            int x;
            for(int i : Nvals){
                if(65<=i && i<=90){
                    if(65<=vals[count2%vals.length] && vals[count2%vals.length]<=90){
                        x = i-65;
                        Nvals[count]=((x-(vals[count2%vals.length]-65)+26)%26)+65;//adding 26 to prevent negative values
                        count++;
                        count2++;
                    }
                    else if(97<=vals[count2%vals.length] && vals[count2%vals.length]<=122){
                        x = i-65;
                        Nvals[count]=((x-(vals[count2%vals.length]-97)+26)%26)+65;
                        count++;
                        count2++;
                    }
                }
                else if(97<=i && i<=122){
                    if(65<=vals[count2%vals.length] && vals[count2%vals.length]<=90){
                        x = i-97;
                        Nvals[count]=((x-(vals[count2%vals.length]-65)+26)%26)+97;
                        count++;
                        count2++;
                    }
                    else if(97<=vals[count2%vals.length] && vals[count2%vals.length]<=122){
                        x = i-97;
                        Nvals[count]=((x-(vals[count2%vals.length]-97)+26)%26)+97;
                        count++;
                        count2++;
                    }
                }
                else{
                    count++;
                }
            }
            count = 0;
            for(int i : Nvals){
                Nchars[count]=(char)i;
                count++;
            }
            String output = new String(Nchars);
            return output;
        }
        return "Key must contain only letters";//output if key is not letters
    };
}
