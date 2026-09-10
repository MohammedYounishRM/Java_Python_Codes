s1 = input("Enter the String to change the cases : ")
s2 = ""
for i in s1:
    if i.isupper():
        s2 += i.lower()
    else:
        s2 += i.upper()
print("The Final Output is", s2)