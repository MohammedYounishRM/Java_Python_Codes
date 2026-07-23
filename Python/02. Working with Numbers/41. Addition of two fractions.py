from fractions import Fraction

n1 = int(input("Enter the Numerator 1 :"))
d1 = int(input("Enter the Denominator 1 :"))
n2 = int(input("Enter the Numerator 2 :"))
d2 = int(input("Enter the Denominator 2 :"))

numerator = (n1*d2)+(n2*d1)
denominator = d1*d2
print(Fraction(numerator , denominator))

# Direct Method
# n1 = int(input("Enter the Numerator 1 :"))
# d1 = int(input("Enter the Denominator 1 :"))
# n2 = int(input("Enter the Numerator 2 :"))
# d2 = int(input("Enter the Denominator 2 :"))

# fraction1 = Fraction(n1, d1)
# fraction2 = Fraction(n2, d2)

# result = fraction1 + fraction2
# print(f"The sum is: {result}")