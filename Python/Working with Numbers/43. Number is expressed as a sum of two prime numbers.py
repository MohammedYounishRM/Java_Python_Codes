#  Goldbech's Conjecture Logic
number = int(input("Enter a number: "))
res = False
lst = []
for i in range(2, number):
    if all( i % j != 0 for j in range(2,i)):
        lst.append(i)
for k in range( len(lst) ):
    for l in range( k,len(lst) ):
        if ( lst[k] + lst[l] == number ):
            print( lst[k] ,"+", lst[l],"=",number)
            res = True
if not res:
    print(number, "cannot be expressed as a sum of two prime numbers")