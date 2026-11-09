

public class Animal {

    private String nome;
    private int idade;
    private double peso;
    private Dono donoDoAnimal;
    private Consulta[] consulas = new Consulta[4];
    private Consulta consultas;
    private int totalConsultas = 0;
    
    
    public Animal(String nome, int idade, double peso, Dono donoDoAnimal) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.donoDoAnimal = donoDoAnimal;
    }


    public String getNome() {
        return nome;
    }


    public void setName(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public double getpeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }

     public Dono getdonoDoAnimal() {
        return donoDoAnimal;
    }

    public void setdonoDoAnimal(Dono donoDoAnimal) {
        this.donoDoAnimal = donoDoAnimal;
    }
    
    public Dono getDonoDoAnimal() {
        return donoDoAnimal;
    }


    public void setDonoDoAnimal(Dono donoDoAnimal) {
        this.donoDoAnimal = donoDoAnimal;
    }

    public Consulta getconsultas() {
        return consultas;
    }


    public void setconsultas(Consulta consultas) {
        this.consultas = consultas;
    }

    public void registrarConsulta(Consulta consulta){
        if(totalConsultas >= consulas.length){
            System.out.println("Quantidade máxima de consultas foi atingida");
        }
        else{
            consulas[totalConsultas] = consulta;
            totalConsultas++;
            System.out.println("Consulta registrada");
            
        }
        
    }

    public void exibirDadosDono(){
            System.out.println("Dono do Animal: " + getDonoDoAnimal().getNome());
            System.out.println("Telefone do Dono do Animal: " + getDonoDoAnimal().getTelefone());
            System.out.println();
        
    }

   public void listarConsulta(){
    for (Consulta consultas : consulas) {
        if(consultas != null){
    System.out.println("Data: " + consultas.getData());
    System.out.println("Descrição: " + consultas.getDescricao());
    System.out.println("Preço: " + consultas.getValor());
    System.out.println();
    }
    }
   }

   public double consultaValortotGasto(){
    double valtot = 0;
    for (Consulta consultas : consulas) {
        if(consultas != null){
        valtot += consultas.getValor();
    }
    }
    return valtot;
   }

   
    





}
