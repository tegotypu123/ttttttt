package workshop;

import workshop.Tool;

import java.util.ArrayList;
import java.util.List;
public class Worker {
    public void run(){
        Tool tool1 = new Tool("śrubokret");
                tool1.useTool();
        Tool tool2 = new Tool("młotek");
      List<Tool> tools = new ArrayList<>();
        tools.add(tool1);
        tools.add(tool2);
        for (Tool tool : tools){
            System.out.println("Narzędzia" + tool.toolType );
        }
    }

    public static void main(String[] args) {
        Worker janusz = new Worker();

        janusz.run();
    }
}
