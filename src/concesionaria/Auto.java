package concesionaria;

public class Auto extends Vehiculo{
    private int puertas;
    
    public Auto(String marca, String modelo, int puertas, double precio)
    {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }
    
    public void imprimirInformacion()
    {
        System.out.println("Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() + " // Puertas: " + puertas + " // Precio: $" + super.getPrecio());
    }
}
