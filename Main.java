package seriefibonacci;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite una cantidad de numeros de la serie fibonacci");
      
      int num_cant = sc.nextInt();
      
      int num_anterior = 0,num_siguiente = 1,suma_fibo = 0;
      
      System.out.println("Serie Fibonacci:");
      
      System.out.println(suma_fibo);
      
      for(int i = 1; i <= num_cant;i++)
      {
        num_anterior = suma_fibo;
        suma_fibo = num_anterior + num_siguiente;
        num_siguiente = num_anterior;
        
        System.out.println(suma_fibo);
      }
    }
}
