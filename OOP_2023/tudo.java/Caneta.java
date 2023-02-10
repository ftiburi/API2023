public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga:" + this.carga);
        System.out.println("Está tampada? " + this.tampada);


    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO!  Não posso rabiscar");}
          else {
            System.out.println("Estou rabiscando");
          }  
        }
        
    

    void tampar(){
        this.tampada = true; //referencia ao proprio objeto que chamou. Neste caso this equivale a ca



    }

    void destampar() {
        this.tampada =false;


    }
}