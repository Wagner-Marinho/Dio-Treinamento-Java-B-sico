public class ExemploForArray {
    
    public static void main (String [] args){

        String alunos [] = { "Felipe", "Jonas", "Julia", "Marcos"};

        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }

/*
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O alunos no indice x=" + x + " é " + alunos[x]);
        }
*/
    }
}
