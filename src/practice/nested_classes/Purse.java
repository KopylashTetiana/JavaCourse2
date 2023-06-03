package practice.nested_classes;
import java.util.Map;
import java.util.HashMap;
//пытаюсь реализовать учетчик налички в кошельке
public class Purse { //кошелек
    String ownerName;   //имя владельца
    static String mainCurrency = "UAH";    //основная валюта
    private Map <String, Double> cash = new HashMap<>();    //имеющаяся наличка

    public Purse(String ownerName) { //creating of purse
        this.ownerName = ownerName;
    }



    public class Cash { //наличка
        double count;       //количество
        String currencyName;        //название валюты
        //double course;      //курс к основной валюте
//        double sum(double count2) {
//            return count + count2;
//        }
//        double substraction(double count2) {
//            return count - count2;
//        }
    }

    public static void main(String[] args) {
        Purse myPurse = new Purse("Tresp");
    }
}
