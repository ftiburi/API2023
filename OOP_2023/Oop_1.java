public class Oop_1{
public static void main (String[] args){
 Caneta c1 = new Caneta();
 
 c1.cor = "Azul";
 c1.ponta = 0.5f;
 c1.tampada = false;
 c1.modelo = "fina"; // Cahamda a um atributo
 c1.tampar();
 //c1.destampar();
 c1.rabiscar();
 c1.status(); // Chamada a um método

Caneta c2 = new Caneta();

c2.modelo = "paper";
c2.cor = "verde";
c2.tampada = true;

c2.status();
c2.destampar();
c2.rabiscar();



}

}