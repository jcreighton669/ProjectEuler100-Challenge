import math


def main():
    number = int(input("Enter an integer: "))
    sum_difference(number)


def sum_difference(num):
    first_array = []
    second_array = []
    j = 0
    first_sum = 0
    second_sum = 0
    for i in range(num):
        j += 1
        first_array.append(j)
        second_array.append(math.pow(j, 2))

    for num in first_array:
        first_sum += num

    first_product = math.pow(first_sum, 2)

    for num in second_array:
        second_sum += num

    print(int(first_product - second_sum))


main()
