octal = input("Enter the Octal Value :") #Use int(input()) to perform the below commended code logic
decimal = int(octal, 8)

print("Decimal Number of",octal, "is",decimal)

# decimalValue = 0
# n = 0
# while (octal > 0):
#     digit = octal % 10
#     decimalValue += digit * pow(8, n)
#     octal //= 10
#     n+=1
# print(decimalValue)
