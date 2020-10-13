def main():
    max_lcm = 1
    number_range = int(input("Enter an integer: "))

    for i in range(2, number_range):
        max_lcm = least_common_multiple(max_lcm, i)

    print(int(max_lcm))


def least_common_multiple(num1, num2):
    return (num1 * num2) / greatest_common_denominator(num1, num2)


def greatest_common_denominator(num1, num2):
    if num2 == 0:
        return num1
    else:
        return greatest_common_denominator(num2, num1 % num2)


main()
