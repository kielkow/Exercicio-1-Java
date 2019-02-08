package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        String nome1, nome2;
        int idade1, idade2;
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("Digite o nome da 1° pessoa:");
        nome1 = input1.nextLine();
        System.out.println("Digite a idade da 1° pessoa:");
        idade1 = input1.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite o nome da 2° pessoa:");
        nome2 = input2.nextLine();
        System.out.println("Digite a idade da 2° pessoa:");
        idade2 = input2.nextInt();
        
        if(idade1 > idade2){
            System.out.println(nome1 + " é mais velha que " + nome2);
        }
        else{
            System.out.println(nome2 + " é mais velha que " + nome1);
        }
    }
    
}

