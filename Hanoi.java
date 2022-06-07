import java.util.Scanner;
public class Hanoi 
{
    public static void main(String[] args) 
    {
        Scanner leer=new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n=leer.nextInt();
        Hanoi(n,1,2,3);
    }
    public static void Hanoi(int n, int origen, int aux, int destino)
    {
        if(n==1)
        {
            System.out.println("Mover discco de "+origen+" a "+destino);
        }else{
            Hanoi(n-1,origen, destino, aux);
            System.out.println("Mover disco de "+origen+" a "+destino);
            Hanoi(n-1,aux,origen,destino);
        }
    }
}
