decimal = int(input("Enter the Decimal Value :"))
binary = bin(decimal)[2:]

print("Binary Number of",decimal, "is",binary)

# Method 2

# binary = ""
# if decimal == 0:
#     binary = "0"

# while decimal > 0:
#     rem = decimal % 2
#     binary = str(rem) + binary
#     decimal //= 2

# print(binary)