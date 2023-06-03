package collection.list_interface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();  //LinkedList creation
        for(char ch: s.toCharArray()){              //method toCharArray() converts this string to a new char array
            list.add(ch);}
        System.out.println(list);
        ListIterator<Character> iter = list.listIterator();
        //.listIterator(index) - создает listIterator и ставит курсор сразу на элемент с указанным индексом:
        ListIterator<Character> reverseIter = list.listIterator(list.size());
        boolean isPalindrome = true;
        while(iter.hasNext()){
            if(!iter.next().equals(reverseIter.previous())){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
