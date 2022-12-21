package dataTypes;

public class javaOperators {
    /*Instanceof operator: checks is an instance of class */
    // public static void main(String[] args) {
    
    //     Integer number = 5;
    //     boolean res;
    
    //     if (res = number instanceof Integer){
    //         System.out.println("number is an object of Integer. Hence: " + res);
    //     } else {
    //         System.out.println("number is not an object of Integer.Hence: " + res);
    //     }
    // }

    /*Conditional operator */
    public static void main(String[] args) {
    
        Integer number = 3;
        String res;
    
        res = (number > 5) ? "number greater than five" : "number lesser than five";
        System.out.println(res);
    }
    
}
