import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        System.out.println("Hello :) \n\nI will convert your binary number to decimal");
        System.out.println("input up to 8 bits: \n");
        while(true){
            input = sc.nextInt();
            if(input <= 11111111){
                break;
            } else {
                System.out.println("Debe tener una longitud de 8 caracteres o menos :T\nIntenta de nuevo:");
            }
        }

        int output = 0;
        int aux = 0;
        for (int i = 0; input > 0; i++) {
            aux = input % 10;
            input = input/10;
             
        }

    }
}
