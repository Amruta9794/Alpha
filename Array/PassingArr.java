public class PassingArr{

    public static void updatearr(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,30,40};

        updatearr(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}