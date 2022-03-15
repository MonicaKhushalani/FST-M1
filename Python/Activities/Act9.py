Numbers_1 = [1,2,3,4,5,6,7,8,9]
Numbers_2 =[11,22,33,44,55,66,77,88,99]

Numbers_3 =[]

for num in Numbers_1:
    if num% 2!= 0:
        Numbers_3.append(num)
for num in Numbers_2 :
    if num% 2 ==0 :
      Numbers_3.append(num)   

print(Numbers_3)