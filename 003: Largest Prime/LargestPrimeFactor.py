def main():
    num = int(input("Enter the number to get its largest prime factor: "))
    print(largest_factor(num))


def largest_factor(number):
    largest_prime = 0
    factors = []
    prime_factors = []

    for i in range(2, number):
        if number % i == 0:
            factors.append(i)

    for num in factors:
        if is_prime(num) == True and num > largest_prime:
            prime_factors.append(num)
    # print(prime_factors)
    return max(prime_factors)


def is_prime(factor):
    prime = True
    for i in range(2, factor):
        if factor % i == 0:
            prime = False
            break
        i += 1

    return prime


main()
