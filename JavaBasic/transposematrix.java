import java.util.*;
public class transposematrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

    int r = sc.nextInt(), c = sc.nextint();
   
    
    int[][] a = new int [r][c];


    for(int i = 0; i<r; i++)
       for(int j = 0; j<c; j++)
    a[i][j] = sc.nextInt();

    
    for(int j = 0; j<c; j++)
        for(int i = 0; i<r; i++)
    System.out.println(a[i][j]+ " ");

  }  
}
