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
                int a1 = input.nextInt();
                System.out.print("Entrez le dexieme nombre : ");
                int b1 = input.nextInt();
                Somme(a1, b1);
                break;
            case 2:
                System.out.print("Entrez le premiere nombre : ");
                int a2 = input.nextInt();
                System.out.print("Entrez le dexieme nombre : ");
                int b2 = input.nextInt();
                Soustra(a2, b2);
                break;
            case 3:
                System.out.print("Entrez le premiere nombre : ");
                int a3 = input.nextInt();
                System.out.print("Entrez le dexieme nombre : ");
                int b3 = input.nextInt();
                Produit(a3, b3);
                break;
            case 4:
                System.out.print("Entrez le premiere nombre : ");
                int a4 = input.nextInt();
                System.out.print("Entrez le dexieme nombre : ");
                int b4 = input.nextInt();
                Division(a4, b4);
                break;
            case 5:
                System.out.print("Entrez le premiere nombre : ");
                int a5 = input.nextInt();
                System.out.print("Entrez le dexieme nombre : ");
                int b5 = input.nextInt();
                Puissance(a5, b5);
                break;
            case 6:
                System.out.print("Entrez le premiere nombre : ");
                int a6 = input.nextInt();
                racineCarree(a6);
                break;
            case 7:
                System.out.print("Entrez un nombre entier : ");
                int n = input.nextInt();
                Factorielle(n);
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

    // la fonction de racine carrée
    public static void racineCarree(double n) {
        if (n >= 0) {
            double result = Math.sqrt(n);
            System.out.printf("La racine carrée de %.2f est : %.2f",n,result);
        } else {
            System.out.println("Erreur : la racine carrée d'un nombre négatif n'est pas définie !");
        }
    }

    // la fonction de factorielle
    public static void Factorielle(int n) {
        if (n < 0) {
            System.out.println("Erreur : la factorielle d'un nombre négatif n'est pas définie !");
        } else {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("La factorielle de " + n + " est : " + fact);
        }
    }



}