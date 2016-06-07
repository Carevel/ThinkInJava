package chapter13.strings.strings;

import java.util.Random;

/**
 * Created by Changjiang on 2016/6/8.
 */
public class UsingStringBuilder {
    public static Random random=new Random(47);

    @Override
    public String toString() {
        StringBuffer result=new StringBuffer("[");
        for(int i=0;i<25;i++){
            result.append(random.nextInt(100));
            result.append(",");
        }
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb=new UsingStringBuilder();
        System.out.println(usb);
    }

}
