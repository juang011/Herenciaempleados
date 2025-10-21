public class Principal {
    public static void main(String[] args) {
        Empleado e1 = new Gerente("Laura", 2000, 5);
        Empleado e2 = new Vendedor("Carlos", 1200, 3000);

        System.out.println(e1.info());
        System.out.println(e2.info());
    }
}