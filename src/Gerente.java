public class Gerente extends Empleado {
    private int empleadosACargo;

    public Gerente(String nombre, double salario, int empleadosACargo) {
        super(nombre, salario);
        this.empleadosACargo = empleadosACargo;
    }

    @Override
    public double calcularBono() {
        return salario * 0.10 + (empleadosACargo * 50); // 10% + 50 por empleado
    }
}