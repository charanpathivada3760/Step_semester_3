#include <stdio.h>

int main() {
    int number, origNumber, reversedNumber = 0, digit;

    scanf("%d", &number);

    origNumber = number;

    while (number != 0) {
        digit = number % 10;
        reversedNumber = reversedNumber * 10 + digit;
        number = number / 10;
    }

    if (reversedNumber == origNumber) {
        printf("Is the number %d a Palindrome? true", origNumber);
    } else {
        printf("Is the number %d a Palindrome? false", origNumber);
    }

    return 0;
}