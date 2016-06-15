/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author informatyka1
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] tablica = {-3,1,2,-2,5,6};
        
        
    }
    
    public int NajwiekszaLiczba(int[] tablica)
    {
        int max1 = tablica[1];
        
        for (int i = 0; i<=tablica.length-1;i++)
        {
            if(tablica[i]>max1)
            {
             max1 = tablica[i];  
            }
            
        }
        
        
        return max1;
    }
    
     public int DrugaNajwiekszaLiczba(int[] tablica)
    {
        int max1 = NajwiekszaLiczba(tablica);
        int max2 = tablica[0];
        for (int i = 0; i<=tablica.length-1;i++)
        {
            if(tablica[i] < max1 && tablica[i] > max2)
            {
             max2 = tablica[i];  
            }
            
        }
        
        
        return max2;
    }
    
      public int TrzeciaNajwiekszaLiczba(int[] tablica)
    {
        int max1 = NajwiekszaLiczba(tablica);
        int max2 = DrugaNajwiekszaLiczba(tablica);
        int max3 = tablica[0];
        for (int i = 0; i<=tablica.length-1;i++)
        {
            if(tablica[i] < max2 && tablica[i] < max1 && tablica[i] > max3)
            {
             max3 = tablica[i];  
            }
            
        }
        
        
        return max3;
    }
    
    
    public int MaxValue(int[] tablica)
    {
        
        int wynik;
        wynik = NajwiekszaLiczba(tablica) * DrugaNajwiekszaLiczba(tablica) * TrzeciaNajwiekszaLiczba(tablica);
        
        return wynik;
    }
    
}
