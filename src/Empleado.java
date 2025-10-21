public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularBono() {
        return salario * 0.05; // bono base del 5%
    }

    public String info() {
        return nombre + " gana $" + salario + " más un bono de $" + calcularBono();
    }
}