package com.meuexercicio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraIntegrationTest {
    
    private Calculadora calculadora;
    
    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }
    
    @Test
    @DisplayName("Teste 1: Funcionalidade Básica")
    public void testFuncionalidadeBasica() {
        double resultadoSoma = calculadora.somar(5.0, 3.0);
        assertEquals(8.0, resultadoSoma, 0.001);
        
        double resultadoMultiplicacao = calculadora.multiplicar(2.5, 4.0);
        assertEquals(10.0, resultadoMultiplicacao, 0.001);
    }
    
    @Test
    @DisplayName("Teste 2: Sequência de Operações")
    public void testSequenciaDeOperacoes() {
        double passo1 = calculadora.somar(10.0, 5.0);
        double passo2 = calculadora.dividir(passo1, 3.0);
        double resultado = calculadora.multiplicar(passo2, 2.0);
        
        assertEquals(10.0, resultado, 0.001);
    }
    
    @Test
    @DisplayName("Teste 3: Divisão por Zero")
    public void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, 
                () -> calculadora.dividir(10.0, 0.0));
    }
    
    @Test
    @DisplayName("Teste 4: Raiz de Número Negativo")
    public void testRaizDeNegativo() {
        assertThrows(IllegalArgumentException.class,
                () -> calculadora.raizQuadrada(-9.0));
    }
    
    @Test
    @DisplayName("Teste 5: Integração Potência e Raiz")
    public void testIntegracaoPotenciaERaiz() {
        double raiz = calculadora.raizQuadrada(25.0);
        assertEquals(5.0, raiz, 0.001);
        
        double potencia = calculadora.potencia(2.0, 3.0);
        assertEquals(8.0, potencia, 0.001);
        
        double resultadoFinal = calculadora.somar(raiz, potencia);
        assertEquals(13.0, resultadoFinal, 0.001);
    }
}