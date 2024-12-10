import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choisissez une opération :");
        System.out.println("1. Addition ");
        System.out.println("2. Soustraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. Puissance ");
        System.out.println("6. Racine carrée ");
        System.out.println("7. Factorielle ");

        System.out.print("Entrez le choix : ");
        int choix = input.nextInt();

        switch (choix) {
            case 1:
                System.out.print("Entrez le premiere nombre : ");
                int n1 = input.nextInt();
                System.out.print("Entrez le dexieme nombre : ");
                int n11 = input.nextInt();
                Somme(n1, n11);
                break;
            case 2:
                System.out.print("Entrez le premiere nombre : ");
                int n2 = input.nextInt();
                System.out.print("Entrez le dexieme nombre : ");
                int n22 = input.nextInt();
                Soustra(n2, n22);
                break;
            case 3:
                System.out.print("Entrez le premiere nombre : ");
                int n3 = input.nextInt();
                System.out.print("Entrez le dexieme nombre : ");
                int n33 = input.nextInt();
                Produit(n3, n33);
                break;
            case 4:
                System.out.print("Entrez le premiere nombre : ");
                int n4 = input.nextInt();
                System.out.print("Entrez le dexieme nombre : ");
                int n44 = input.nextInt();
                Division(n4, n44);
                break;
            case 5:
                System.out.print("Entrez le premiere nombre : ");
                int n5 = input.nextInt();
                System.out.print("Entrez le dexieme nombre : ");
                int n55 = input.nextInt();
                Puissance(n5, n55);
                break;
            default:
                System.out.println("Choix invalide !");
        }


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
    // la fonction de Puissance
    public static void Puissance(int a, int b)
    {
        int puissance = 1;
        for (int i = 1; i <= b; ++i){
            puissance *= a;
        }
        System.out.println("La puissance est : " + puissance);
    }



}