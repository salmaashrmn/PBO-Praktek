import java.util.*;

public class AvengedSimulator {
    public static void main (String[] args) {
	List <SuperHero> list = new ArrayList<>();
		
	Power p1 = new Strength();
	Power p2 = new LaserEye();
	Power p3 = new Flying();
		
	SuperHero s1 = new ManRay(0, "Gennichiro");
	s1.addPower(p2);
	s1.addPower(p1);
	SuperHero s2 = new ManRay(553, "Gyoubu Masataka Oniwa");
	s2.addPower(p2);
	s2.addPower(p1);
		
	SuperHero s3 = new FlyingDutchMan(225, "Shirai");
	s3.addPower(p3);
	s3.addPower(p2);
	SuperHero s4 = new FlyingDutchMan(36556, "Tatenari");
	s4.addPower(p3);
	s4.addPower(p2);
		
	SuperHero s5 = new DirtyBubble(666, "Arnastria");
	s5.addPower(p3);
	s5.addPower(p2);
	
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);
		
	Collections.sort(list);
		
	for (SuperHero superhero : list) {
            System.out.println("=======================================");
            superhero.identity();
            superhero.showPowers();
            System.out.println("=======================================");
	}
    }
}
