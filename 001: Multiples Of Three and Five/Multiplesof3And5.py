def sum_multiples_3_5(num):
    sum = 0
    for i in range(num):
        if (i % 3 == 0 or i % 5 == 0):
            sum += i

    return sum


def main():
    num = int(input("Enter a number: "))
    print(sum_multiples_3_5(num))


main()
