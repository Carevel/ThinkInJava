package chapter17.containers;

/**
 * Created by Changjiang on 2017/02/05.
 */
public class AssociativeArray<K,V> {
    private Object[][] pairs;
    private int index;
    public  AssociativeArray(int length){
        pairs=new Object[length][2];
    }
    public void put(K key,V value){
        if(index>=pairs.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        pairs[index++]=new Object[]{key,value};
    }
    public V get(K key){
        for(int i=0;i<pairs.length;i++){
            if(key.equals(pairs[i][0])){
                return (V) pairs[i][1];
            }
        }
        return  null;
    }

    @Override
    public String toString() {
        StringBuilder  stringBuilder=new StringBuilder();
        for(int i=0;i<index;i++){
            stringBuilder.append(pairs[i][0].toString());
            stringBuilder.append(":");
            stringBuilder.append(pairs[i][1].toString());
            if(i<index-1){
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        AssociativeArray<String,String> map=new AssociativeArray<>(4);
        map.put("sky","blue");
        map.put("grass", "green");
        map.put("ocean","dancing");
        map.put("tree","tall");
        try{
            map.put("extra","object");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("to many objects!");
        }
        System.out.println(map);
        System.out.println(map.get("ocean"));
    }
}
