s = input("Enter the String to Count the Vowel:").lower()
count = 0
for char in s:
    if (char=='a' or char=='e' or char=='i' or char=='o' or char=='u'):
        count += 1

if count>0:
    print(s, "has contains",count, "vowels and",abs(count-len(s)),"consonents.")
else:
    print("Given word has complete Consonent.")