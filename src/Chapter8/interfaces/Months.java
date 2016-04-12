package Chapter8.interfaces;

/**
 * Created by Changjiang on 2015/6/28.
 * 接口中的常量默认是隐匿的static 和final
 */

public interface Months {
    int JANUARY=1,FEBRUARY=2,MARCH=3,APRIL=4,MAY=5,JUNE=6,JULY=7,AUGUST=8,SPETEMBER=9,OCTOBER=10,NOVEMBER=11,DECEMBER=12;
}
class test{
    public static void main(String[] args) {
        System.out.println(Months.DECEMBER);
    }

}