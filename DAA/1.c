#include<stdio.h>
#include<time.h>

int main(){
    int numsSize;
    clock_t stime, etime;
    double time;
    printf("Enter the number of elements in the array:\n");
    scanf("%d", &numsSize);
    int nums[numsSize];
    for(int i = 0; i<numsSize; i++){
        printf("Enter element %d:", i);
        scanf("%d", &nums[i]);
    }
    int max, min;
    int i = 0, j=0;
    min = nums[0];
    int Count = 0;
    max = nums[0];
    stime = clock();
    while (i<numsSize && j<numsSize)
    {
        Count++;
        if(nums[i]<min){
            min = nums[i];

        }
        if(nums[i]>max){
            max = nums[j];

        }
        i++, j++;
    }
    etime = clock();
    time = (double)(etime-stime)/CLOCKS_PER_SEC;
    Count--;

    printf("Max: %d, Min: %d\n", max, min);
    printf("Count:%d", Count);
    printf("Input Size:%d\nTime taken:%f\n", numsSize, time);

    return 0;
}
