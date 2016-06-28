package chapter14.typeinfo;

/**
 * Created by Changjiang on 2016/6/28.
 */
public class Position {
    private String title;
    private Person person;

    public Position(String title, Person person) {
        this.title = title;
        this.person = person;
        if(person==null){
            person=Person.NULL;
        }
    }
}
