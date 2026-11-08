package service;

import jakarta.jws.WebService;

/**
 * Implémentation métier du service.
 * endpointInterface relie la classe au contrat ICalculatrice.
 */
@WebService(
        endpointInterface = "service.ICalculatrice",
        serviceName = "CalculatriceService",
        portName = "CalculatricePort",
        targetNamespace = "http://service/")
public class Calculatrice implements ICalculatrice {

    @Override
    public int somme(int a, int b) {
        return a + b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        if (b == 0) {
            // L'exception sera transformée automatiquement en SOAP Fault
            throw new IllegalArgumentException("Division par zéro impossible");
        }
        return a / b;
    }
}