word = input("Enter the word to count Vowel and Consonent :")
lword = word.lower()
vowels = "aeiou"

vowelCount = 0
consonantCount = 0

for i in lword:
    if (i.isalpha()):
        if (i in vowels):
            vowelCount += 1
        else:
            consonantCount += 1

print("The", word, "has", vowelCount, "Vowels and", consonantCount, "Consonents")