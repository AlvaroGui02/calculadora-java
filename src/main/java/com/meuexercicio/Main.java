package com.meuexercicio;

/**
 * Classe Main - Exemplo de uso da Calculadora.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("   CALCULADORA JAVA - DEMONSTRAÇÃO");
        System.out.println("============================================\n");
        
        Calculadora calc = new Calculadora();
        
        // OPERAÇÕES BÁSICAS
        System.out.println("OPERAÇÕES BÁSICAS:");
        System.out.println("------------------");
        System.out.println("5 + 3 = " + calc.somar(5.0, 3.0));
        System.out.println("10 - 4 = " + calc.subtrair(10.0, 4.0));
        System.out.println("2.5 * 4 = " + calc.multiplicar(2.5, 4.0));
        System.out.println("15 / 3 = " + calc.dividir(15.0, 3.0));
        
        // OPERAÇÕES AVANÇADAS
        System.out.println("\nOPERAÇÕES AVANÇADAS:");
        System.out.println("--------------------");
        System.out.println("2^10 = " + calc.potencia(2.0, 10.0));
        System.out.println("√144 = " + calc.raizQuadrada(144.0));
        
        // TRATAMENTO DE EXCEÇÕES
        System.out.println("\nTRATAMENTO DE EXCEÇÕES:");
        System.out.println("-----------------------");
        
        try {
            calc.dividir(10.0, 0.0);
        } catch (ArithmeticException e) {
            System.out.println("✓ Exceção capturada: " + e.getMessage());
        }
        
        try {
            calc.raizQuadrada(-16.0);
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Exceção capturada: " + e.getMessage());
        }
        
        // OPERAÇÃO COMPLEXA
        System.out.println("\nOPERAÇÃO COMPLEXA:");
        System.out.println("------------------");
        System.out.println("√25 + 2³ = " + 
            (calc.raizQuadrada(25.0) + calc.potencia(2.0, 3.0)));
        
        System.out.println("\n============================================");
        System.out.println("   DEMONSTRAÇÃO CONCLUÍDA!");
        System.out.println("============================================");
    }
}