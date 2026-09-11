#include <stdio.h>

int main() {
    int rows;

    scanf("%d", &rows);

    printf("The right-angled triangle pattern for %d rows is\n", rows);

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            printf("* ");
        }
        printf("\n");
    }

    return 0;
}