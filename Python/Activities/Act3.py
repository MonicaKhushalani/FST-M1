User1 = input('Select the Option user1 - Rock/paper/Scissor : ')
User2 = input('Select the Option user2 - Rock/paper/Scissor : ')

if User1 == User2 :
    print ("It's a Tie")
elif User1 == "Rock" :
    if  User2 == "Scissor":
       print("Rock Wins!")
    else :
       print("Paper wins!")
elif User1 == "Scissor" :
    if User2 == "Paper" :
        print("Scissor Wins!") 
    else:
        print("Rock wins!")     

elif User1 == "Paper" :
    if User2 == "Rock" :
       print("Paper wins") 
    else:
        print("Scissor wins!")     
else:
    print("Invalid Input!")          
