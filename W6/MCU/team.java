import java.util.*;

public class team {
    private String nameTeam;
    private List<character> characters;
    
    public team(String nameTeam, List<character> characters){
        this.nameTeam = nameTeam;
        this.characters = characters;
    }
    
    public List<character> getCharacters(){
        return characters;
    }
   
}
