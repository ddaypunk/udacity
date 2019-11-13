package cs046;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andydelso on 2/23/16.
 */
public class Person {
    private String name;
    private ArrayList<Person> friends;

    public Person(String name){
        this.name = name;
        this.friends = new ArrayList<Person>();
    }

    /* Public Interface Methods */

    public String getFriend(int index){

        return this.friends.get(index).name;
    }


    public String getFriends(){

        return getFriends(", ");
    }

    public String getFriends(String separator)
    {
        String friendsString = "";

        for (int i = 0; i <= friends.size()-1; i++){
            if(i == friends.size()-1){
                friendsString += friends.get(i);
                break;
            }
            friendsString += friends.get(i) + separator;
        }

        return friendsString;

    }

    public void setName(String newName) {

        this.name = newName;
    }

    public void setFriends(List<Person> friends) {

        this.friends.addAll(friends);
    }

    public void addFriend(Person friend){
        this.friends.add(friend);
    }

    public void addEachother(Person friend){

        this.addFriend(friend);
        friend.addFriend(this);
    }

    public void unfriend(Person unfriend){

        int indexToUnfriend = find(unfriend);
        if(indexToUnfriend != -1){
            friends.remove(indexToUnfriend);
        }

    }

    public void unfriendEachother(Person unfriend){

        this.unfriend(unfriend);
        unfriend.unfriend(this);
    }

    public void unfrientMultiple(){
        
    }

    public void renameFriend(Person friend, String newName) {
        friend.name = newName;
    }

    public int getNumFriends(){

        return this.friends.size();


    }

    public void talkTo(Person person) {
        int indexToTalkTo = find(person);

        if(indexToTalkTo != -1){
            friends.remove(indexToTalkTo);
            friends.add(0, person);
        }
    }

    /* private helper methods*/
    private int find(Person friend){
        for (int i = 0; i < friends.size(); i++){
            if (friends.get(i).equals(friend)){
                return i;
            }
        }
        return -1;

    }
}
