
public class villain {
    
    private event events;
    private String nameVillain;
    
    public void setEvent(event events, String nameVillain){
        this.events = events;
        this.nameVillain = nameVillain;
    }
    
    public String getNameVillain(){
        return this.nameVillain;
    }
    
    public void printEvent(){
        System.out.println("- This hero had been in the "+events.getNameEvent());
        System.out.println("  Location: "+events.getLocation());
        System.out.println("  Against: "+getNameVillain());
    }
}
