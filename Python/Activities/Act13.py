def calculatesum(Numbers):
    sum = 0
    for number in Numbers:
        sum += number
    return sum

numlist = [1, 4, 7, 10]   

result = calculatesum(numlist)
print("the sum of numbers :"+ str(result))


