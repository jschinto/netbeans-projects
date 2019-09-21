/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypter;
import java.util.ArrayList;
/**
 *
 * @author jakes_000
 */
public class EncrypterModel {
    static ArrayList<String> username = new ArrayList();
    static ArrayList<String> password = new ArrayList();//storing the info
    static ArrayList<String> creditcard = new ArrayList();
    static ArrayList<String> socialsecurity = new ArrayList();
    public static String encrypt(String input,String key,String cc,String ss,String pass){
        if(input.matches("[A-Za-z0-9]+")){
        if(pass.matches("[A-Za-z0-9]+")){//requirements
        if(cc.matches("[0-9]+")&&cc.length()==16){
        if(ss.matches("[0-9]+")&&ss.length()==9){
        if(key.matches("[a-zA-Z]+")){//checks if key is only letters
        if(username.contains(user(input,key))==false){
            username.add(user(input,key));
            password.add(user(pass,key));
            creditcard.add(info(cc,key));
            socialsecurity.add(info(ss,key));
            return "Thank you!"+"\n"+"Encrypted Data:"+"\n"+"username: "+user(input,key)+"\n"+"password: "+user(pass,key)+"\n"+"credit card: "+info(cc,key)+"\n"+"social security: "+info(ss,key);
        }
        else{
        return "Username is taken";
        }
        }
        else{
        return "Key must contain only letters";//output if key in not only letters
        }
        }
        else{
            if(ss.contains(" ")||ss.contains("-")){
                return "Social Security is invalid (do not use spaces or dashes)";
            }
        return "Social Security is invalid";
        }
        }
        else{
            if(cc.contains(" ")||cc.contains("-")){
                return "Credit Card is invalid (do not use spaces or dashes)";
            }
        return "Credit Card is invalid";
        }
        }
        else{
        return "Password must include only numbers and letters";
        }
        }
        else{
        return "Username must include only numbers and letters";
        }
        
    };
    public static String decrypt(String input,String key,String pass){//same as encrypt except subtraction/backwards
        if(username.contains(user(input,key))){//checks if user exists
        if(password.get(username.indexOf(user(input,key))).equals(user(pass,key))){//checks if password matches the user
        if(key.matches("[a-zA-Z]+")){
            return "Hello "+input+"!  Here is your stored info:\n"+"password: "+pass+"\n"+"credit card: "+compare(creditcard.get(username.indexOf(user(input,key))),key)+"\n"+"social security: "+compare(socialsecurity.get(username.indexOf(user(input,key))),key);
        }
        else{
            return "Key must contain only letters";//the decrypt function
        }
        }
        else{
            return "Username and Password do not match (password is case sensitive)";
        }
        }
        else{
            return "Account does not exist";
        }
    };
    private static String user(String input,String key){
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
                    if(65<=vals[count2%vals.length] && vals[count2%vals.length]<=90){
                        x = i-48;
                        Nvals[count]=((x+(vals[count2%vals.length]-65))%10)+48;//same with uppercase
                        count++;
                        count2++;
                    }
                    else if(97<=vals[count2%vals.length] && vals[count2%vals.length]<=122){
                        x = i-48;
                        Nvals[count]=((x+(vals[count2%vals.length]-97))%10)+48;//same with lowercase
                        count++;
                        count2++;
                    }
                }
            }
            count = 0;
            for(int i : Nvals){
                Nchars[count]=(char)i;
                count++;
            }
            String usernam = new String(Nchars);
            return usernam;
    }
    private static String info(String data,String key){
        char[] chars = key.toCharArray();//turns the key into a char array
            int vals[] = new int[chars.length];
            int count = 0;//setting up counters
            int count2 = 0;
            for(char c : chars){
                vals[count]=c;//making an int array of the ascii values
                count++;
            }
            char[] Nchars = data.toCharArray();//turns input into a char array
            int Nvals[] = new int[Nchars.length];
            count = 0;
            for(char c : Nchars){
                Nvals[count]=c;//makes int array of ascii values
                count++;
            }
            count = 0;
            int x;
            for(int i : Nvals){
                if(65<=vals[count2%vals.length] && vals[count2%vals.length]<=90){
                        x = i-48;
                        Nvals[count]=((x+(vals[count2%vals.length]-65))%10)+48;//same with uppercase
                        count++;
                        count2++;
                    }
                else if(97<=vals[count2%vals.length] && vals[count2%vals.length]<=122){
                    x = i-48;
                    Nvals[count]=((x+(vals[count2%vals.length]-97))%10)+48;//same with lowercase
                    count++;
                    count2++;
                }
            }
            count = 0;
            for(int i : Nvals){
                Nchars[count]=(char)i;
                count++;
            }
            String information = new String(Nchars);
            return information;
    }
    private static String compare(String input,String key){
        char[] chars = key.toCharArray();
            int vals[] = new int[chars.length];
            int count = 0;
            int count2 = 0;
            for(char c : chars){//compares the number inputs
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
                if(65<=vals[count2%vals.length] && vals[count2%vals.length]<=90){
                        x = i-48;
                        Nvals[count]=((x-(vals[count2%vals.length]-65)+100)%10)+48;
                        count++;
                        count2++;
                    }
                    else if(97<=vals[count2%vals.length] && vals[count2%vals.length]<=122){
                        x = i-48;
                        Nvals[count]=((x-(vals[count2%vals.length]-97)+100)%10)+48;
                        count++;
                        count2++;
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
}
