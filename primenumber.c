#include <stdio.h>
#include <stdbool.h>

int main() {
    int number;
    bool isPrime = true;

    scanf("%d", &number);

    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }

    printf("Is the number %d a Prime number? %s", 
           number, isPrime ? "true" : "false");

    return 0;
}