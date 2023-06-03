package lambda;
//ещё один простой пример применения лямбда-выражений
public class Test2 {
    public static void def(I i) { //в метод def в параметр вставляем объект типа I
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        def((String str) -> str.length()); //lambda expression: пишем,
        // что должен делать метод интерфейса I в данном случае
        def((String str) -> str.indexOf('e'));//lambda expression
        def((String str) -> str.indexOf('v', 4));//lambda expression.
        // Поскольку после 4-го индекса нет символа 'v', то результат -1
    }

}

interface I {
    int abc(String s);
}