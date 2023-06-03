package generics.Practice;

public abstract class Food {
   private String name;
    int amines;
    int fat;
    int carbohydrates;
    int ves;//ves v g
    private int calories=4*(amines+carbohydrates)+8*fat;
    public Food (String name, int amines, int fat, int carbohydrates, int ves){
        try{if(amines<0||fat<0||carbohydrates<0||ves<=0||(amines+fat+carbohydrates)>100){throw new Exception();}
        this.name=name;
        this.amines=amines;
        this.fat=fat;
        this.carbohydrates=carbohydrates;}
        catch (Exception e){
            System.out.println("Oshibka!!! Libo znachenie kakogo-to nutrienta <0, libo summa nutrientov >100, libo ves produkta =0.");
        }
    }
    public String toString (){
        return '<'+name+'>';
    }
    public int kaloriynost (){
        return calories;
    }
}
