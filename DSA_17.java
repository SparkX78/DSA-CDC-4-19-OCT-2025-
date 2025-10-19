public class DSA_17{
    public static char solve(String s){
        
        char maxChar = s.charAt(0);
        int curr_freq = 1;
        int max_freq = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                curr_freq++;
            }
            else{
                if(curr_freq > max_freq){
                    max_freq = curr_freq;
                    maxChar = s.charAt(i-1);
                }
                curr_freq = 1;
            }
        }
        if(curr_freq > max_freq){
            
            maxChar = s.charAt(s.length() - 1);
        }
        return maxChar;

    }
    public static void main(String args[]){
        String s = "ENCYCLOPEDIA IS A GREAT BOOK";
        System.out.println(solve(s));
    }
}