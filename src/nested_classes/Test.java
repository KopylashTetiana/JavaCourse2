package nested_classes;

public class Test { //Top level (внешний класс). Он находится в package. По аналогии
    // с переменными, внутри этого класса можно создавать другие классы тоже. они
    // будут называться nested classes. Какие варианты nested classes существуют:
    static class A {    } //static nested class
    class B {    }        //inner class
    void method() {
        class C {   }     //local class (локальный)
    }
    //есть ещё anonymous (анонимный) class
}
