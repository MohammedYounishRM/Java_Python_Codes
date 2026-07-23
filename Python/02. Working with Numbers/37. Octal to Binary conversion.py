octal = input("Enter the Octal Value :") # use int() for Method 2
binary = bin(int(octal, 8))[2:]

print("Binary value of", octal, "is", binary)

# Method 2

# i = 0
# decimal = 0
# while (octal != 0): # Octal to Decimal
#     digit = octal % 10
#     decimal += digit * pow(8, i)
#     octal //= 10
#     i += 1

# binary = 0
# rem = 0
# i = 1
# while (decimal != 0): # Decimal to Binary
#     rem = decimal % 2
#     binary += rem * i
#     decimal //= 2
#     i *= 10
# print("Binary value is", binary)