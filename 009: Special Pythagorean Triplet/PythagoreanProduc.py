def test_input(num):
    pythag_product = 0
    for i in range(0, num):
        for j in range(i + 1, num):
            c = 1000 - i - j
            if j < c and i*i + j*j == c*c:
                pythag_product = i * j * c
                break

    return pythag_product


def main():
    print(test_input(1001))


main()
