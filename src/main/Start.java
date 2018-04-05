/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import abstrata.Figura;
import figuras.*;
import java.util.Scanner;

/**
 *
 * @author Hiago
 */
public class Start {

    public static void calcular(Figura f, double x, double y) {
        System.out.println("O resultado da operação é: " + f.calculoArea(x, y));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("=====================Opções=====================\n 1- Círculo\n 2- Retângulo \n 3- Triângulo\n\n Digite a opção desejada:");

        int sair = 0;

        while (sair == 0) {

            int e = ent.nextInt();
            switch (e) {
                case 1:
                    System.out.println("Insira o valor de PI e o raio respectivamente");
                    calcular(new Circulo(), ent.nextDouble(), ent.nextDouble());
                    sair = 1;
                    break;
                case 2:
                    System.out.println("Insira o valor da base e a altura respectivamente");
                    calcular(new Retangulo(), ent.nextDouble(), ent.nextDouble());
                    sair = 1;
                    break;
                case 3:
                    System.out.println("Insira o valor da base e a altura respectivamente");
                    calcular(new Triangulo(), ent.nextDouble(), ent.nextDouble());
                    sair = 1;
                    break;
                default:
                    System.out.print("Operação inválida! Reinsira uma opção: ");
                    
                    sair = 0;
                    break;
            }
        }

    }

}
