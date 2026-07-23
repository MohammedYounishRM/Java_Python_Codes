number = int(input("Enter the Number :"))
digit = int(input("Enter the Digit to count :"))
count = 0
originalNumber = number

while (number > 0):
    if( number % 10 == digit ):
        count += 1
    number //= 10

print("The", digit, "ocuured in the", originalNumber, "for", count, "times")

# Simple Method

# number = input("Enter the Number :")
# digit = input("Enter the Digit to count :")
# count = number.count(digit)
# print(count)