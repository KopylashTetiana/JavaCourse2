package generics.Practice;
import java.util.ArrayList;
import java.util.List;

public class Cooking <T extends Food> {
    private String name;
    private int gotovka;//ckolko procentov vesa isparitsya posle gotovki
    private int obschiyVes;//ves v g
    private int amines;
    private int fat;
    private int carbohydrates;

    public List <T> blyudo = new ArrayList<>();
    public Cooking (String name, int gotovka, T ... produkti){
        this.name=name;
        this.gotovka=gotovka;
        for(T t: produkti){
        blyudo.add(t);
        obschiyVes+=t.ves;
        amines+=t.amines;
        fat+=t.fat;
        carbohydrates+=t.carbohydrates;}
        }
        public void gotovit (){
            System.out.println("Gotovoe blyudo: "+name);
            System.out.println("Obschiy ves: "+obschiyVes*(100-gotovka)+"g");
            for (T t: blyudo){
                
            }
        }
}
