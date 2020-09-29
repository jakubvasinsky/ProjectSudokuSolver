import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Tile {

    private int value;
private Set <Integer> available;

    public Tile(int value) {

        this.value = value;
        if (value>0){
            available=null;
        }else {
           Integer [] temp={1,2,3,4,5,6,7,8,9};
            Collections.addAll(available, temp);
        }

    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
public boolean contain(int value){
        return available.contains(value);
}
   public void remove(int value){
        available.remove(value);
   }

public void add(int value){
        available.add(value);
}
public int getSize(){
        return available.size();
}


}
