package Chapter8.interfaces;

/**
 * Created by Changjiang on 2015/6/30.
 * ��������ģʽ
 * ����
 *
 * ��������ģʽ�ܽ�
 * 1. ���඼�̳���ͬһ���ӿ�
 * 2. ����ÿһ�����;���һ���๤����֮����
 */
interface Game{boolean move();}
interface GameFactory{Game getGame();}
class Checkers implements Game{
    private int moves=0;
    private static final int MOVES=3;
    @Override
    public boolean move(){
        System.out.println("Checkers move "+moves);
        return ++moves!=MOVES;
    }
}
class CheckersFactory implements GameFactory{
    public Game getGame(){
        return new Checkers();
    }
}
class Chess implements Game{
    private int moves=0;
    private static final int MOVES=4;
    @Override
    public boolean move(){
        System.out.println("Chess move "+moves);
        return ++moves!=MOVES;
    }
}
class ChessFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Checkers();
    }
}
public class Games {
    public static void playGame(GameFactory gameFactory){
        Game s=gameFactory.getGame();
        System.out.println(s.move());
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
    }
}
