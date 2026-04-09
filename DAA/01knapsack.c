#include <stdio.h>

int max(int a, int b){
    if (a > b){
        return a;
    } else {
        return b;
    }
}

// W - max capacity of knapsack - columns
// wt[] - array of wt of items
// val[] = array of values[profit] of each item
// n - number of items - rows
int knapsack(int W, int wt[], int val[], int n){
    int dp[n+1][W+1]; // a 2D array

    for (int i = 0; i <= n; i++){
        for (int w = 0; w <= W; w++){
            if (i == 0 || w == 0){
                dp[i][w] = 0; 
            }
            else if (wt[i-1] <= w){
                dp[i][w] = max(val[i-1] + dp[i-1][w - wt[i-1]], dp[i-1][w]);
            } else {
                dp[i][w] = dp[i-1][w];
            }
        }
    }

    int w = W;
    printf("Selected items: ");
    for (int i = n; i > 0 && w > 0; i--){
        if (dp[i][w] != dp[i-1][w]){
            printf("%d ", i); 
            w -= wt[i-1];
        }
    }
    printf("\n");

    return dp[n][W]; 
}

int main() {
    int val[] = {60, 100, 120};
    int wt[]  = {10, 20, 30};
    int W = 50;
    int n = sizeof(val) / sizeof(val[0]);

    // i\w   0       10          20          30          40          50
    // 0     0       0           0           0           0           0
    // 1     0       60          60          60          60          60     
    // 2     0       60          60          100         160         160
    // 3     0       60          100         160         180         220
    //                                                                
    //                                                                    
    printf("%d\n", knapsack(W, wt, val, n));

    return 0;
}