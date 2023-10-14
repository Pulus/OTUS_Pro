package objects;

import objects.fruit.*;

import java.util.ArrayList;
import java.util.Objects;

public class Box <T extends Fruit>{
    private final ArrayList <T> fruitArrayList = new ArrayList<>();
    public void add(T obj){
        this.fruitArrayList.add(obj);
    }
    public Double weight(){
        Double result = 0.0;
        for (T obj : fruitArrayList){
            result += obj.getMass();
        }
        return result;
    }
    public boolean compare(Box<?> box){
        return Objects.equals(weight(), box.weight());
    }
    public void overload(Box<T> box){
        for (T obj : fruitArrayList){
            box.add(obj);
        }
        this.fruitArrayList.clear();
    }
}
