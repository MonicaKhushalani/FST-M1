

user1 = input("What is Player 1's name? ")
user2 = input("What is Player 2's name? ")


while True:
    
    user1_answer = input('Select the Option user1 - Rock/paper/Scissor : ')
    user2_answer = input('Select the Option user1 - Rock/paper/Scissor : ')
    
    
    if user1_answer == user2_answer:
        print("It's a tie!")
    elif user1_answer == 'Rock':
        if user2_answer == 'Scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1_answer == 'Scissors':
        if user2_answer == 'Paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif user1_answer == 'Paper':
        if user2_answer == 'Rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! ")

    
    playagain = input("Do you want to play again yes/no: ")
    
    if(playagain == "yes"):
        pass
    elif(playagain == "no"):
        raise SystemExit
    
    else:
        print("You entered an invalid option.")
        raise SystemExit