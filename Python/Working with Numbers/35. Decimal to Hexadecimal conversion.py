decimal = int(input("Enter the Decimal Value :"))
hexa = hex(decimal)[2:]

print("Hexadecimal value of",decimal, "is",hexa)

# Method 2

# hexa = ""
# hexaChar = "0123456789ABCDEF"
# if decimal == 0:
#     hexa = "0"

# while decimal > 0:
#     rem = decimal % 16
#     hexa = hexaChar[rem] + hexa
#     decimal //= 16

# print(hexa)