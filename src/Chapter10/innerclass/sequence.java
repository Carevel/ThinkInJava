package Chapter10.innerclass;

/**
 * Created by Changjiang on 2015/7/4.
 * ������ ģʽ
 */
interface Selector{
    boolean end();
    void next();
    Object current();
}
public class sequence {
    private Object[] items;
    private int next=0;
    public sequence(int size){items=new Object[size];}
    public void add(Object x){
        if(next!=items.length){
            items[next++]=x;
        }
    }

    private class SequenceSelector implements Selector{
        private int i=0;
        public boolean end() {
            return i==items.length;
        }

        public void next() {
            if(i<items.length) i++;
        }

        public Object current() {
          return items[i];
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String[] args) {
       sequence sequnce=new sequence(10);
        TequenctTest t=new TequenctTest("a");
        for(int i=0;i<sequnce.items.length;i++){
            sequnce.add(Integer.toString(i));
            sequnce.add(t);
        }


       Selector selector=sequnce.selector();
        while(!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
