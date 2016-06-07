package chapter13.strings.strings;

/**
 * Created by Changjiang on 2016/6/5.
 */
public class WhitherStringBuilder {
    public String implicit(String[] fields){
        String result="";
        for(int i=0;i<fields.length;i++){
            result+=result+fields[i];
        }
        return result;
    }
    public String explicit(String[] fields){
        StringBuffer result=new StringBuffer();
        for(int i=0;i<fields.length;i++){
            result.append(fields[i]);
        }
        return result.toString();
    }
}
