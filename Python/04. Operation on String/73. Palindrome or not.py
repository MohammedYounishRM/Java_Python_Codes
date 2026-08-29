s = input("Enter the String to check for Palindrome:")

rev = s[::-1]

if s == rev:
    print(s, "is Palindrome")
else:
    print(s, "is not Palindrome")