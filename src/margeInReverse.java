public class margeInReverse {
    public static void main(String[] args) {
        int[] arr1={5,4,6,2,3};
        int[] arr2={55,45,35,25,15};

        reverse(arr2);
        int n1=arr1.length;
        int n2=arr2.length;
        int n3=n1+n2;
        int[] arr3= new int[n3];

        int j=0;
        for (int i=0;i<n2;i++){
            arr3[j++]=arr1[i];
            arr3[j++]=arr2[i];
        }
        for (int i=0;i<n3;i++){
            System.out.print(arr3[i]+ ",");
        }
    }
    static void reverse(int[] arr){
        int n =arr.length;

        for (int i=0;i<n-i-1;i++){
             int temp=arr[i];
             arr[i] = arr[n-i-1];
             arr[n-i-1]=temp;
        }
    }
}
