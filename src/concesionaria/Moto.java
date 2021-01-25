package concesionaria;

public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada, double precio)
    {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    
    public void imprimirInformacion()
    {
        System.out.println("Marca: " + super.getMarca() + " // Modelo: " + super.getModelo()+ " // Cilindrada: " + cilindrada + "cc // Precio: $" + super.getPrecio());
    }
}
