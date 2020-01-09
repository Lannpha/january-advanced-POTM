import java.util.*;
import java.io.*;

public class Solution
{
  public static void main(String [] args)
  {
    FastReader in = new FastReader();

    int animeWatched = in.nextInt();
    int desiredRating = in.nextInt();
    int totalRatings = 0;
    
    for(int i = 0; i < animeWatched; i++)
    {
      totalRatings += in.nextInt();
    }

    double result = ((double)desiredRating*animeWatched - totalRatings)/(10 - desiredRating);
    System.out.println((int)Math.ceil(result));

  }

  static class FastReader //taken from someone else
  { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
  } 
}
