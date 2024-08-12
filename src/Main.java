import  java.util.Scanner; // biblioteca Scanner 

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Crio a variavel que vai salvar os dados em outra variavel

        // Para receber String eu utilizo o next();
        // Para receber inteiro eu utilizo o nextInt();
        // Para receber Double eu utilizo o nextDouble();
        // Para receber Caracter eu utilizo o next().charAT(0); o comando charAt(0) serve para pegar o primeiro caracter digitado;


        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Você digitou: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
       
        sc.close();
    }
}
