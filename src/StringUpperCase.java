public class StringUpperCase {
    public static void main(String[] args) {
        String name = "Automationedge";

        String [] result = name.split("");
        System.out.println("result =");

        for (String str:result){
            System.out.print(str.toUpperCase() + ".");
        }
    }
}
