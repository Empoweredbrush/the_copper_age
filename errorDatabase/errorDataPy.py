import sqlite3

#Creates the database if it doesn't exist
con = sqlite3.connect('error.db')
cur = con.cursor()

#Prints opened successfully id database is opened correctly
print("Opened successfuly")

def welcome():
    print("Hello, welcome to the error database! This is for the documentation of bugs and errors in the code along with removing errorsa and bugs from the table.")

    print("there are two options: Insert and Delete. Please answer with Insert - for adding entries and Delete for deleting entries")

    userAnswer = input("User input:")

    if userAnswer == 'Insert' or  userAnswer == 'insert':
        insert_info()    
    elif userAnswer == 'Delete' or userAnswer == 'delete':
        print('test success for Delete')

    else:
        print('Please enter Insert or Delete, it is case sensetive')

def insert_info():
    print('Please enter the info you wish to add to the database')

    userType = input('Please enter the type of error you recieved: ')
    userMes = input('Please enter the message associated with the error: ')
    userDate = input('When did the error occur(enter in this format yyyy-mm-dd): ')
    userFile = input('Which file did the error occur in: ')
    userLine = input('Which line did the error occur on(just enter the number): ')

    cur.execute("INSERT INTO bug VALUES ('%s', '%s', '%s', '%s', '%s')" % (userType, userMes, userDate, userFile, userLine))

    con.commit()

    

welcome()

cur.execute("SELECT type FROM bug ORDER BY date")
print(cur.fetchone())

con.close()