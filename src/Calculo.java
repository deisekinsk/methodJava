import java.util.List;

public class Calculo {


    //metodo construtor
    public Calculo() {
    }


    public int somarValores(int val1, int val2) {
        return  val1 + val2;
    }

    public int somarValores(int val1, int val2, int val3) {
        return  val1 + val2 + val3;
    }

    static int somarValores(List<Integer> listaDeValores){

        int restulado = 0;
        for(int i =0; i < listaDeValores.size(); i++){
            restulado+= listaDeValores.get(i);
        }

        return restulado;
    }


    static double dividir(int val1, int val2){
        return  val1 / val2;
    }

    static int multiplicar(int val1, int val2){
        return  val1 * val2;
    }

    static int subtrair(int val1, int val2){
        return  val1 - val2;
    }

}
