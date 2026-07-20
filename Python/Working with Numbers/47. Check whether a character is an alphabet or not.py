# alphabet = input("Enter a Alphabet :")

# if ( alphabet.isalpha() or 'a'<= alphabet <='z' or 'A'<= alphabet <= 'Z' ):
#     print(alphabet, "is an Alphabet")
# else:
#     print(alphabet, "is not an Alphabet")

import string
alphabet = input("Enter a Alphabet :")
if all(char in string.ascii_letters for char in alphabet): # loops all the char to check
    print(alphabet, "is an Alphabet")
else:
    print(alphabet, "is not an Alphabet")