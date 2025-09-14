public class selectionsort{
    public static void main(String[] arg){
       int []a={2,1,3,4,7,5,6};
       int n=a.length;
       for(int i=0;i<=n-1;i++){
        int m=i;
        for(int j=i;j<=n-1;j++){
            if(a[j]<a[m]){
                m=j;
                int c;
                c=a[j];
                a[j]=a[i];
                a[i]=c;
            }
        }
       }
       for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
       }
    }


}