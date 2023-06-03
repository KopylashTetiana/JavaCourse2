package generics.Practice;

public class Flora extends Food {
    int fibers;
    public Flora(String name, int amines, int fat, int carbohydrates, int ves, int fibers){
        super(name, amines, fat, carbohydrates, ves);
        this.fibers=fibers;
    }

}
