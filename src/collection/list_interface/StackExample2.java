package collection.list_interface;
import java.util.Stack;
public class StackExample2 {
    public static void main(String[]args){
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katia");
        System.out.println(stack);
        while(!stack.isEmpty()){
        System.out.println(stack.pop());//Возвращает и удаляет первый элемент stack-a.
            //Если стэк уже пуст, из него нечего удалять, EmptyStackException
        System.out.println(stack);
    }
        System.out.println(stack.peek());//возвращает первый элемент stack-a. Если он пуст, EmptyStackException
        System.out.println(stack);
    }
}
