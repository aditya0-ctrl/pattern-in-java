public class flyods_triangle {
    public static void flyods_tri(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        flyods_tri(5);
    }
}
