package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/**
 * Contrat du service (SEI : Service Endpoint Interface).
 * C'est cette interface qui définit les opérations visibles dans le WSDL.
 */
@WebService(name = "ICalculatrice", targetNamespace = "http://service/")
public interface ICalculatrice {

    @WebMethod(operationName = "somme")
    @WebResult(name = "resultat")
    int somme(@WebParam(name = "a") int a,
              @WebParam(name = "b") int b);

    @WebMethod(operationName = "soustraction")
    @WebResult(name = "resultat")
    int soustraction(@WebParam(name = "a") int a,
                     @WebParam(name = "b") int b);

    @WebMethod(operationName = "multiplication")
    @WebResult(name = "resultat")
    int multiplication(@WebParam(name = "a") int a,
                       @WebParam(name = "b") int b);

    @WebMethod(operationName = "division")
    @WebResult(name = "resultat")
    double division(@WebParam(name = "a") double a,
                    @WebParam(name = "b") double b);
}