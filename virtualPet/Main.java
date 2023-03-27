import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Pet pet = new Pet("Agenor","Coelho","Coelho Marrom");
        System.out.println("DADOS DO PET: ");
        System.out.println(pet);
        System.out.println("--");
        System.out.println("O pet nasceu, o que deseja fazer? ");
        System.out.println("1 - Comer ");
        System.out.println("2 - Correr ");
        System.out.println("3 - Dormir ");
        System.out.println("4 - Sair do programa");
        int resp = scanner.nextInt();
        while(resp!=4){
            if(resp == 1 || pet.forca <= 0){
                System.out.println(pet.comer());
            }
            if(resp ==2){
                System.out.println(pet.correr());
            }
            if(resp ==3){
                System.out.println(pet.dormir());
            }
            if(resp ==4){
                System.out.println(pet.morrer());
                break;
            }
            System.out.println("---------");
            if(pet.forca<=0){
                System.out.println("O pet morreu");
                break;
            }else{
                System.out.println(pet);
                System.out.println("---------");
                System.out.println("O que deseja fazer?");
                System.out.println("1 - Comer ");
                System.out.println( "2  - Correr ");
                System.out.println("3 - Dormir ");
                System.out.println("4 - Sair do programa");
                resp = scanner.nextInt();
            }
            
        }
        scanner.close();
    }
}