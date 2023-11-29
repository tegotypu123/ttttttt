package workshop;

public class Tool {
    public String toolType;
    public Tool (String toolType){
        this.toolType = toolType;
    }
    public void useTool(){
        System.out.println("Typ toolsa: "+ toolType);
    }
}
