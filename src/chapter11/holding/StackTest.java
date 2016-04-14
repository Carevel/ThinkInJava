package chapter11.holding;

import java.util.*;

/**
 * Created by Changjiang on 2016/04/14.
 */
public class StackTest {
    public static void main(String[] args) {
        StackGeneric<String> stack=new StackGeneric<String>();
        for(String s : "My dog has fleas".split(" ")){
            stack.push(s);
        }
        while(!stack.empty()){
            System.out.print(stack.pop()+ " ");
        }
        System.out.println();
        java.util.Stack<String> stack1=new java.util.Stack<String>();
        for(String s : "My dog has fleas".split(" ")){
            stack1.push(s);
        }
        while(!stack1.empty()){
            System.out.print(stack1.pop()+" ");
        }
    }
}
