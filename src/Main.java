import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] table = new int[2];
        int choix;
        do {
            System.out.println("===============[Menu]===============");
            System.out.println("Choisissez une opération :");
            System.out.println("1. Addition ");
            System.out.println("2. Soustraction ");
            System.out.println("3. Multiplication ");
            System.out.println("4. Division ");
            System.out.println("5. Puissance ");
            System.out.println("6. Racine carrée ");
            System.out.println("7. Factorielle ");
            System.out.println("8. Quitter ");

            System.out.print("Entrez le choix : ");
            choix = input.nextInt();

            switch (choix) {
                case 1:
                    table = Nums(input);
                    Somme(table[0], table[1]);
                    break;
                case 2:
                    table = Nums(input);
                    Soustra(table[0], table[1]);
                    break;
                case 3:
                    table= Nums(input);
                    Produit(table[0], table[1]);
                    break;
                case 4:
                    table = Nums(input);
                    Division(table[0], table[1]);
                    break;
                case 5:
                    table = Nums(input);
                    Puissance(table[0], table[1]);
                    break;
                case 6:
                    System.out.print("Entrez le nombre : ");
                    int a6 = input.nextInt();
                    racineCarree(a6);
                    break;
                case 7:
                    System.out.print("Entrez un nombre entier : ");
                    int n = input.nextInt();
                    Factorielle(n);
                    break;
                case 8:
                    System.out.println("Au revoir !!");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }while (choix != 8);


    }


    // les deux nombres
    public static int[]  Nums(Scanner input){

        System.out.print("Entrez le premiere nombre : ");
        int a = input.nextInt();
        System.out.print("Entrez le dexieme nombre : ");
        int b = input.nextInt();
        int[] tableau = new int[2];

        tableau[0] = a;
        tableau[1] = b;
        return tableau;
    }


    // Fonction pour l'addition
    public static void Somme(int a, int b)
    {
        int somme;
        somme = a + b;
        System.out.println("la somme est : " + somme);
    }


    // Fonction pour la soustraction
    public static void Soustra(int a, int b)
    {
        int soustra;
        soustra = a - b;
        System.out.println("la soustraction est : " + soustra);
    }


    // Fonction pour la multiplication
    public static void Produit(int a, int b)
    {
        int produit;
        produit = a * b;
        System.out.println("le produit est : " + produit);
    }


    // Fonction pour la division
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


    // Fonction pour calculer la puissance
    public static void Puissance(double a, double b)
    {
        double puissance = Math.pow(a,b);
        System.out.println("La puissance est : " + puissance);
    }


    // Fonction pour calculer le racine carrée
    public static void racineCarree(double n) {
        if (n >= 0) {
            double result = Math.sqrt(n);
            System.out.printf("La racine carrée de %.2f est : %.2f",n,result);
        } else {
            System.out.println("Erreur : la racine carrée d'un nombre négatif n'est pas définie !");
        }
    }


    // Fonction pour calculer la factorielle
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