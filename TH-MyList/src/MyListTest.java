import java.util.Arrays;
public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);
        listInterger.add(5);

        System.out.println("element 5: "+listInterger.get(4));
        System.out.println("element 3: "+listInterger.get(2));
        System.out.println("element 2: "+listInterger.get(1));


    }
}

