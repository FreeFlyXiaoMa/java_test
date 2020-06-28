import java.util.ArrayList;
import java.util.List;

public class test1{
    public static void main(String[] args){
        int x[][]=new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(i>=j){
                    int m=i+1;
                    int n=j+1;
                    x[i][j]=m*n;
                    System.out.print(m+"*"+n+"="+x[i][j] +" ");
                }
            }
            System.out.println();
        }
    }
}

