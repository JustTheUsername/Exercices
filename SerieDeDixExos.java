/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriededixexos;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class SerieDeDixExos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**Additionner les N nombres consécutifs jusqu'a N entré ar l'user**/
        /*  int NombreEntierAdditionnes;            
           int i;
           int j=0;
           Scanner clavier = new Scanner(System.in);
           
           System.out.println("combien d'entier voulez vous additionner? ");
           
           NombreEntierAdditionnes = clavier.nextInt();
           
           for(i=0;i<=NombreEntierAdditionnes;i++){
                j=j+i;
               System.out.println(j);
               
           
           }*/
        
        
         /**********************ExoFactoriel************************/
       
        
        /* int nombreFactoriel; 
           int i;
           int j=1;
           Scanner clavier = new Scanner(System.in);
           
           System.out.println("combien d'entier voulez vous additionner? ");
           
           nombreFactoriel = clavier.nextInt();
           
           for(i=1;i<=nombreFactoriel;i++){
                j=j*i;
               System.out.println(j);

              
               
           
           }  */
       
        
         /*****************ExoPuissance******************/
         
       /*  
        int puissance;
        int nombre;
        int resultat ;
         int i;
        Scanner clavier= new Scanner(System.in);
        
        System.out.println("Saisissez un nombre que vous voulez elever à la puissance X");
        
        nombre=clavier.nextInt();
        
        System.out.println("Saississez la valeur de la puissance ");
        
        puissance=clavier.nextInt();
        resultat= nombre*nombre;
         for(i=1;i<puissance-1;i++){
         
          resultat=resultat*nombre;
          
        
         }
         
         System.out.println(nombre+"^"+puissance+"="+resultat);
         
         */
       
         /**************De 1 à 100 2 par 2 *************************/
        
        /*  int i=0;
     
        
        for(i=1;i<=100;i+=2){

            System.out.println(i);
        
        }
         */
       
        /******************De 1 à 100 Nombre paires********************/
        /*
        int i;

        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {

                System.out.println(i);
            }
        
        }
            */
        
        /******************De 1 à 100 Afficher les nombres 5par 5 ***********/
       /* int i;
        
        for(i=0;i<=100;i+=5){
            
            System.out.println(i);
            
        }
            
            
        */
        
        /*****************De 1 à 100 nombre divisible par 3 *******************/
       /* int i;

        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {

                System.out.println(i);
            }
        
        }
        */
        
        /*****************De 1 à 100 nombre divisible par 5 *******************/
       /* int i;

        for (i = 1; i <= 100; i++) {
            if (i % 5 == 0) {

                System.out.println(i);
            }
        
        }*/
       
        /*****************De 1 à 100 nombre divisible par 3 et 5*******************/
       
      /*  int i;

        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i%5 ==0) {

                System.out.println(i);
            }
        
        }*/
      
      /***************verif if X est nombres premiers***********************************/
      /*
        int i = 2;
        int nombre;

        boolean estPremier = false;
        Scanner clavier = new Scanner(System.in);

        System.out.println("entrez un nombre entier");

        nombre = clavier.nextInt();
        if (nombre > 1) 
        {
            while (i < nombre) 
            {

                if (nombre % i != 0) 
                {
                    estPremier = true;
                } 
                else 
                {
                    estPremier = false;
                    i = nombre;
                }
                i++;
            }
            if (estPremier == true) 
            {
                System.out.println("ce nombre est premier");
            } 
            else 
            {
                System.out.println("ce nombre n'est pas premier");
            }
        }
        else
        {
                System.err.println("ce nombre invalide veuillez entrer un entier supérieur à 1");
        }
        */
        /***************de 1 à 100 premiers*****************/
        /*
           int i;
           int j;
           
           for(i=2;i<=100;i++){                  
           boolean estPremier = true;
               for(j=2;j<i;j++){

                   if(i%j==0)
                   {
                   estPremier = false;
                   }
               }
               if(estPremier==true){
                  System.out.println(i);
               }

           }
        */
        
        /********************Nombre premier de 1 à 100 avec une boucle do/while*//////////////////////////////////
       /* int i=2;
        int j;
        
        do{
        boolean estPremier =true;
            for(j=2;j<i;j++){
                if(i%j==0){
                    estPremier = false;
                }
            }
            if(estPremier==true){
                System.out.println(i);
            }
            i++;
        }while (i<=100);
        */
       /****************comparer un char ****************/
       Scanner choix =new Scanner(System.in);
       
       char choixChar =' ';
       while(choixChar!='y'&&choixChar!='n'||choixChar==' '){
       System.out.println("Souhaitez vous continuer (y/n)? ");
       choixChar =Character.toLowerCase( choix.next().charAt(0));
       
        if (choixChar =='y'){
        
        System.out.println("C'est bien ");
                
        }
        else if(choixChar=='n'){
            
            System.out.println("Bah tant pis");
        }
       }
    }
}
