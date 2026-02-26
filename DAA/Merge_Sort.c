#include <stdio.h>

void merge(int nums[], int left, int mid, int right)
{
    int i, j, k;
    int n1 = mid - left + 1;
    int n2 = right - mid;
    int L[n1], R[n2];

    for (i = 0; i < n1; i++)
    {
        L[i] = nums[left + i];
    }
    for (j = 0; j < n2; j++)
    {
        R[j] = nums[mid + 1 + j];
    }

    i = 0;
    j = 0;
    k = left;

    while (i < n1 && j < n2)
    {
        if (L[i] <= R[j])
        {
            nums[k] = L[i];
            i++, k++;
        }
        else
        {
            nums[k] = R[j];
            k++, j++;
        }
    }
    while (i < n1)
    {
        nums[k] = L[i];
        k++, i++;
    }
    while (j < n2)
    {
        nums[k] = R[j];
        k++, j++;
    }
}

void mergeSort(int nums[], int left, int right)
{
    if (left < right)
    {
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }
}

int main()
{
    int size;
    printf("Enter the number of elements in the Array: ");
    scanf("%d", &size);
    int nums[size];
    for (int i = 0; i < size; i++)
    {
        printf("Enter the Element %d: ", i + 1);
        scanf("%d", &nums[i]);
    }
    printf("\nUnsorted Array: \n");
    for (int i = 0; i < size; i++)
    {
        printf("%d\n", nums[i]);
    }

    mergeSort(nums, 0, size - 1);
    printf("Sorted Array: ");
    for (int i = 0; i < size; i++)
    {
        printf("%d ", nums[i]);
    }
    return 0;
}