import random
from tkinter.messagebox import YES
print("let's play a game\n")
print("Enter two numbers of a given range ")
low = int(input("enter the starting number "))
high = int(input("enter ending number "))
r= random.randint(low,high)
print("Let's see if your guess matches with that of the computer's.You will be given 5 chances")
count = 1
while count<=5:
    guess= int(input("guess the number "))


    if r==guess:
        print('You Won!!')
        break
    
    else:
        if count==1:
            print("You will be hanged if your guess is wrong")
            print('______')
            print('|\n|\n|\n|\n|') 
        elif count ==2:
            print('______')
            print('|   |')
            print('|\n|\n|\n|')
        elif count ==3:
            print('______')
            print('|   |')
            print('| (*_*)')
            print('|\n|\n|\n')
        elif count==4:
             print('______')
             print('|   |')
             print('| (*_*)')
             print('|  /|\ ')
             print('|\n|')
             print('Last Chance')
        else:
             print('______')
             print('|   |')
             print('| (*_*)')
             print('|  /|\  ')
             print('|  /|\ \n|')
             print('YOU LOSE')
             print('The Number was',r)
    count +=1
