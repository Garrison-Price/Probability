/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;

/**
 *
 * @author Dasty
 */
public class Main 
{
    public static void main(String args[])
    {
        int[] counts = {21,25,14,10,20,16};
        Probability prob = new Probability(counts);
        for(int i = 0; i < 10000; i++)
            System.out.println(prob.Geom(1));
        
    }
}
