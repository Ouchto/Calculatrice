import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez le premiere nombre : ");
        int n1 = input.nextInt();
        System.out.print("Entrez le dexieme nombre : ");
        int n2 = input.nextInt();


        Somme(n1,n2);
        Soustra(n1,n2);
        Produit(n1,n2);
        Division(n1,n2);


    }

    // la fonction d'addition
    public static void Somme(int a, int b)
    {
        int somme;
        somme = a + b;
        System.out.println("la somme est : " + somme);
    }

    // la fonction de soustraction
    public static void Soustra(int a, int b)
    {
        int soustra;
        soustra = a - b;
        System.out.println("la soustraction est : " + soustra);
    }

    // la fonction de multiplication
    public static void Produit(int a, int b)
    {
        int produit;
        produit = a * b;
        System.out.println("le produit est : " + produit);
    }

    // la fonction de division
    public static void Division(int a, int b)
    {
        if (b != 0){
            int division;
            division = a / b;
            System.out.println("la division est : " + division);
        }else {
            System.out.println("erreur: division par 0 ");
        }

    }



}