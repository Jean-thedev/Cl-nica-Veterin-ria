public class App {
    public static void main(String[] args) throws Exception {
        Dono don1 = new Dono("Kirb", 777777777);
        Dono don2 = new Dono("Larys", 877777777);
        Consulta con1 = new Consulta("22/12/2020", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaa", 1000);
        Consulta con2 = new Consulta("25/07/2023", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb bbbbbbbbbbbbbbbbbbbbbbbbbbb", 1500);
        Consulta con3 = new Consulta("31/07/2023", "cccccccccccccccccccccccccccccccccccccccccccccccccc ccccccccccccccccccccccccccc", 2000);
        Consulta con4 = new Consulta("10/08/2023", "dddddddddddddddddddddddddddddddddddddddddddddddddd ddddddddddddddddddddddddddd", 200.5);
        Consulta con5 = new Consulta("30/08/2023", "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee eeeeeeeeeeeeeeeeeeeeeeeeeee", 1800.9);


       Animal a1 = new Animal("Gato", 10, 20, don1);
       Animal a2 = new Animal("Cachorro", 8, 30, don1);
       Animal a3 = new Animal("Hamister", 3, 1.5, don1);
       Animal a4 = new Animal("Lapras", 10, 100, don2);
       Animal a5 = new Animal("Greninja", 6, 40, don2);


       

       ClinicaVeterinaria cli1 = new ClinicaVeterinaria("Ks");
       cli1.cadastrarAnimal(a1);
       cli1.cadastrarAnimal(a2);
       cli1.cadastrarAnimal(a3);
       cli1.cadastrarAnimal(a4);
       cli1.cadastrarAnimal(a5);

       cli1.listarAnimaisCadastrados();
       
       a1.registrarConsulta(con1);
       a2.registrarConsulta(con2);
       a3.registrarConsulta(con3);
       a4.registrarConsulta(con4);
       a5.registrarConsulta(con5);


       a1.exibirDadosDono();
       a2.exibirDadosDono();
       
       a1.listarConsulta();
       a2.listarConsulta();

       System.out.println("R$" + a1.consultaValortotGasto());
       System.out.println();
       System.out.println("R$" + a2.consultaValortotGasto());
       System.out.println();
       System.out.println(cli1.calcularMediaIdade());

       


    }
}
