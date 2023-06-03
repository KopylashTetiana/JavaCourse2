package generics.igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();
    public Team(T participant, String name){
        this.name=name;
        participants.add(participant);
        System.out.println("Igrok "+ participant.getName()+ " sozdaet komandu \""+name+"\".");
    }
    public String getName (){
        return name;
    }
    public void addNewParticipant (T participant){
        try {for(T t: participants){if (participant.equals(t)){
            throw new Exception();
        }}
        participants.add(participant);
        System.out.println("V komandu \""+name+"\" dobavlen igrok "+participant.getName()+'.');}
        catch (Exception e){
            System.out.println("!!! "+participant.getName()+" uge dobavlen v komandu \""+name+'\"');
        }
    }
    public void playWith(Team t){
        try{if(this==t)throw new Exception();
            Random r = new Random();
            int i = r.nextInt(2);
            String winnerName=(i==0)?name:t.getName();
            System.out.println("Vyigrala komanda \""+winnerName+'\"');}
        catch (Exception e){
            System.out.println("Komanda \""+name+"\" ne moget igrat' sama protiv sebya!");
        }

    }
}
