#include <stdio.h>

int linearSearch(int arr[], int size, int ele) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == ele)
            return i;
    }
}

void BubbleSort(int arr[], int size) {
    int temp;
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

void SelectionSort(int arr[], int size) {
    int min, temp;
    for (int i = 0; i < size - 1; i++) {
        min = i;
        for (int j = i + 1; j < size; j++) {
            if (arr[j] < arr[min])
                min = j;
        }
        temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}

void traverse(int arr[], int size) {
    for (int i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

int main() {
    int size, choice, ele;

    printf("Enter array size: ");
    scanf("%d", &size);

    int arr[size];
    printf("Enter array elements:\n");
    for (int i = 0; i < size; i++)
        scanf("%d", &arr[i]);

    printf("1. Linear Search\n");
    printf("2. Bubble Sort\n");
    printf("3. Selection Sort\n");
    printf("Enter choice: ");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            printf("Enter element: ");
            scanf("%d", &ele);
            int l = linearSearch(arr, size, ele);
            if (l != -1)
                printf("Found at index %d\n", l);
            else
                printf("Not found\n");
            break;

        case 2:
            BubbleSort(arr, size);
            traverse(arr, size);
            break;
        case 3:
            SelectionSort(arr, size);
            traverse(arr, size);
            break;
        default:
            printf("Invalid choice\n");
    }

    return 0;
}
