package practice.lambda.lesson41;

public class Lambda1 {
    String today;

    public Lambda1(String today) {
        this.today = today;
    }

    @Override
    public String toString() {
        return "Today is: " + today;
    }

    public String isItWeekend(Lambda l) {
        if(l.weekEnd(this.today)) return "Yes, it is weekend now.";
        else return "No, it is not weekend now.";
    }

    public static void main(String[] args) {
        Lambda1 l1 = new Lambda1("Sunday");
        System.out.println(l1.isItWeekend((today) -> {//lambda expression
            try{
            switch (today) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    return false;
                case "Saturday":
                case "Sunday":
                    return true;
                default:
                    throw new NullPointerException();
            } } catch (NullPointerException nPI) {
                System.out.println('\'' + l1.today + "' is not a right day of week. Please try to change the name of day.");
                return false;
            }
        }) );
    }
}
interface Lambda {
    boolean weekEnd(String dayOfWeek);
}
