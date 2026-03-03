public class half_pyra_no {
    public static void pyramid_no(int n){
        for(int i=1;i<=n;i++){
            for( int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        pyramid_no(5);
    }
    
}
