#include <stdio.h>

int main() {
    int number1, number2, origNumber1, origNumber2, remainder;

    scanf("%d %d", &number1, &number2);

    origNumber1 = number1;
    origNumber2 = number2;

    while (number2 != 0) {
        remainder = number1 % number2;
        number1 = number2;
        number2 = remainder;
    }

    printf("The GCD of %d and %d is %d", 
           origNumber1, origNumber2, number1);

    return 0;
}