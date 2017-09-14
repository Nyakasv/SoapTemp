/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaptempconverter;

/**
 *
 * @author i5s96t
 */
public class SoapTempConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temperature = 100;
        IntAlk.TemperatureUnit honnan = IntAlk.TemperatureUnit.DEGREE_CELSIUS;
        IntAlk.TemperatureUnit hova = IntAlk.TemperatureUnit.DEGREE_FAHRENHEIT;
        double eredmeny = convertTemp(temperature,honnan,hova);
        
        System.out.println("A " + temperature + " C= " + eredmeny+" F");
    }

    private static double convertTemp(double temperature,
            IntAlk.TemperatureUnit fromUnit,
            IntAlk.TemperatureUnit toUnit) {
        IntAlk.ConvertTemperature service = new IntAlk.ConvertTemperature();
        IntAlk.ConvertTemperatureSoap port = service.getConvertTemperatureSoap();
        return port.convertTemp(temperature, fromUnit, toUnit);
    }

    
}
