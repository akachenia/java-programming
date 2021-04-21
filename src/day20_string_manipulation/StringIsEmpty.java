package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args){
        String jobTitle ="";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length()==0);

        if(jobTitle.isEmpty()){
            System.out.println("JobTitle is missing, please resend");
        }else{
            System.out.println("Job title looks good");
        }
        if(jobTitle.length() == 0){
            System.out.println("jobTitle is empty");

        }else{
            System.out.println("job title is not empty");
        }
        System.out.println(jobTitle.equals(""));
        if("".equals(jobTitle)){
            System.out.println("Job title is empty");
        }
        String word = " ";
        System.out.println(word.isEmpty());

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());//false
        //if veggie is not empty, print we have carrots

        if(!veggie.isEmpty()){
            System.out.println("We have carrots");
        }
        //String word2;
      // System.out.println(word2.isEmpty()); ERRor
    }
}
