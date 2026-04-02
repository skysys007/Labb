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

void displayMin() {
    printf("Min Heap: ");
    for (int i = 0; i < minSize; i++){
        printf("%d ", minHeap[i]);
    }
    printf("\n");
}


void maxHeapify(int arr[], int n, int i) {
    int largest = i;
    int left = 2*i + 1;
    int right = 2*i + 2;

    if (left < n && arr[left] > arr[largest])
        largest = left;

    if (right < n && arr[right] > arr[largest])
        largest = right;

    if (largest != i) {
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;
        maxHeapify(arr, n, largest);
    }
}


void minHeapify(int arr[], int n, int i) {
    int smallest = i;
    int left = 2*i + 1;
    int right = 2*i + 2;

    if (left < n && arr[left] < arr[smallest])
        smallest = left;

    if (right < n && arr[right] < arr[smallest])
        smallest = right;

    if (smallest != i) {
        int temp = arr[i];
        arr[i] = arr[smallest];
        arr[smallest] = temp;
        minHeapify(arr, n, smallest);
    }
}

// Sort Max Heap (Ascending)
void heapSortMax() {
    int n = maxSize;

    for (int i = n/2 - 1; i >= 0; i--)
        maxHeapify(maxHeap, n, i);

    for (int i = n - 1; i > 0; i--) {
        int temp = maxHeap[0];
        maxHeap[0] = maxHeap[i];
        maxHeap[i] = temp;

        maxHeapify(maxHeap, i, 0);
    }
}

// Sort Min Heap (Descending)
void heapSortMin() {
    int n = minSize;

    for (int i = n/2 - 1; i >= 0; i--)
        minHeapify(minHeap, n, i);

    for (int i = n - 1; i > 0; i--) {
        int temp = minHeap[0];
        minHeap[0] = minHeap[i];
        minHeap[i] = temp;

        minHeapify(minHeap, i, 0);
    }
}

void displaySortedMax() {
    printf("Sorted (Ascending using Max Heap): ");
    for (int i = 0; i < maxSize; i++)
        printf("%d ", maxHeap[i]);
    printf("\n");
}

void displaySortedMin() {
    printf("Sorted (Descending using Min Heap): ");
    for (int i = 0; i < minSize; i++)
        printf("%d ", minHeap[i]);
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

    heapSortMax();
    heapSortMin();

    displaySortedMax();
    displaySortedMin();

    printf("Min Heap Comparisons: %d, Swaps: %d\n", minComparisons, minSwaps);
    printf("Max Heap Comparisons: %d, Swaps: %d\n", maxComparisons, maxSwaps);

    return 0;
}
