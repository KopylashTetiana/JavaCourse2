package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();//rowtype - сырой тип. Поскольку мы не указали тип list, то могут выбрасываться Exceptions,
        //так писать вообще никогда не стоит.
//        list.add("ok");
//        list.add(12);
//        list.add(new StringBuilder("dfgdjflhsdfg"));
//        list.add(new Car());
        list.add("privet");
        list.add("poka");
        list.add("pdpfgf");
        list.add(new Car());
for(Object o: list){
    System.out.println(o+" dlina"+((String)o).length());
}
    }
}
class Car{}