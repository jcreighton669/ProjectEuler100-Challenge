import math
import sys


def main():
    count = 0
    nth = int(input("Enter which prime you want: "))
    nthPrime = 0
    max_int = sys.maxsize

    for i in range(2, max_int):
        isPrime = is_prime(i)

        if isPrime:
            count += 1
            nthPrime = i
            if nth == count:
                break

    print(nthPrime, "is the", nth, "prime number")


def is_prime(factor):
    prime = True
    for i in range(2, factor):
        if factor % i == 0:
            prime = False
            break
        i += 1

    return prime


main()
