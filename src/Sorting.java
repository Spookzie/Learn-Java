import java.util.ArrayList;


public class Sorting
{
    public void SelectionSort()
    {
        int[] arr = {13,46,24,52,20,9};

        for(int i=0; i<arr.length; i++)
        {
            int smallestIndex = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[smallestIndex])
                    smallestIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }

        PrintArray("Selection", arr);
    }


    public void BubbleSort()
    {
        int[] arr = {13,46,24,52,20,9};

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        PrintArray("Bubble", arr);
    }


    public void InsertionSort()
    {
        int[] arr = {13,46,24,52,20,9};

        for(int i=1; i<arr.length; i++)
        {
            int key = arr[i];
            int j=i-1;

            while(j>=0 && key < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        PrintArray("Insertion", arr);
    }


    // Merge Sort
    //-----------------------------------
    public void MergeSort()
    {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;

        Sort(arr, 0, n-1);

        PrintArray("Merge", arr);
    }

    private void Sort(int[] arr, int low, int high)     //Divide
    {
        if(low >= high)     return;

        int mid = (low+high)/2;
        Sort(arr, low, mid);
        Sort(arr, mid+1, high);
        Merge(arr, low, mid, high);
    }

    private void Merge(int[] arr, int low, int mid, int high)
    {
        ArrayList<Integer> tempArr = new ArrayList<>();
        int left = low, right = mid+1;

        while(left<=mid && right<=high)
        {
            if(arr[left] < arr[right])
            {
                tempArr.add(arr[left]);
                left++;
            }
            else
            {   
                tempArr.add(arr[right]);
                right++;
            }
        }

        while(right<=high)
        {
            tempArr.add(arr[right]);
            right++;
        }
        while(left<=mid)
        { 
            tempArr.add(arr[left]);
            left++;
        }

        for(int i=low; i<=high; i++)
            arr[i] = tempArr.get(i-low);
    }
    //-----------------------------------


    // Recursive Bubble Sort
    //-----------------------------------
    public void RecursiveBubbleSort()
    {
        int[] arr = {13,46,24,52,20,9};

        RBS_Func(arr, arr.length);

        PrintArray("Recursive Bubble", arr);
    }

    private void RBS_Func(int[] arr, int n)
    {
        if(n==1)    return;

        for(int i=0; i<n-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i]   = arr[i+1];
                arr[i+1] = temp;
            }
        }
        
        RBS_Func(arr, n-1);
    }
    //-----------------------------------


    // Recursive Insertion Sort
    //-----------------------------------
    public void RecursiveInsertionSort()
    {
        int[] arr = {13,46,24,52,20,9};

        RIS_Func(arr, 0, arr.length);

        PrintArray("Recursive Insertion", arr);
    }

    private void RIS_Func(int[] arr, int i, int n)
    {
        if(i==n)    return;
        
        int j=i;

        while(j>0 && arr[j-1]>arr[j])
        {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j]   = temp;
            
            j--;
        }

        RIS_Func(arr, i+1, n);
    }
    //-----------------------------------


    private void PrintArray(String technique, int[] arr)
    {
        System.out.println("\n" + technique + ": ");
        for(int num : arr)
            System.out.print(num + " ");
    }
}