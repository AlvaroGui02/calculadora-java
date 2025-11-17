package com.meuexercicio;

/**
 * Classe Calculadora que implementa operações matemáticas básicas e avançadas.
 * 
 * @author Exercício Java
 * @version 1.0
 */
public class Calculadora {
    
    /**
     * Realiza a soma de dois números.
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da soma (a + b)
     */
    public double somar(double a, double b) {
        return a + b;
    }
    
    /**
     * Realiza a subtração de dois números.
     * 
     * @param a minuendo
     * @param b subtraendo
     * @return resultado da subtração (a - b)
     */
    public double subtrair(double a, double b) {
        return a - b;
    }
    
    /**
     * Realiza a multiplicação de dois números.
     * 
     * @param a primeiro fator
     * @param b segundo fator
     * @return resultado da multiplicação (a * b)
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    /**
     * Realiza a divisão de dois números.
     * 
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão (a / b)
     * @throws ArithmeticException se o divisor (b) for zero
     */
    public double dividir(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida!");
        }
        return a / b;
    }
    
    /**
     * Calcula a potência de um número (base elevada ao expoente).
     * 
     * @param base base da potência
     * @param expoente expoente da potência
     * @return resultado de base^expoente
     */
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
    
    /**
     * Calcula a raiz quadrada de um número.
     * 
     * @param a número para calcular a raiz quadrada
     * @return raiz quadrada de a
     * @throws IllegalArgumentException se o número for negativo
     */
    public double raizQuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Erro: Não é possível calcular raiz quadrada de número negativo!");
        }
        return Math.sqrt(a);
    }
}