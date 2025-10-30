package entities;

public class Funcionarios {
    private int id;
    private String nome;
    private double salario;

    //CONSTRUCTOR
    public Funcionarios(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }


    //METHODS
    public void aumentarSalario (double porcentagem) {
        salario += salario * porcentagem / 100.0;
    }

    //TOSTRING
    @Override
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }


    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
