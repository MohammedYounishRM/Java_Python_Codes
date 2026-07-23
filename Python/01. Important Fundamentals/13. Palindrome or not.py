value = input("Enter a Value to check Palindrome:")
reversedValue = value[::-1]
print(f"{value} is Palindrome" if (value == reversedValue) else f"{value} is not Palindrome")