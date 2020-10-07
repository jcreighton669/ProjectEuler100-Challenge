def main():
    num = int(input("Enter a number: "))
    print(fibonacciSequence(num))


def fibonacciSequence(index):
    sum = 0
    f0 = 0
    f1 = 1
    f2 = 1

    for i in range(3, index):
        f0 = f1
        f1 = f2
        f2 = f0 + f1

        if (f2 % 2 == 0):
            sum += f2

        i += 1

    return sum


main()
