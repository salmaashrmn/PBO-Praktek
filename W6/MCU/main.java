import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        character c1 = new character("Iron Man","Avengers");
        character c2 = new character("Captain America","Avengers");
        character c3 = new character("Star Lord","Guardian of the Galaxy");
        character c4 = new character("Groot","Guardian of the Galaxy");
        character c5 = new character("Spiderman","Avenger");
        character c6 = new character("Shang-Chi","Ten Rings");
        
        List<character> avg_characters = new ArrayList<>();
        avg_characters.add(c1);
        avg_characters.add(c2);
        avg_characters.add(c5);
        
        List<character> gotg_characters = new ArrayList<>();
        gotg_characters.add(c3);
        gotg_characters.add(c4);
        
        List<character> TR_characters = new ArrayList<>();
        TR_characters.add(c6);
        
        team t1 = new team("Avengers",avg_characters);
        team t2 = new team("Guardian of the Galaxy",gotg_characters);
        team t3 = new team("Ten Rings",TR_characters);
        
        List<team> teams = new ArrayList<>();
        teams.add(t1);
        teams.add(t2);
        teams.add(t3);
        
        realities r = new realities("earth-199999",teams);
        
        villain v1 = new villain();
        event e1 = new event("Battle of New York", "New York");
        v1.setEvent(e1,"Loki");
        
        villain v2 = new villain();
        event e2 = new event("Battle on Ego's Planet", "Ego");
        v2.setEvent(e2,"Ego");
        
        villain v3 = new villain();
        event e3 = new event("Battle of Sokovia", "Sokovia");
        v3.setEvent(e3,"Ultron");
        
        villain v4 = new villain();
        event e4 = new event("Attack on the New Avengers Facility", "New York");
        v4.setEvent(e4,"Thanos");
        
        villain v5 = new villain();
        event e5 = new event("Battle of Ta Lo", "Ta Lo");
        v5.setEvent(e5,"Soul Eaters");
        
        for(;;){
            System.out.println("-----------------------------");
            System.out.println("        List of Hero");
            System.out.println("           -------");
            System.out.println(c1.getNameHero());
            System.out.println(c2.getNameHero());
            System.out.println(c3.getNameHero());
            System.out.println(c4.getNameHero());
            System.out.println(c5.getNameHero());
            System.out.println(c6.getNameHero());
            System.out.println("-----------------------------");
            System.out.println("\nFind information: ");
            String searchHero = keyboard.nextLine();
            r.getRealities(searchHero);
            
            if(searchHero.equals(c1.getNameHero())||searchHero.equals(c2.getNameHero())){
                v1.printEvent();
                v3.printEvent();
                v4.printEvent();
            }
            if(searchHero.equals(c3.getNameHero())||searchHero.equals(c4.getNameHero())){
                v2.printEvent();
                v4.printEvent();
            }
            if(searchHero.equals(c5.getNameHero())){v4.printEvent();}
            if(searchHero.equals(c6.getNameHero())){v5.printEvent();}
            System.out.println(" ");
        }

    }
}
