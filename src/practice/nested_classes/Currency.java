package practice.nested_classes;
//1. инкапсулировать значения валют, создать геттеры и сеттеры их значений либо количества.
//2. запретить проводить операции с минусовым остатком
//3. создать класс, в котором хранить коллекцию данных валют (кошелек) и проводить над ними операции.
//4. создать интерфейс через System.in, чтобы вводить валюты и их количество, проводить операции из консоли.
public class Currency { //валюта.
    String nameOfCurrency = "UAH";
    double countOfCash = 0;
    double course = 1; //course to UAH.

    public Currency(String nameOfCurrency, double countOfCash, double course) {
        this.nameOfCurrency = nameOfCurrency;
        this.countOfCash = countOfCash;
        this.course = course;
    }
    @Override
    public String toString() {
        return "There are " + countOfCash + " " + nameOfCurrency + " in the wallet.";
    }

    public void addCash(double amountOfCash) {
        countOfCash += amountOfCash;
        System.out.println(amountOfCash + " " + nameOfCurrency + " were added to the wallet.");
        System.out.println(this.toString());
    }

    public void takeAwayCash(double amountOfCash) {
        countOfCash -= amountOfCash;
        System.out.println(amountOfCash + " " + nameOfCurrency + " were taken away from the wallet.");
        System.out.println(this.toString());
    }
    //продати amount цієї валюти, придбати валюту, що в параметрі:
    public void sellCurrency(double amount, Currency anotherCurrency) {
        double exCourse = this.course/anotherCurrency.course;
        System.out.println("Currency exchange: course of " + this.nameOfCurrency + " to " + anotherCurrency.nameOfCurrency + " = " + exCourse);
        this.takeAwayCash(amount);
        anotherCurrency.addCash(amount*exCourse);
    }
    //купити amount цієї валюти, замість валюти, що в параметрі:
    public void buyCurrency(double amount, Currency anotherCurrency) {
        double exCourse = this.course/anotherCurrency.course;
        System.out.println("Currency exchange: course of " + this.nameOfCurrency + " to " + anotherCurrency.nameOfCurrency + " = " + exCourse);
        this.addCash(amount);
        anotherCurrency.takeAwayCash(amount*exCourse);
    }

    public static void main(String[] args) {
        Currency hrn = new Currency("UAH", 2000, 1);
        Currency $ = new Currency("USD", 110, 27);
        Currency eur = new Currency("EUR", 50, 32);
        System.out.println(hrn.toString());
        System.out.println($.toString());
        System.out.println(eur.toString());
        hrn.addCash(1000);
        $.takeAwayCash(10);
        $.sellCurrency(100, hrn);
        $.buyCurrency(50, hrn);
        System.out.println(hrn.toString());
        System.out.println($.toString());
        System.out.println(eur.toString());
        System.out.println();
        eur.buyCurrency(50, $);
    }


}