class Obrero {
    private String nombre;
    private int salario;
    private Maquina tipoDeMaquina; 

    public Obrero (String nombre, int salario, Maquina tipoDeMaquina) {
        this.nombre = nombre;
        this.salario = salario;
        this.tipoDeMaquina = tipoDeMaquina;		
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public Maquina getMaquina() {
        return tipoDeMaquina;
    }
}