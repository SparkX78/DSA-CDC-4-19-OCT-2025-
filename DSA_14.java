public class DSA_14 {
    public static void solve(String s){
        int vowels = 0;
        int consonants = 0;
        int space = 0;
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;

            }
            else if( ch >= 'a' && ch <= 'z'){
                consonants++;
            }
            else if(ch == ' '){
                space ++;
            }

        }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(space);
        


       

    }
    public static void main(String args[]){
        String s = "Take u forward is Awesome";
        solve(s);

    }
    
}
