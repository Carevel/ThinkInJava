package chapter11.holding;

/**
 * Created by Changjiang on 2016/04/21.
 */
public class Person {
    Person(String _userName){
        this.userName=_userName;
    }
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return this.userName+":"+super.toString();
    }
}
