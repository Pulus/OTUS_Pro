package objects;

import objects.fruit.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    private final Box<Apple> box1 = new Box<>();
    private final Box<Orange> box2 = new Box<>();
    private final Box<Apple> box3 = new Box<>();
    private final Box<Fruit> box4 = new Box<>();
    @Test
    void weight() {
        box1.add(new Apple(10.0));
        box1.add(new Apple(15.3));
        assertEquals(25.3,box1.weight());

        box4.add(new Fruit(11.1));
        box4.add(new Fruit(51.3));
        assertEquals(62.4,box4.weight());

    }
    @Test
    void compare() {
        box1.add(new Apple(10.0));
        box1.add(new Apple(15.3));
        box2.add(new Orange(10.0));
        box2.add(new Orange(15.3));
        assertEquals(box1.weight(),box2.weight());
        assertTrue(box1.compare(box2));
    }
    @Test
    void overload() {
        box1.add(new Apple(10.0));
        box1.add(new Apple(15.3));
        box3.add(new Apple(5.0));
        Double temp = box1.weight();
        box1.overload(box3);
        assertEquals(Double.sum(temp,5.0),box3.weight());
    }
}