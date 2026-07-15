number = int(input("Enter the number to check Automorphic:"))
sqrtValue = pow(number,2)

modulus = pow(10, len(str(number)))

if(sqrtValue % modulus == number):
    print(f"{number} is a Automorphic Number")
else:
    print(f"{number} is not a Automorphic Number")