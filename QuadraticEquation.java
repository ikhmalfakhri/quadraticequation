
package quadratic.equation;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a (1-9): ");
        
        int A = scanner.nextInt();
        
        System.out.print("Enter b (1-9): ");
        
        int B = scanner.nextInt();
        
        System.out.print("Enter c (1-9): ");
        
        int C = scanner.nextInt();
        
        double r1;
        double r2;
        
        float d = B * B - 4 * A * C;
        
        if(d < 0){
           System.out.println("This quadratic equation has 0 root(s)");
           System.out.println("No solution ");
        }
        if(d == 0){
            System.out.println("This quadratic equation has 1 root(s).");
            
            r1 = -B / (2 * A);
            
            System.out.println("x = " + r1);
        }
        if(d > 0){
            System.out.println("This quadratic equation has 2 root(s)");
            
           r1 = (-B + (Math.sqrt(d))) / (2*A);
           r2 = (-B - (Math.sqrt(d))) / (2*A);
            
            System.out.println("x = " + r1);
            System.out.println("x = " + r2);
            
        }
        }        
    }
    

