package events;
import package.users.user;

public class event{
    

    public void comingToEvent(boolean user_attending_event){
      if(user_attending_event){
        System.out.println("coming to event");
      }  

    }

    public static void main(String[] args){
        comingToEvent(users.user.satinder);

    }
}