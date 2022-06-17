package Page505_3;

public class ToolsDemo {
    public static void values(){
        Tools toolsArray[] = Tools.values();
        for (Tools t : toolsArray) {
            System.out.println(t + " " + t.ordinal());
        }
    }

    public static void main(String[] args) {
        ToolsDemo.values();
    }
}
