import java.util.*;

public abstract class SuperHero implements Comparable<SuperHero>{
    private int powerLevel;
    private String name;
    private List<Power> powerList = new ArrayList<Power>();
	
    abstract public int getPowerLevel();

    abstract public String getName();
	
    abstract public void identity();
	
    public void addPower(Power power) {
    	powerList.add(power);
    }

    public void showPowers() {
	System.out.println("TIME TO SHOW YOU MY POWERS");
        for (Power power : powerList) {
            power.doPower();
        }
    }
    
}
