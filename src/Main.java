import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um número inteiro positivo N:");
//
//        int n = scanner.nextInt();
//
//
//        if (n <= 0) {
//            System.out.println("Por favor, digite um número inteiro positivo.");
//            return;
//        }
//
//
//        int soma = 0;
//        for (int i = 1; i <= n; i++) {
//            soma += i;
//        }
//
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um número para obter a tabuada:");
//
//        int numero = scanner.nextInt();
//
//
//        System.out.println("Tabuada do " + numero + ":");
//        for (int i = 1; i <= 10; i++) {
//            int resultado = numero * i;
//            System.out.println(numero + " x " + i + " = " + resultado);
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um número inteiro não negativo:");
//
//        int numero = scanner.nextInt();
//
//                if (numero < 0) {
//            System.out.println("Por favor, digite um número inteiro não negativo.");
//            return;
//        }
//
//
//        long fatorial = 1;
//        for (int i = 1; i <= numero; i++) {
//            fatorial *= i;
//        }
//
//
//        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");

        int numero = scanner.nextInt();


        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
            return;
        }


        boolean primo = isPrimo(numero);


        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }


    public static boolean isPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;







    }


    }
