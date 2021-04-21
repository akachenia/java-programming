package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args){
        loginVoid("CybertekStudent", "abc123"); //positive test/ Sunny day
        loginVoid("cybertek", "answer"); // negative test/ rainy
        loginVoid("", "");
        System.out.println(login("cybertekStudent", "abc123"));

        if(login("cybertekStudent", "abc123")){
            System.out.println("Login succesful, welcome to Canvas");
            System.out.println("Select the course to continue");
        }else{
            System.out.println("Login failed");
        }

        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("Welcome to Canvas, select course or calendar");
  //  }else{
        System.out.println("Something wrong with your ");
    }


    public static void loginVoid(String username, String password)
    {
        String secretUsername ="cybertekStudent";
        String secretPassword = "abc123";

        if(username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)){
            System.out.println("Login successful, welcome CyberytekStudent!");
        }else {
            System.out.println("Incorrect username or password");
        }


    }
           public static boolean login(String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
            return true;
        }

               return false;
           }
        }


