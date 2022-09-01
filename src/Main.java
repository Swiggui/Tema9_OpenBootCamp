public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setNombre("Juan Figueredo");
        cliente.setTelefono("3188002443");
        cliente.setCredito(2000000);
        System.out.println("**Cliente**");
        System.out.println(cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Numero: " + cliente.getTelefono());
        System.out.println("Credito: $" + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Lars Ericsson");
        trabajador.setEdad(35);
        trabajador.setTelefono("3203637117");
        trabajador.setSalario(1800000);
        System.out.println("**Trabajador**");
        System.out.println(trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Numero: " + trabajador.getTelefono());
        System.out.println("Salario: $" + trabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}