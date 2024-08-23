public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float calcularINSS(){
        float aux = 0;
        if (salario <= 1412.00) {
            aux = (salario * 0.075f);
        } else if (salario > 1412.00 && salario > 2666.69){
            aux = (salario * 0.09f);
        } else if (salario >2666.69 && salario < 4000.04){
            aux = (salario * 0.12f);
        } else if (salario > 4000.03 && salario < 7786.03){
            aux = (salario * 0.14f);
        } else{
            aux = 7786.02f*0.14f;
        }
        return salario - aux;
       
    }
}
