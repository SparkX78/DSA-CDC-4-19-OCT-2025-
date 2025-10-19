import java.util.*;
public class DSA_16 {
    public static String sortString(String s){
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return new String(s);
    }
    public static void countFreq(String s){
        s = sortString(s);
        char ch = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ch){
                count++;
            }
            else{
                System.out.print(ch);
                System.out.print(count + " ");
                ch = s.charAt(i);
                count = 1;
            }
        }
        System.out.print(ch);
        System.out.print(count + " ");

    }
    public static void main(String args[]){
        String s= "apple";
        sortString(s);
        countFreq(s);
    }
}
