package concesionaria;

public abstract class Vehiculo implements Comparable{
    private String marca;
    private String modelo;
    private double precio;
    
    public Vehiculo(String marca, String modelo, double precio)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
    
    public abstract void imprimirInformacion();
    
    public int compareTo(Object o)
    {
        Vehiculo otroVehiculo = (Vehiculo) o;
        if(this.getPrecio() > otroVehiculo.getPrecio())
            return -1;
        
        if(this.getPrecio() < otroVehiculo.getPrecio())
            return 1;
        
        return 0;
    }
}
