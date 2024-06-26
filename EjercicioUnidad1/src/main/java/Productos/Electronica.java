package Productos;

public class Electronica extends product implements Producto{
    private String Marca;
    private String Modelo;
    private int Memoria;
    private double Precio;
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int memoria) {
        Memoria = memoria;
    }

    @Override
    public double ObtenerPrecio() {
        return 150000;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }
}
