package clientwsperiodictable;

import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class ClientWSPeriodicTable {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
       // Serializer serializer = new Persister();
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

    private static String getParameter(String methodType) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type element's name: ");
        String elementName = scanner.nextLine();
        Serializer serializer;
        String source;
        NewDataSet1 NewDataSet;
        switch (methodType) {
            case "1":
                serializer = new Persister();
                source =getAtomicNumber(elementName);
                NewDataSet = new NewDataSet1();
                serializer.read(NewDataSet, source);
                return NewDataSet.getTable().getAtomicNumber();
            case "2":
                return getAtomicWeight(elementName);
            default:
                return getElementSymbol(elementName);
        }
    }
}
