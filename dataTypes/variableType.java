package dataTypes;

public class variableType{
    // public void localVariable() {
    //     String name = "Belen";
    //     int marks = 95;
    //     System.out.println(name + " scored " + marks + "%.");
    // }

    // public static void main(String[] args) {
    //     variableType vt = new variableType();
    //     vt.localVariable();
    // }

    public void localVariable() {
        String name = "Belen";
        int marks = 95;
    }

    public void notLocalVariable(){
        System.out.println(name + " scored " + marks + "%.");
    }

    public static void main(String[] args) {
        variableType vt = new variableType();
        vt.notlocalVariable();
    }
    
}