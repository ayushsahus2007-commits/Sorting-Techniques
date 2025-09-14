public class bubblesort {
    public static void main(String[] args) {
        int []a={3,4,5,6,9,7,8,0,2};
        int n=a.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(a[j]>a[j+1]){
                    int c;
                    c=a[j];
                    a[j]=a[j+1];
                    a[j+1]=c;
                }

            }
        }
        for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");

        }
    }
}



