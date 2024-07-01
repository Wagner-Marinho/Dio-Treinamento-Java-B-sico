public class PlanoOperadora {
    
    public static void main (String [] args){

        String plano = "M";

        switch (plano){
            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }
            case "M":{
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e Instagram grátis");
                break;
            }
            case "G":{
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e Instagram grátis");
                System.out.println("5Gb YouTube");
                break;
            }
            default:
                System.out.println("Nenhum plano");
        }
    }
}




/*
        if(plano == "B")
            System.out.println("100 minutos de ligação");

        else if (plano =="M"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
        }else if (plano == "G"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
            System.out.println("5Gb YouTube");
        }
        else
            System.out.println("Nenhum plano");
*/
        

