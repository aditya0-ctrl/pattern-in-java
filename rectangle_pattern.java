import java.util.*;

public class rectangle_pattern{
    public static void main(String[]args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=i+5-j;j++){
                for(int k=1;k<=j;k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }

}