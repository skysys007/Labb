#include <stdio.h>

int bruteForceMatch(char text[], char pattern[]) {
    int i, j;

    for (i = 0; text[i] != '\0'; i++) {
        j = 0;

        while (text[i + j] != '\0' &&
               pattern[j] != '\0' &&
               text[i + j] == pattern[j]) {
            j++;
        }

        if (pattern[j] == '\0') {
            return i;   
        }
    }

    return -1;  
}

int main() {
    char text[100];
    char pattern[50];
    int index;

    printf("Enter the text: ");
    fgets(text, sizeof(text), stdin);

    printf("Enter the pattern: ");
    fgets(pattern, sizeof(pattern), stdin);

    for (int i = 0; text[i] != '\0'; i++) {
        if (text[i] == '\n') {
            text[i] = '\0';
            break;
        }
    }

    for (int i = 0; pattern[i] != '\0'; i++) {
        if (pattern[i] == '\n') {
            pattern[i] = '\0';
            break;
        }
    }

    index = bruteForceMatch(text, pattern);

    if (index != -1)
        printf("Pattern found at index %d\n", index);
    else
        printf("Pattern not found\n");

    return 0;
}
