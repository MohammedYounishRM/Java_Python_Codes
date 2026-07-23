binary = input("Enter the Binary Value :") #use int() for the understand logic work
decimal = int(binary, 2)
octal = oct(decimal)[2:]

print("Octal value of", binary, "is", octal)

# Method 2
# octal = ""
# while (len(binary)%3 != 0):
#     binary = "0" + binary
# for i in range(0,len(binary),3):
#     join = binary[i:i+3]
#     octal += str(int(join,2))
# print(octal)

# For Logical understand from previous methods

# decimalValue = 0
# n = 0
# octal = ""
# while (binary > 0):
#     digit = binary % 10
#     decimalValue += digit * pow(2, n)
#     binary //= 10
#     n+=1
# if decimalValue == 0:
#     octal = "0"
# while decimalValue > 0:
#     rem = decimalValue % 8
#     octal = str(rem) + octal
#     decimalValue //= 8
# print(octal)