package Comparation.Practice;
//отсортируй ArrayList<String>
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Test1 {
    public static void main (String[] args){
    List<String> myFriends = new ArrayList<>();
String s1 = "Ann";
String s2 = "NastyaF";
String s3 = "Illya";
String s4 = "NastyaZ";
String s5 = "Fister";
String s6 = "Kopl";
String s7 = "Lyoshenka";
String s8 = "Anarhiya";
String s9 = "Ket";
String s10 = "Sashka";
String s11 = "Yurec";
String s12 = "Valentina";
String s13 = "Tyoma";
String s14 = "Luka";
String s15 = "MarkYu";
String s16 = "Zvolya";
String s17 = "Olya";
String s18 = "Vanya";
String s19 = "Kira";
String s20 = "Kristina";
String s21 = "Sveta";
String s22 = "Maks";
String s23 = "Yana";
String s24 = "Dima";
String s25 = "SashaDnepr";
String s26 = "AnechkaDnepr";
        myFriends.add(s1);
        myFriends.add(s2);
        myFriends.add(s3);
        myFriends.add(s4);
        myFriends.add(s5);
        myFriends.add(s6);
        myFriends.add(s7);
        myFriends.add(s8);
        myFriends.add(s9);
        myFriends.add(s10);
        myFriends.add(s11);
        myFriends.add(s12);
        myFriends.add(s13);
        myFriends.add(s14);
        myFriends.add(s15);
        myFriends.add(s16);
        myFriends.add(s17);
        myFriends.add(s18);
        myFriends.add(s19);
        myFriends.add(s20);
        myFriends.add(s21);
        myFriends.add(s22);
        myFriends.add(s23);
        myFriends.add(s24);
        myFriends.add(s25);
        myFriends.add(s26);
        System.out.println("Do sortirovki: \n"+myFriends);
        Collections.sort(myFriends);
        System.out.println("Posle sortirovki: \n"+myFriends);
}
}