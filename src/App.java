import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo(a) a CréditoParaTodxs");
        System.out.println("Aqui, nós pensamos em você!");
        System.out.println("Vamos as nossas opções de crédito");
        
        Scanner tec = new Scanner(System.in);
        int renda;        

        System.out.println("Qual a sua renda?");
        renda = tec.nextInt();
       // System.out.println("sua renda é de: R$" + renda);

        if(renda <= 1000){
        System.out.println("De acordo com as suas informações!");
        System.out.println("Temos a seguinte proposta!");
        System.out.println("Solicitado um empréstimo de R$1500 reais");
        System.out.println("Parcelados em 12 x R$125 reais");
        System.out.println("Vamos assinar o contrato!");
        System.out.println("Contrato assinado com sucesso!!!");
        
    }else if ((renda >1001) && (renda <=2000)) {
        System.out.println("De acordo com as suas informações!");
        System.out.println("Temos a seguinte proposta!");
        System.out.println("Solicitado um empréstimo de R$3000 reais");
        System.out.println("Parcelados em 12 x R$250 reais");
        System.out.println("Vamos assinar o contrato!");
        System.out.println("Contrato assinado com sucesso!!!");          
        
    } else if((renda >2001) && (renda <=3000)){
            System.out.println("De acordo com as suas informações!");
            System.out.println("Temos a seguinte proposta!");
            System.out.println("Solicitado um empréstimo de R$5,000 reais");
            System.out.println("Parcelados em 12 x R$420 reais");
            System.out.println("Vamos assinar o contrato!");
            System.out.println("Contrato assinado com sucesso!!!");          
        
        }else if(renda >5001){
        System.out.println("De acordo com as suas informações!");
        System.out.println("Temos a seguinte proposta!");
        System.out.println("Solicitado um empréstimo de R$10,000 reais");
        System.out.println("Parcelados em 12 x R$835 reais");
        System.out.println("Vamos assinar o contrato!");
        System.out.println("Contrato assinado com sucesso!!!");
        }
        //revisão de informações para revisão de contrato
        /*System.out.println("De acordo com as suas informações!");
        System.out.println("Temos a seguinte proposta!");
        System.out.println("Solicitado um empréstimo de R$3000 reais");
        System.out.println("Parcelados em 12 x R$250 reais");
        System.out.println("Vamos assinar o contrato!");
        System.out.println("Contrato assinado com sucesso!!!");*/
    }
}
