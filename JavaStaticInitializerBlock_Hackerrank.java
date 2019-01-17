/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastaticinitializerblock_hackerrank;

import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class JavaStaticInitializerBlock_Hackerrank {

    private static int B;
    private static int H;
    private static boolean flag;

    /**
     * @param args the command line arguments
     */
    
    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        
        if (!(B<=0 || H<=0)){
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        if(flag){
			int area=B*H;
			System.out.print(area);
		}
    }
    
}
