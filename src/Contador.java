import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroParametro,segundoParametro;

        System.out.println("Digite o primeiro parâmetro : ");
        primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        segundoParametro = scanner.nextInt();

        try{
            contar(primeiroParametro,segundoParametro);
        }
        catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        };
    }
        
    static void contar( int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {

        if(primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException();
        }else{
            int diferenca = segundoParametro - primeiroParametro;
            for(int i = 1; i <= diferenca; i++){
                System.out.println("Imprimindo número " + i );
            }
        }
    }

    


}
