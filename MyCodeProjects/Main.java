package com.company;
import javax.lang.model.element.Name;
import java.util.LinkedList;
import java.util.*;
    public class Main {


        public static boolean check(String password, String attempt) {
            if (password.equals(attempt)) {
                return true;
            } else
                return false;
        }

        public static int passLength(String password) {
            int length = password.length();
            return length;
        }
        

        public static void main(String[] args) {

            ArrayList<String> passwordDatabases = new ArrayList<String>();
            passwordDatabases.add("Welcome123");
            passwordDatabases.add("Password5555");
            passwordDatabases.add("Password444");
            passwordDatabases.add("Database3334");
            passwordDatabases.add("Password123!");
            //System.out.print(passwordDatabases);





            String[][] passwordDatabase = {{"hello", "HomesDs", "HELLO", "Java123"}, {"Hell", "passLetter", "Youdee123"}};
            Scanner read = new Scanner(System.in);
            String attempt = read.nextLine();
            String password = "passWord";
            String fail = "Your input is not a correct password";
            String success = "The password you have input is correct";
            int passLen = password.length();
            System.out.println(passLen);
            for (int i = 0; i < passwordDatabase.length; i++) {
                if (passLength(passwordDatabase[0][i]) == passLength(passwordDatabase[1][i])) {
                    if (check(passwordDatabase[1][i], passwordDatabase[0][i]) == true) {
                        System.out.println(success);
                    } else {
                        System.out.println(fail);
                    }
                } else {
                    System.out.println(fail);
                }


                for (String s : passwordDatabases) {
                    if (s.equals(attempt))
                        System.out.println("Password Correct");

                    else

                        System.out.println("Password is Incorrect");
                }





                {
                    String username = "AliAbuukarTSI.com";
                    String userpassword = "StrongPassword";
                    Map credentials = new HashMap();
                    credentials.put("AliAbuukarTSI.com","StrongPassword" );
                    credentials.put("AliTSI.COM", "WeakPasswords");
                    System.out.println(credentials.containsKey(username));
                    System.out.println(credentials.get(userpassword));

                    {


                    }
                }
            }
        }
    }