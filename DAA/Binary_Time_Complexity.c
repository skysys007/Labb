#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int linearSearch(int arr[], int n, int key, int *comparisons) {
    *comparisons = 0;
    for (int i = 0; i < n; i++) {
        (*comparisons)++;
        if (arr[i] == key) {
            return i;
        }
    }
    return -1;
}

// Function for Binary Search (array must be sorted)
int binarySearch(int arr[], int n, int key, int *comparisons) {
    int low = 0, high = n - 1;
    *comparisons = 0;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        (*comparisons)++;
        if (arr[mid] == key)
            return mid; // Element found
        else if (arr[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return -1; // Not found
}

// Function to fill array with random numbers
void fillArray(int arr[], int n) {
    for (int i = 0; i < n; i++)
        arr[i] = i + 1;
        }

int main() {
    int n, key, comparisons;
    clock_t start, end;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];
    fillArray(arr, n);

    printf("Enter the element to search: ");
    scanf("%d", &key);

    // Linear Search
    start = clock();
    int index = linearSearch(arr, n, key, &comparisons);
    end = clock();
    double linearTime = ((double)(end - start)) / CLOCKS_PER_SEC;

    if (index != -1)
        printf("Linear Search: Element found at index %d\n", index);
    else
        printf("Linear Search: Element not found\n");
    printf("Comparisons: %d, Time taken: %f seconds\n\n", comparisons, linearTime);

    // Binary Search
    start = clock();
    index = binarySearch(arr, n, key, &comparisons);
    end = clock();
    double binaryTime = ((double)(end - start)) / CLOCKS_PER_SEC;

    if (index != -1)
        printf("Binary Search: Element found at index %d\n", index);
    else
        printf("Binary Search: Element not found\n");
    printf("Comparisons: %d, Time taken: %f seconds\n", comparisons, binaryTime);

    return 0;
}
