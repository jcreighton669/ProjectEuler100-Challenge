def primes(number):
    prime = []
    sum = 0

    for i in range(number):
        prime.append(True)

    for p in range(2, number):
        if prime[p] == True:
            for i in range(p * 2, number):
                prime[i] = False

    for i in range(2, number):
        if prime[i] == True:
            sum += i

    return sum


def main():
    upper_limit = int(input("Enter an upper limit: "))
    print(primes(upper_limit))


main()
