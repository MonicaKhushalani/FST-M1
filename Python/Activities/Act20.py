import pandas as pd

dataframe = pd.read_excel("Activity19.xls",sheet_name="sheet1")
print(dataframe)

print(dataframe.shape)

print(dataframe['Email'])

print(dataframe.sort_values('FirstName'))
