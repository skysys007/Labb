#include<stdio.h>
#include<time.h>

int binarySearch(int arr[], int size, int ele, int* count){
    *count = 0;
    int low = 0;
    int high = size-1;
    int mid = (low+high)/2;
    while(low<=high){
        (*count)++;
        if (arr[mid] == ele)
        {
            return mid+1;
        }
        if (ele<arr[mid])
        {
            high = mid-1;
            mid = (low+high)/2;
        }else{
            low = mid + 1;
            mid = (low + high)/2;
        }
    }
    return -1;
}

int linearSearch(int arr[], int size, int ele, int* count){
    *count = 0;
    for(int i = 0; i<size; i++){
        (*count)++;
        if(arr[i]==ele){
            return i+1;
        }
    }
    return -1;
}

int main(){
    int size;
    printf("Enter the number of Elements in the array: ");
    scanf("%d", &size);
    int arr[size];
    for(int i = 0; i<size; i++){
        printf("Enter Element %d: ", i+1);
        scanf("%d", &arr[i]);
    }
    int ele;
    int count;
    printf("Enter Element to Search for: ");
    scanf("%d", &ele);
    int found = binarySearch(arr, size, ele, &count);
    if(found){
        printf("\nElement found at %d\n", found);
        printf("Number of Comparisons: %d\n", count);
    }else{
        printf("Element Not found");
    }
    found = linearSearch(arr, size, ele, &count);
    if(found){
        printf("\nElement found at %d\n", found);
        printf("Number of Comparisons: %d\n", count);
    }else{
        printf("Element not found");
    }
}
