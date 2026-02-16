package br.anderson.infnet.devcalc_api.controller;

import br.anderson.infnet.devcalc_api.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private final CalculatorService calculatorService;

    CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    int add(@RequestParam(value="a") int a, @RequestParam(value="b") int b) {return calculatorService.add(a, b);}
    @GetMapping("/subtract")
    int subtract(@RequestParam(value="a") int a, @RequestParam(value="b") int b) {return calculatorService.subtract(a, b);}
    @GetMapping("/multiply")
    int multiply(@RequestParam(value="a") int a, @RequestParam(value="b") int b) {return calculatorService.multiply(a, b);}
    @GetMapping("/divide")
    int divide(@RequestParam(value="a") int a, @RequestParam(value="b") int b) {return calculatorService.divide(a, b);}
}
