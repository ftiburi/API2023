public class App {
    public static void main(String[] args) throws Exception {
        //tipos de variáveis

        //variéveis tipo inteiro
        byte numeroPequeno = -127;
        short numeroshort = -3244;
        int numeromaior = 5584444;
        long numeroenorme = 99999999000000l;

        //variáveis tipo Ponto Flutuante
        float peso = 78.7f;
        double pi = 3.1454545454545454545454545;


        //variaveis tipo de caracteres
        char letra = 'k';
        

        //variavel boleana
        boolean estoucomfome = true;


        //variavel tipo string

        String nome = "fabio";
        String nomeCompleto = "Fabio Tiburi";
        String personagemDeAnime = "Naruto";





        System.out.println(numeroPequeno);
        System.out.println(numeroshort);
        System.out.println(numeromaior);
        System.out.println(numeroenorme);
        System.out.println(estoucomfome);
        System.out.println(letra);
        System.out.println(nome);
        System.out.println(personagemDeAnime);
        System.err.println
        (
            "O personagem "
         + personagemDeAnime 
         + " tem " 
         + numeroPequeno 
         + " de idade"
         );

         System.out.format("o filme %s lançado em %d ",personagemDeAnime, numeromaior);
    }
}
