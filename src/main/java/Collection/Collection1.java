package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection1 {
    public static void main(String[] args)
    {

//        Collection values = new ArrayList();
//        values.add(4);
//        values.add(6);
//        values.add(9);
//        values.add(10);

        List values = new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);
        values.add("2");
        values.add(1,9);
////
	System.out.println(values);

////		for(int i=0;i<values.size();i++)
//        for(Object o : values)
//        {
//            System.out.println(o);
////			System.out.println(values.get(i));
//        }
    }
}
