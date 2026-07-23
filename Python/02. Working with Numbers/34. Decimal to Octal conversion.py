decimal = int(input("Enter the Decimal Value :"))
octal = oct(decimal)[2:] # slicing '0b' from output

print("Octal Number of",decimal, "is",octal)

# Method 2

# octal = ""
# if decimal == 0:
#     octal = "0"

# while decimal > 0:
#     rem = decimal % 8
#     octal = str(rem) + octal
#     decimal //= 8

# print(octal)