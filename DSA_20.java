public class DSA_20 {
    public static int countNoOFwords(String s){
        int count = 0;
        for(char ch: s.toCharArray()){
            if(ch == ' '){
                count++;
            }
        }
        return count+1;

    }
    public static void main(String args[]){
        String s = "Gorilla is a Intelligent Animal in this Earth";
        System.out.println("The number of words in this sentence are :"+ countNoOFwords(s));
    }
}
