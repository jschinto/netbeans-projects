/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtime;
import java.util.Arrays;

/**
 *
 * @author jakes_000
 */
public class SortingTimeModel {
    private static String[] input;
    private static String[] newArray;
    private static int len;
    public static String selectionSort(String in){
        if(in.length()==0){
            return "Please Enter Something";//Checking to Reduce Errors
        }
        else if(in.contains(" ")||in.contains(",,")||in.indexOf(",")==0){
            return "No Spaces Please";
        }
        else if(in.matches("[-,0-9]+")==false||in.contains("-,")){
            return "Only Numbers";
        }
        input = in.split(",");
        int x;
        if(input.length == 1){//This Creates a random array if one number entered
            if(in.contains("-")){
                return "Not a valid Index";
            }
            input = new String[Integer.parseInt(input[0])];
            for(x=0;x<input.length;x++){
                input[x] = String.valueOf((int) (Math.random() * (100)));
            }
        }
        int y = 0;
        String temp;
        for(x=0;x<input.length;x++){
            y=x;
            for(int i=x;i<input.length;i++){
                if(Integer.parseInt(input[y])>Integer.parseInt(input[i])){//checking if less than
                    y=i;
                }
            }
            temp=input[y];
            input[y]=input[x];
            input[x]=temp;//switching the two values and repeat
        }
        return Arrays.toString(input);//output
    }
    public static String insertionSort(String in){
        if(in.length()==0){
            return "Please Enter Something";
        }
        else if(in.contains(" ")||in.contains(",,")||in.indexOf(",")==0){//checks if legal
            return "No Spaces Please";
        }
        else if(in.matches("[-,0-9]+")==false||in.contains("-,")){
            return "Only Numbers";
        }
        input = in.split(",");
        int x;
        if(input.length == 1){
            if(in.contains("-")){
                return "Not a valid Index";
            }
            input = new String[Integer.parseInt(input[0])];//RNG
            for(x=0;x<input.length;x++){
                input[x] = String.valueOf((int) (Math.random() * (100)));
            }
        }
        int y = 0;
        String temp;
        for(x=1;x<input.length;x++){//Sorting function
            y=0;
            temp = input[x];
            for(int i=x;i>0;i--){
                if(Integer.parseInt(temp)<Integer.parseInt(input[i-1])){
                    input[i]=input[i-1];//compares and finds the place where anumber fits at the beginning and inserts it
                }
                else{
                    input[i]=temp;
                    y=1;
                    i=0;
                }
            }
            if(y==0){
                input[1]=input[0];//if it gets to the end and not found it must be first number
                input[0]=temp;
            }
        }
        return Arrays.toString(input);
    }
    public static String mergeSort(String in){//this one got complicated so i tried to go overboard on comments to keep you on track
        if(in.length()==0){
            return "Please Enter Something";
        }
        else if(in.contains(" ")||in.contains(",,")||in.indexOf(",")==0){//check if valid entry
            return "No Spaces Please";
        }
        else if(in.matches("[-,0-9]+")==false||in.contains("-,")){
            return "Only Numbers";
        }
        input = in.split(",");
        int x;
        if(input.length == 1){
            if(in.contains("-")){
                return "Not a valid Index";
            }
            input = new String[Integer.parseInt(input[0])];//RNG
            for(x=0;x<input.length;x++){
                input[x] = String.valueOf((int) (Math.random() * (100)));
            }
        }
        len = 0;//length of newArray at a given time
        String[] left;//Left array
        String[] right;//Right array
        newArray = new String[input.length];//new array
        int siz;//size of sub arrays left/right
        for(siz=1;siz<input.length;siz=siz*2){//starting with one element the sub arrays double each time they merge
        for(int p = 0;p<input.length;){//goes through each pair and stores it in left or right then merges two and makes it a new pair
                left = add(input,p,siz);//adds numbers to left array starting at index p and continuing until the given size(siz)
                p=p+siz;//adding the size to the index so that the numbers dont repeat in next array
                right = add(input,p,siz);//same for right side
                p=p+siz;
                merge(left,right,siz,len);//merges the two
        }
        input = newArray;//input is now newArray to continue improving its sortedness
        len = 0;//resets length for new groups/merge
        }
        return Arrays.toString(newArray);//returns finished product
    }
    private static String[] add(String[] inp,int p, int siz){//(input,place in array,size of each array)
        String[] out = new String[siz];
        for(int x = 0;x<siz;x++){//goes adding numbers until size limit is reached
            if(p<inp.length){//it didn't like me adding to nonexisting spaces lol
                out[x]=inp[p];//adds to the return array
                p++;
            }
            else{
                return out;//to reduce pointless looping
            }
        }
        return out;//if filled up array
    }
    private static void merge(String[] lef,String[] righ,int m,int p){//main merge function elements:(Left array,Right array,size of sub arrays,current size of new array)
        int h = 0;//index of left array that has been merged
        int r = 0;//index of right array that has been merged
        for(int x = p;x<p+m*2;x++){//loops through until all sub array content has been compared/merged
            if(len<input.length){//will not continue if Array is finished this lets me have remainder/odd number index and still merge
                if(h!=m&&r!=m&&lef[h]!=null&&righ[r]!=null){//fixed all errors for null and array limit
                    if(Integer.parseInt(lef[h])<Integer.parseInt(righ[r])){//putting numbers in right order
                        newArray[len]=lef[h];
                        len++;
                        h++;
                    }
                    else {
                        newArray[len]=righ[r];
                        len++;
                        r++;
                    }
                }
                else if(h==m||lef[h]==null){//if left is empty of non-null ints stop accessing left and finish with right
                    newArray[len]=righ[r];
                    len++;
                    r++;
                }
                else if(r==m||righ[r]==null){//same except if right is empty only use left
                    newArray[len]=lef[h];
                    len++;
                    h++;
                }
            }
        }
    }
    public static String bubbleSort(String in){
        if(in.length()==0){
            return "Please Enter Something";
        }
        else if(in.contains(" ")||in.contains(",,")||in.indexOf(",")==0){
            return "No Spaces Please";
        }
        else if(in.matches("[-,0-9]+")==false||in.contains("-,")){
            return "Only Numbers";
        }
        input = in.split(",");
        int x;
        if(input.length == 1){
            if(in.contains("-")){
                return "Not a valid Index";
            }
            input = new String[Integer.parseInt(input[0])];//RNG
            for(x=0;x<input.length;x++){
                input[x] = String.valueOf((int) (Math.random() * (100)));
            }
        }
        int y = 0;
        String temp;
        for(x=0;x<input.length;x++){//the function
            y=x;
            for(int i=0;i<input.length-x-1;i++){//each time the last will be correct, so don't run it as much
                if(Integer.parseInt(input[i])>Integer.parseInt(input[i+1])){
                    temp=input[i+1];
                    input[i+1]=input[i];//switches to put in order
                    input[i]=temp;
                }
            }
        }
        return Arrays.toString(input);
    }
}
