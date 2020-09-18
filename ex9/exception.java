/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class exception {
    
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("\ni.Arithmatic Exception:");
       
        try
        {
           int i=10;
           int j=0;
           int k=i/j;
        }
        catch(Exception e)
        {
            System.out.println(e);        
        }
        System.out.println("--------------------");
        System.out.println("\nii.Arrayindexoutofbound Exception:");
        
        try
        {
            int a[]={1,2,3,4,5};
            int b=a[6];
            System.out.println(b);
        }
         catch(Exception e)
        {
            System.out.println(e);        
        }
        System.out.println("--------------------");
        System.out.println("\niii.Numberformat Exception:");
        
        try
        {
            int c=Integer.parseInt(args[0]);
            int d=Integer.parseInt(args[1]);
            System.out.println(c+d);
        }
         catch(Exception e)
        {
            System.out.println(e);        
        }
        System.out.println("--------------------");
        System.out.println("\niv.Stringindexoutofbound Exception:");
        
        String s="This is a JAVA program";
        try
        {
            System.out.println(s.substring(5,50));
        }
        catch(Exception e)
        {
            System.out.println(e);        
        }
        
    }
}
