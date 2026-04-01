#include<stdio.h>
#define MAX 100

int maxHeap[MAX], minHeap[MAX];
int maxSize = 0, minSize = 0;

int minComparisons = 0, minSwaps = 0;
int maxComparisons = 0, maxSwaps = 0;

void insertMin(int value) {
    int i = minSize++;
    minHeap[i] = value; 
    
    while (i != 0) {
        minComparisons++;
        if (minHeap[(i - 1) / 2] > minHeap[i]) {
            int temp = minHeap[i];
            minHeap[i] = minHeap[(i - 1) / 2];
            minHeap[(i - 1) / 2] = temp;
            minSwaps++;
            i = (i - 1) / 2;
        } else {
            break;
        }
    }
}

void displayMin() {
    printf("Min Heap: ");
    for (int i = 0; i < minSize; i++){
        printf("%d ", minHeap[i]);
    }
    printf("\n");
}

void insertMax(int value) {
    int i = maxSize++;
    maxHeap[i] = value;

    while (i != 0) {
        maxComparisons++; 
        if (maxHeap[(i - 1) / 2] < maxHeap[i]) {
            int temp = maxHeap[i];
            maxHeap[i] = maxHeap[(i - 1) / 2];
            maxHeap[(i - 1) / 2] = temp;
            maxSwaps++; 
            i = (i - 1) / 2;
        } else {
            break;
        }
    }
}

void displayMax() {
    printf("Max Heap: ");
    for (int i = 0; i < maxSize; i++){
        printf("%d ", maxHeap[i]);
    }
    printf("\n");
}

int main() {
    int arr[MAX];
    int n;

    printf("Enter the number of elements you want to add in the Heap: ");
    scanf("%d", &n);

    printf("Enter the elements in the Heap: \n");
    for (int i = 0; i < n; i++) {
        printf("Enter node %d: ", i+1);
        scanf("%d", &arr[i]);
    }
    
    for (int i = 0; i < n; i++) {
        insertMax(arr[i]);
        insertMin(arr[i]);
    }

    displayMax();
    displayMin();

    printf("Min Heap Comparisons: %d, Swaps: %d\n", minComparisons, minSwaps);
    printf("Max Heap Comparisons: %d, Swaps: %d\n", maxComparisons, maxSwaps);

    return 0;
}