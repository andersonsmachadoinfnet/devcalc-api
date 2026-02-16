package br.anderson.infnet.devcalc_api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    public int add(int a, int b) {return a+b;}
    public int subtract(int a, int b) {return a-b;}
    public int multiply(int a, int b) {return a*b;}
    public int divide(int a, int b) {return a/b;}
}
