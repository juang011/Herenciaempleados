public class Vendedor extends Empleado {
    private double ventas;

    public Vendedor(String nombre, double salario, double ventas) {
        super(nombre, salario);
        this.ventas = ventas;
    }

    @Override
    public double calcularBono() {
        return salario * 0.05 + (ventas * 0.02); // 2% de las ventas
    }
}