package arrays;

public class CountFrequencyOfEachElement {
    public static void main(String[] args) {
        int arr[]={10, 10, 15, 5, 15, 10};
        int freq[]=new int[arr.length];
        int visited=-1;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    freq[j]=visited;
                }
                if(freq[i]!=visited){
                    freq[i]=count;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(freq[i]!=visited){
                System.out.println(arr[i]+" "+freq[i]);
            }
        }
    }
}
