package input04;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine();
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
           
        
        
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));
        //Store the next two numbers as xPosition and yPosition
        int xPosition=sc.nextInt();
        int yPosition=sc.nextInt();
        //Print these positions
        
        
        System.out.println("X: "+ xPosition +", Y: " + yPosition);
        sc.close();
    }    
}
