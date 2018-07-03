//由于只有两个数，选出多的那一个
//先进行排序
//然后选中间那个数，一定是数量多的那个数

//这里我用的是插入排序
//从1 到 n， 如果左边的数比A[i]大就右移，直到左边的数比A[i]小或者已经到0了！
//这时的位置就是之前A[i]那个数的位置


class Solution {
 public int majorityElement(int[] nums) {
        InsertionSort(nums,nums.length);
        return nums[nums.length/2];
    }
    
    public  void InsertionSort(int A[], int n)
    {
        for (int i = 1; i < n; i++)         
        {
            int get = A[i];                 
            int j = i - 1;                  
            while (j >= 0 && A[j] > get)    
            {
                A[j + 1] = A[j];            
                j--;
            }
            
            A[j + 1] = get; 
        }
    }
}
