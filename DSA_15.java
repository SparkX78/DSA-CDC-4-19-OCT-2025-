public class DSA_15 {
    public static String removeNonAlpha(String s){
        StringBuilder result = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String args[]){
        String s = "Ram is a good person.";
        System.out.println(removeNonAlpha(s));
    }
}
