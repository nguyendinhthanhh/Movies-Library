
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tdinh
 */
public class Main {
    
   
    public static void main(String[] args) {
        
    int choice = 0;
     Scanner sc = new Scanner(System.in);
      MovieList danhSach = new MovieList();
     
        
    do{
        System.out.println("MENU");
        System.out.println("1. Add  title,Movies, actor and rate");
        System.out.println("2. Print out the list of movies");
        System.out.println("3. Print out the rating for this movie ");
        System.out.println("4. Exit");
        System.out.print("Input: ");
        choice = sc.nextInt();
        sc.nextLine();
        
        switch(choice){
            
            case 1: {
                System.out.print("Input title: ");
                String title = sc.nextLine();
                System.out.print("Input Movies Name: ");
                String name = sc.nextLine();
                System.out.print("Input actor: ");
                String actor = sc.nextLine();
                
             int rate = 0;
              do{
                  System.out.print("How many stars would you like to give this movie (0 to 5): ");
                   rate = sc.nextInt();
                  
                  if(rate < 0 || rate >5){
                      System.out.println("Please input a valid rating (0 to 5)");
                  }
              }while(rate <0 || rate >5);

                Movie movie = new Movie(title,name, actor, rate);
                danhSach.addtotal(movie);
                System.out.println("Thank For Your support <3");
                break;
            }
            
            case 2:{
                danhSach.displayList();
                break;
            }
            
            case 3:{
                System.out.print("Input title: ");
                String title = sc.nextLine();
                danhSach.displayRate(title);
                
                break;
                
            }
        
        }
            
    
    
    }while(choice != 4);
    
    
    }
    
    
    }

