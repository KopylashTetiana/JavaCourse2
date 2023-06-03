package nested_classes.anonymous_class;

public class AnonymousClass1 {
    private int x = 5; //anonymous class имеет доступ к private elements его внешнего класса
    public static void main(String[] args) {
        Math m = new Math() { //Объект m, его тип Math, а ссылается он на какой-то анонимный
            // класс (без имени), который Override метод doOperation и делает сложение.
            int c = 10; // здесь можно прописать любые поля, которые могут быть у класса.
            void abc() { }
            @Override
            public int doOperation(int a, int b) {
                AnonymousClass1 aC = new AnonymousClass1();
                return a + b + aC. x;
            }
        };  //не забывай поставить ; в конце закрывающей скобки }, потому что все, что написано
        // до этой скобки, относится к statement-у создания объекта Math m.
        Math m2 = new Math() { //объект Math m2 ссылается на какой-то анонимный класс,
            // который Override doOperation и делает умножение.
            @Override
            public int doOperation(int a, int b) { return a * b; }
        }; //здесь нужно поставить ; потому что здесь заканчивается строка создания объекта m2
        System.out.println(m.doOperation(3, 6));
        System.out.println(m2.doOperation(3,6));
    }

}

interface Math {
    int doOperation(int a, int b);
}