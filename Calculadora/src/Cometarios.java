public class Cometarios {
    
    public static void main(String[] args) {

    }
    /* 
     *  Este método foi elaborado as pressas
     * por isso eu abrecie o nome das variáveis
     * mas olha, ele tem a finalidade somar ou multiplicar
     * dois números
     */
    public int somaMultiplica (int n, int x, String m) {

        int r = 0; // r é igual ao resultado

        if (m== "M") { // M = multiplicação
            
            r = n * x;

        }else{

            // se não soa mesmo
            r = n + x;

        }

        return r;

    }
}