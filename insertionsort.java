public class insertionsort {
    public static void main(String[] args) {
        int []a={0,3,2,1,5,4};
        int n=a.length;
        for(int i=0;i<n-1;i++){ 
            int j=i;      
            while(j>0&&a[j-1]>a[j]){
                int c;
                c=a[j];
                a[j]=a[j-1];
                a[j-1]=c;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
