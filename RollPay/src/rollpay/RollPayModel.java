/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rollpay;

/**
 *
 * @author jakes_000
 */

public class RollPayModel {
    public static String datel;//I sat for literally an hour trying to fix broken code because this wasn't static :/
    public static Float Owed = 0.00f;
    public static Float hours;
    public static Float bonus;
    public static Float ratel;//these strange names are a result of frustration over my broken code.  reason^^
    public static Object[] tableEdit(){
        Float money = hours*ratel+bonus;//calculates my stuff
        Owed += money;//sets the total owed to add the new amount
        Object[] newRow = {
            datel,
            Float.toString(hours),
            Float.toString(ratel),
            Float.toString(money)
        };
        return newRow;
    }
    //public static String rounder(String s){//I really wanted two decimal values at all times
      //  String l ="";
        //int x=0;
       // for(int i=0;i<s.length();i++){
            
         //   char c = s.charAt(i);System.out.println(c);
         //   if(Character.toString(c).equals(".")){
          //      System.out.println(l);
           //     x=1;
          //      l+=".";
            //    if(s.length()-i>=2){
              //      l+=Character.toString(s.charAt(i+1))+Character.toString(s.charAt(i+2));
               //     return l;
              //  }
              //  else if(s.length()-i==1){
               //     l+=Character.toString(s.charAt(i+1))+"0";
                //    return l;
              //  }
               // else if(s.length()-i==0){
               //     l+="00";
                //    return l;
              //  }
           // }
           // else{
            //    l+=Character.toString(s.charAt(i));
           // }
        //}
        //return l;
    //}
}
