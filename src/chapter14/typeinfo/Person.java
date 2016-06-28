package chapter14.typeinfo;

/**
 * Created by Changjiang on 2016/6/28.
 */
class Person {
    public final String first;
    public final String last;
    public final String address;

    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person:" + first + " " + last + " " + address;
    }
    public static class NullPerson extends Person implements Null{
        public NullPerson(){
            super("None","None","None");
        }
        public NullPerson(String first, String last, String address) {
            super(first, last, address);
        }
        public String toString(){
            return "NullPerson";
        }
    }
    public static final Person NULL=new NullPerson();
}

