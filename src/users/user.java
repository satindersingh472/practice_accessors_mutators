package users;

public class user{
   
    String user_name;
    int age;
    boolean is_subscribed;
    String dob;
    
    public user(String name_input, int age_input, boolean subs_input, String birth_input){
        user_name = name_input;
        age = age_input;
        is_subscribed = subs_input;
        dob = birth_input;
    }
    public static void main(String[] args){
        user satinder = new user("satinder",28,true,"1994-11-15");
        user sam = new user("Sam", 26, false, "1996-07-24");
        user nuhaar = new user("Nuhaar",2,false,"2021-05-11");
        user jag = new user("jag",55,true, "1967-03-06");
        user amb = new user("amb", 5, false, "2018-01-16");

    }
}