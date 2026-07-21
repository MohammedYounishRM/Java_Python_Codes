number = int(input("Enter a number to convert into words :"))

ones = ["", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"]
tens = ["", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"]
thousands = ["", "thousand", "million", "billion", "trillion"]

if (number == 0):
    print("Zero")

else:
    words = []
    thousandIndex = 0
    originalNumber = number

    while number > 0:
        subNumber = number % 1000

        if (subNumber > 0):
            combineWords = []

            if ((subNumber // 100) > 0):
                combineWords.append(ones[subNumber // 100] + "hundred")
            
            rem = subNumber % 100
            
            if (0 < rem < 20):
                combineWords.append(ones[rem])

            elif (rem >= 20):
                combineWords.append(tens[rem // 10])
                
                if ((rem % 10) > 0):
                    combineWords.append(ones[rem % 10])

            if thousands[thousandIndex]:
                combineWords.append(thousands[thousandIndex])

            words.insert(0, " ".join(combineWords))

        number //= 1000
        thousandIndex += 1

print(" ".join(words))

# Another Method

# number = int(input("Enter a number to convert into words :"))
# digits = {"0":"Zero", "1":"One", "2":"Two", "3":"Three", "4":"Four", "5":"Five", "6":"Six", "7":"Seven", "8":"Eight", "9":"Nine"}
# result = " ".join(digits[char] for char in str(number))
# print(result)