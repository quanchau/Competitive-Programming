import java.util.Scanner;
public class FroshWeek2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		arr = new int[n];
		for (int i = 0; i< n; i++) {
			arr[i] = in.nextInt();
		}
		long res = countInversions(arr);	
		System.out.println(res);
	}
	static int[] arr;
	static long c;
	

    public static long countInversions(int num[]){

        long countLeft,countRight,countMerge;
        int mid=num.length/2,k;

        if (num.length<=1){

            return 0;// Number of inversions will be zero for an array of this size.
        }

        int left[]=new int[mid];
        int right[]=new int [num.length-mid];

        for (k=0;k<mid;k++){
            left[k]=num[k];
        }

        // BUG 1: you can't assume right.length == m
        for (k=0;k<right.length;k++){
            right[k]=num[mid+k];
        }

        countLeft=countInversions(left);
        countRight=countInversions(right);

        int[] result=new int[num.length];
        countMerge=mergeAndCount(left,right,result);
        /*
        * Assign it back to original array.
        */
        for (k=0;k<num.length;k++){
            num[k]=result[k];
        }

        return(countLeft+countRight+countMerge);
    }
    private static long mergeAndCount(int left[],int right[],int result[]){
        long count=0;
        int a=0,b=0,i,k=0;
        while((a<left.length)&&(b<right.length)){

            if(left[a]<right[b]){
                result[k]=left[a++];// No inversions in this case.

            }
            else{// There are inversions.

                result[k]=right[b++];
                count+=left.length-a;
            }
            k++;
        }

        // BUG 2: Merging of leftovers should be done like this
        while (a < left.length)
        {
            result[k++] = left[a++];
        }
        while (b < right.length)
        {
            result[k++] = right[b++];
        }

        return count;
    }
}
