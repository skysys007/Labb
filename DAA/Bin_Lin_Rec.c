#include <stdio.h>

int binarySearch(int arr[], int low, int high, int target, int * count ) {
    if (low > high) {
        return -1;
    }
    (*count)++;

    int mid = (low + high) / 2;

    if (arr[mid] == target) {
        return mid+1;
    }
    else if (target < arr[mid]) {
        return binarySearch(arr, low, mid - 1, target, *count);
    }
    else {
        return binarySearch(arr, mid + 1, high, target, *count);
    }
}

int main() {
    int size, count = 0;
    printf("Enter number of Elements: ");
    scanf("%d", &size);
    int arr[size];
    for(int i = 0; i<size;i++){
        printf("Enter Element %d: ", i+1);
        scanf("%d", &arr[i]);
    }
    int target;
    printf("Enter element to Search for: ");
    scanf("%d", &target);
    int result = binarySearch(arr, 0, size - 1, target, &count);
    if (result != -1){

        printf("Element found at %d\n", result);
        printf("Number of Comparisons: %d\n", count);
    }
    else{
        printf("Element not found\n");
    }
    return 0;
}
