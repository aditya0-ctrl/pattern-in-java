

public class hollow_rectangle {
    public static void hollow_rect(int totrows,int totcols){
        //outer loop
        for(int i=1;i<=totrows;i++){
            //inner
            for(int j=1;j<=totcols;j++){
                if(i==1||i==totrows||j==1||j==totcols){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rect(5,5);
    }
    
}
