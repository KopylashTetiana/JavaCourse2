package generics.igra;

public class Test {
    public static void main(String[] args){
        Schoolar sc1 = new Schoolar("Viktor", 13);
        Schoolar sc2 = new Schoolar("Evgeniya", 15);

        Student st1 = new Student ("Igor", 20);
        Student st2 = new Student ("Andriy", 25);

        Employee em1 = new Employee("Kateryna", 42);
        Employee em2 = new Employee("Mykolay", 35);

        Team <Schoolar> schoolarTeam = new Team<>(sc1,"Drakony");
        Team <Student> studentTeam = new Team<>(st1,"Vpered!");
        Team <Employee> employeeTeam= new Team<>(em1,"Rabotyagi");

       // schoolarTeam.addNewParticipant(st1);
        schoolarTeam.addNewParticipant(sc2);

        studentTeam.addNewParticipant(st1);
        studentTeam.addNewParticipant(st2);

        employeeTeam.addNewParticipant(em2);
        employeeTeam.addNewParticipant(em2);

        schoolarTeam.playWith(employeeTeam);
        schoolarTeam.playWith(studentTeam);
        studentTeam.playWith(employeeTeam);
        schoolarTeam.playWith(schoolarTeam);
        employeeTeam.playWith(studentTeam);

    }
}
