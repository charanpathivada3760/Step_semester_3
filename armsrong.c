#include <stdio.h>

int main() {
    int number, origNumber, sum = 0, digit;

    scanf("%d", &number);

    origNumber = number;

    while (number != 0) {
        digit = number % 10;
        sum = sum + digit * digit * digit;
        number = number / 10;
    }

    if (sum == origNumber) {
        printf("Is the number %d an Armstrong number? true", origNumber);
    } else {
        printf("Is the number %d an Armstrong number? false", origNumber);
    }

    return 0;
}