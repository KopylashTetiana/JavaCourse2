package practice.lambda.lesson41;
//Nested methods. метод вызывает метод.
public class Schoolchild {
    static int count;
    private int age;      //incapsulation
    private String name;  //incapsulation

    public Schoolchild(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        counter();
        return age;
    }
    public static void counter() {
        System.out.println("Method #" + ++count);
    }
    public String getName() {
        counter();
        return name;
    }

    @Override
    public String toString() {
        return "Schoolchild{" + name + ", " + age + " years}";
    }
    public int uppAge() { //добавить 1 год к возрасту
        counter();
        return ++age;
    }
    public String rename(String newName) { //rename
        counter();
        return name = newName;
    }

}
class ChildrenHoliday {
    public void birthday(Schoolchild schoolchild) {
        schoolchild.counter();
        System.out.println("Happy birthday, dear " + schoolchild.getName() + "!!!");
        System.out.println("Now you are " + schoolchild.uppAge() + '.');
    }
    public void b2(int age1, String name1, int age2, String name2) {
        Schoolchild boy1 = new Schoolchild(age1, name1);
        boy1.counter();
        Schoolchild girl1 = new Schoolchild(age2, name2);
        System.out.println(boy1);
        System.out.println(girl1);
        ChildrenHoliday day1 = new ChildrenHoliday();
        day1.birthday(boy1);
    }

    public static void main(String[] args) {
        ChildrenHoliday hol1 = new ChildrenHoliday();
        hol1.b2(14, "Orest", 9, "Inna");
    }
}