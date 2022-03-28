import pandas
data = {
    "Username" : ["admin","Charles","Deku"],
    "Password" : ["password","Charl13","AllMight"]

}
dataframe = pandas.DataFrame(data)
print(dataframe)
dataframe.to_csv("logindetails.csv")