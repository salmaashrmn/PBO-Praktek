public class DirtyBubble extends SuperHero implements Comparable<SuperHero>{
    private int powerLevel;
    private String name;
    //private List<Power> powerList;
	
    public DirtyBubble(int powerLevel, String name) {
	this.powerLevel = powerLevel;
	this.name = name;
    }
	
    @Override
    public int getPowerLevel() {
	return powerLevel;
    }
	
    @Override
    public String getName() {
    	return name;
    }
	
    @Override
    public void addPower(Power power) {
	super.addPower(power);
    }
	
    @Override
    public void identity() {
        System.out.println("It's "+getName()+", the DirtyBubble! "+
			   "It has the power level of "+getPowerLevel());
	System.out.println(".....HEED ME.....");
	System.out.println("FOR MY NAME IS "+getName().toUpperCase());
    }
	
    @Override
    public void showPowers() {
    	super.showPowers();
    }
	
    @Override
    public int compareTo(SuperHero superhero) {
       return this.powerLevel-superhero.getPowerLevel();
    } 
}
