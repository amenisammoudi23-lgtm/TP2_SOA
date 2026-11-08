package serveur;

import jakarta.xml.ws.Endpoint;
import service.Calculatrice;

public class ServeurJWS {

    public static final String URL = "http://localhost:8080/calculatrice";

    public static void main(String[] args) {
        // Publie le service : démarre un serveur HTTP léger et génère le WSDL
        Endpoint.publish(URL, new Calculatrice());

        System.out.println("Service CalculatriceWS publié.");
        System.out.println("WSDL : " + URL + "?wsdl");
        System.out.println("XSD  : " + URL + "?xsd=1");
        System.out.println("Appuyez sur Ctrl+C pour arrêter le serveur.");
    }
}