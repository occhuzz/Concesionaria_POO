package concesionaria;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        Vehiculo vehiculos[] = new Vehiculo[4];
        Vehiculo letra_Y = null;
        
        vehiculos[0] = new Auto("Peugeot","206",4,200000);
        vehiculos[1] = new Moto("Honda", "Titan", 125, 60000);
        vehiculos[2] = new Auto("Peugeot", "208", 5, 250000);
        vehiculos[3] = new Moto("Yamaha", "YBR", 160, 80500.50);
        
        for (Vehiculo v : vehiculos)
        {
            
            char vector[] = v.getModelo().toCharArray();
            
            for(int j = 0; j < v.getModelo().length(); j++)
            {
                String letra = String.valueOf(vector[j]);
                
                if(letra.equalsIgnoreCase("Y"))
                {
                    letra_Y = v;
                }
            }
            
            v.imprimirInformacion();
        }
        
        Arrays.sort(vehiculos);
        
        System.out.println("=============================");
        
        System.out.println("Vehículo mas caro: " + vehiculos[0].getMarca() + " " + vehiculos[0].getModelo());
        
        System.out.println("Vehículo mas barato: " + vehiculos[vehiculos.length-1].getMarca() + " " + vehiculos[vehiculos.length-1].getModelo());
        
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + letra_Y.getMarca() + " " + letra_Y.getModelo() + " $" + letra_Y.getPrecio());
        
        System.out.println("=============================");
        
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        
        Arrays.sort(vehiculos);
        
        for (Vehiculo v : vehiculos)
        {
            System.out.println(v.getMarca() + " " + v.getModelo());
        }
    }
}
