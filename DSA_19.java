import java.util.*;
public class DSA_19 {
    public static String removeDup(String s){
        HashSet<Character> set = new HashSet<>();
        StringBuilder ans = new StringBuilder(s.length());
        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                ans.append(ch);
                set.add(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String args[]){
        String s = "APPLE";
        System.out.println(removeDup(s));
    }
    


}
