package users;

public class user{

    String user_name;
    int age;
     boolean is_subscribed;
    String dob;
    boolean attending_event;
    
    public user(String name_input, int age_input, boolean subs_input, String birth_input, boolean attend_event){
        user_name = name_input;
        age = age_input;
        is_subscribed = subs_input;
        dob = birth_input;
        attending_event = attend_event;
    }

    public void comingToEvent(){
        if(this.is_subscribed){
            System.out.println(" is subscribed");
        }
    }
    public static void main(String[] args){
        user satinder = new user("satinder",28,true,"1994-11-15",true);
        user sam = new user("Sam", 26, false, "1996-07-24",false);
        user nuhaar = new user("Nuhaar",2,false,"2021-05-11",true);
        user jag = new user("jag",55,true, "1967-03-06",false);
        user amb = new user("amb", 5, false, "2018-01-16",true);

        satinder.comingToEvent();


    }
}