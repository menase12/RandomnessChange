import java.util.Random;
public class Randomeness_change {

        public static void main(String[]args){
            System.out.println("Generate 80 randoms intigers between 0 and 6");
            Random x = new Random();

            for(int j=5; j<=95;++j){
                int randomInt=1+x.nextInt(6);
                System.out.println("Generated number: " +randomInt);
            }
        }}



