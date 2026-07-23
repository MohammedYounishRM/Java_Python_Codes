number = int(input("Enter a Number :"))
numToString = str(number)
newList = []

for i in numToString:
    if ( i == "0" ):
        newList.append("1")
    else:
        newList.append(i)

convertedString = ""
for i in newList:
    convertedString += i
print("Input :",number,"Converted :",convertedString)

# Built-in
# number = int(input("Enter a Number :"))
# numToString = str(number)
# print("Converted number is:" + numToString.replace('0','1'))