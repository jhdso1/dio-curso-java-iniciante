
import java.util.Random;

public class SmartPhone {

    public static void main(String[] args) {
        do {
            System.out.println("ligando... ");
        } 
            while (tocando());
                System.out.println("oalo... ");
            

    }

 private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("atendeu..."+ atendeu);
        return ! atendeu;
    }
}
