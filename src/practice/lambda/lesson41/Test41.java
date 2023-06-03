package practice.lambda.lesson41;

//самый простой пример применения лямбда выражения
public class Test41 {
    static String word;

    public static void main(String[] args) {
        SomeNumber sn = (str) -> {//блок с лямбда выражением
            if (str == null) {  //пишем метод, который возвращает длину строки (или 0, если строка = null)
                return 0;
            } else return str.length();
        }; //не забываем здесь ставить ';'
        System.out.println(word);
        System.out.println(sn.myOperation(word));
        word += ""; //очень любопытное свойство: значение null после этой операции превратился в строку
        System.out.println(word);
        System.out.println(sn.myOperation(word));
    }

}

interface SomeNumber { //метод принимает строку, а возвращает число:
    int myOperation(String str);
}