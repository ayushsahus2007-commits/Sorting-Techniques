public class selectionsort{
    static void sort(int ...a){
        int n=a.length;
        for(int i=0;i<=n-1;i++){
        int m=i;
        for(int j=i;j<=n-1;j++){
            if(a[j]<a[m]){
                m=j;
            }
        }
                int c;
                c=a[m];
                a[m]=a[i];
                a[i]=c;
       }
       for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
       }
    }
    public static void main(String[] arg){
        int []arr={4,3,1,5,2};
        sort(arr);
    }
}