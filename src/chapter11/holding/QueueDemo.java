package chapter11.holding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by Changjiang on 2016/04/21.
 */
public class QueueDemo {
    public static void printQ(Queue queue){
        while(queue.peek()!=null){
            System.out.print(queue.remove()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<Integer>();
        Random random=new Random(47);
        for(int i=0;i<10;i++){
            queue.add(random.nextInt(10));
        }
        printQ(queue);
        Queue<Character> qc=new LinkedList<Character>();
        for(char c :"Brontosa".toCharArray()){
            qc.offer(c);
        }
        printQ(qc);
        System.out.println();
    }
}
