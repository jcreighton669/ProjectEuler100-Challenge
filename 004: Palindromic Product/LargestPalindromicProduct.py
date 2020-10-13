import math


def main():
    digits = int(input("Enter number of digits for multiplier: "))

    count = 0
    first_value = 0
    second_value = 0
    product = 0
    palindromic_product = 0
    lower_limit = int(math.pow(10, digits - 1))
    upper_limit = int(math.pow(10, digits))

    for i in range(lower_limit, upper_limit):
        for j in range(lower_limit, upper_limit):
            product = i * j
            if isPalindrome(product):
                count += 1
                first_value = i
                second_value = j
                palindromic_product = product

    print(first_value, "*", second_value, "=", palindromic_product)
    print(count)


def isPalindrome(product):
    remain = 0
    reverse_product = 0
    temp = product
    palindrome = False
    while temp != 0:
        remain = temp % 10
        reverse_product = reverse_product * 10 + remain
        temp = int(temp / 10)

    if product == reverse_product:
        palindrome = True

    return palindrome


main()
