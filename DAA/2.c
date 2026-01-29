#include<stdio.h>

int main(){
    int numsSize;
    printf("Enter the number of elements in the array:\n");
    scanf("%d", &numsSize);
    int nums[numsSize];
    for(int i = 0; i<numsSize; i++){
        printf("Enter element %d:", i);
        scanf("%d", &nums[i]);
    }
    int i = 0;
    int Count = 0;
    int ele;
    printf("Enter the element to Search:");
    scanf("%d", &ele);
    int found = -1;
    while (i<numsSize)
    {
        if(ele == nums[i]){
            found = i;
        }else{
            Count++;
        }
            i++;
    }
    if(found){
        printf("Element found at index %d\n", found);
    }else{
        printf("Element not Found\n");
    }

    printf("Count:%d", Count);

    return 0;
}
