import java.util.ArrayList;

public class ClinicaVeterinaria {
    private String nome;
    ArrayList<Animal> animais = new ArrayList<Animal>();


    public ClinicaVeterinaria(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarAnimal(Animal ani){
        animais.add(ani);
    }

    
    

    public void listarAnimaisCadastrados(){
        for(Animal ani: animais){
            System.out.println("Animal Cadastrado: " + ani.getNome());
            System.out.println();
        }
    }

    public void listarAnimalMaisPesado(){
        Animal maispesado = animais.get(0);
        for (Animal animal : animais) {
            if(animal.getpeso()>maispesado.getpeso()){
                maispesado = animal;
            }
        }
        System.out.println("Animal mais pesado: " + maispesado.getNome());
    }


    public double calcularMediaIdade(){
        double media = 0;
    for (Animal ani : animais) {
        media += ani.getIdade();
    }
    return media/animais.size();
    }


    
    
        

}
