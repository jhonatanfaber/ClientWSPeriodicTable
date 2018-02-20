/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwsperiodictable;

import java.util.Scanner;

/**
 *
 * @author Jfaber
 */
public class ClientWSPeriodicTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(informativeMessage());
        
        String methodToUse = scanner.nextLine();
        switch(methodToUse){
            case "1": System.out.println(getParameter(methodToUse));
            break;
            case "2": System.out.println(getParameter(methodToUse));
            break;
            case "3": System.out.println(getAtoms());
            break;
            case "4": System.out.println(getParameter(methodToUse));
            break;
        }
    }

    private static String informativeMessage() {
        return ""
                + " 1) Get Atomic Number \n"
                + " 2) Get atomic Weight \n"
                + " 3) get Atoms \n"
                + " 4) Get element symbol \n"
                + "Write the method's nummber you would like to use: ";
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }
    
    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }

    private static String getParameter(String methodType) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type element's name: ");
        String elementName = scanner.nextLine();
        switch (methodType) {
            case "1":
                return getAtomicNumber(elementName);
            case "2":
                return getAtomicWeight(elementName);
            default:
                return getElementSymbol(elementName);
        }
    }
}
