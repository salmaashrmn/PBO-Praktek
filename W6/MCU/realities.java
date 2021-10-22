import java.util.*;

public class realities {
    private String realitiesName;
    private final List<team> teams;
    
    public realities(String realitiesName,List<team> teams){
        this.realitiesName = realitiesName;
        this.teams = teams;
    }
    
    public void getRealities(String nameHero){
        int noOfTeams = 0;
        List<character> characters;
        for (team t : teams){
            characters = t.getCharacters();
            for (character c : characters){
                if(c.getNameHero().equals(nameHero)){
                    System.out.println(" ");
                    c.print();
                    break;
                }
                noOfTeams++;
            }
        }
    }
}
