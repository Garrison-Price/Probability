/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;

import java.util.ArrayList;

/**
 *
 * @author Dasty
 */
public class Probability 
{
    ArrayList<Integer> draw = new ArrayList();
    ArrayList<Integer> dist = new ArrayList();
    public Probability(int[] counts)
    {
        for(int i = 0; i < counts.length; i++)
        {
            for(int x = 0; x < counts[i]; x++)
            {
                draw.add(i);
            }
        }
    }
    
    public int Binom(int num)
    { 
        int count = 0;
        for(int t = 0; t < num; t++)
        {
            if(draw.get((int)(Math.floor(Math.random()*draw.size()))) == 0)
            {
                count++;
            }
        }
        return count;
    }
    
    public int Geom(int num)
    {
        int count = 0;
        int found = 0;
        while(found < num)
        {
            if(draw.get((int)(Math.floor(Math.random()*draw.size()))) == 0)
            {
                found++;
                count++;
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}
