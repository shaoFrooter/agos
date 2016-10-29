package commons.quicksort;

/**
 * Created by sfeng on 2016/10/29.
 */
public class QuickSort {

    public void quick_sort(int[] arr,int left,int right){
        if(left<right){
            int low=left,high=right,x=arr[left];
            while(low<high){
                while(low<high&&arr[high]>=x){
                    high--;
                }
                if(low<high){
                    arr[low++]=arr[high];
                }

                while(low<high&&arr[low]<x){
                    low++;
                }
                if(low<high){
                    arr[high--]=arr[low];
                }
            }
            arr[low]=x;
            quick_sort(arr,left,low-1);
            quick_sort(arr,low+1,right);
        }
    }

    public static void main(String[] args) {
        int[] arr={5,3,2,9,7,4};
        QuickSort qs=new QuickSort();
        qs.quick_sort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
