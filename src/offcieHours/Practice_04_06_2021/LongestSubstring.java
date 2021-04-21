package offcieHours.Practice_04_06_2021;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddeeeeeee";
        String longestSubstring = "";
        String temp = "";
        for(int i = 0; i < str.length()-1; i++){
            temp += str.charAt(i); // aaa

            if(i == str.length()-2){
                System.out.println(i);
                temp+= str.charAt(i + 1);
            }
            if(str.charAt(i) != str.charAt(i + 1)){

                if(temp.length() > longestSubstring.length()){
                    longestSubstring = temp;
                }

                temp = "";

            }

        }

        System.out.println("Longest substring " + longestSubstring);

    }
}
