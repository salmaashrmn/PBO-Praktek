
public class character {

    private String nameHero;
    private String nameTeam;
    
    public character(String nameHero, String nameTeam){
        this.nameHero = nameHero;
        this.nameTeam = nameTeam;
    }
   
    public String getNameHero() {
        return nameHero;
    }
    
    public void print(){
        System.out.println("Hero Name: "+this.nameHero);
        System.out.println("Affiliation: "+this.nameTeam);
    }
    
}
