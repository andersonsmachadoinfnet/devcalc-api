package br.anderson.infnet.devcalc_api;

import br.anderson.infnet.devcalc_api.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private CalculatorService calculatorService;

    @BeforeEach
    public void setup() { calculatorService = new CalculatorService(); }

    @Test
    @DisplayName("Testa a adição de 2 números.")
    public void add() {
        Assertions.assertEquals(15, calculatorService.add(10, 5));
    }

    @Test
    @DisplayName("Testa a subtração de 2 números.")
    public void subtract() {
        Assertions.assertEquals(5, calculatorService.subtract(10, 5));
    }

    @Test
    @DisplayName("Testa a multiplicação de 2 números.")
    public void multiply() {
        Assertions.assertEquals(50, calculatorService.multiply(10, 5));
    }

    @Test
    @DisplayName("Testa a divisão de 2 números.")
    public void divide() {
        Assertions.assertEquals(2, calculatorService.divide(10, 5));
    }
}
