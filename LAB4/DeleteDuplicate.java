import java.util.*;

public class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Vector<Integer> v = new Vector<>(n);    
        v.addElement(arr[0]);

        for(int i=0; i<n; i++){
            for(int j=0; j<v.size(); j++){
                
                if(v.contains(arr[i])){
                    continue;
                }
                else{
                    v.addElement(arr[i]);
                }
            }
        }
        v.trimToSize();


        for(int i:v){
            System.out.print(i+" ");
        }



        // int num,pos;
        // for(int i=0;i<n; i++){
        //     newArray[i] = arr[i];
        //     for(int j=i+1; j<n; j++){
                
        //         if(arr[i]==arr[j]){
        //             pos=j;
        //             for(int k=pos; k<n-1; k++){
        //                 newArray[k] = arr[k+1];
        //             }
        //         }
        //     }
            // int count=0;
            // newArray[i] = arr[i];
            // if(arr[i]==num){
            //     count++;
            // }
            // if(count==1){
            //     for(int j=i; j<n-1; j++){
            //         newArray[j] = arr[j+1];
            //     }
            // }
            
        // }

        // for(int i=0; i<n-1; i++){
        //     System.out.println(newArray[i]);
        // }
    }
}
