public class LoopsAndConditions {
    public static void main(String[] args) {

        int age = 20;

        if(age >= 18){
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        System.out.println("Numbers from 1 to 5:");

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
    }
}
