import pandas as pd

dataframe = pd.read_csv("/Users/monicakhushalani/Desktop/FST_Python/logindetails.csv")

print(dataframe)
# print Username column
print("Username's :")
print(dataframe["Username"])
# print second row
print("Usename's :" , dataframe["Username"][1], " | ", "password : ", dataframe["Password"][1])
# sort assending
print("data sorted in ascending")
print(dataframe.sort_values("Username"))
# sort descneding
print("data is sorted in descending order")
print(dataframe.sort_values("Password",ascending= False))
