import sqlite3

#Creates the database if it doesn't exist
con = sqlite3.connect('error.db')
cur = con.cursor()

#Prints opened successfully id database is opened correctly
print("Opened successfuly")

def welcome():
    print("Hello, welcome to the error database! This is for the documentation of bugs and errors in the code along with removing errorsa and bugs from the table. \n")

    print("there are two options: Insert and Delete. Please answer with Insert - for adding entries, Delete - for deleting entries, and select - for displaying information in the database \n")

    userAnswer = input("User input:").lower()
    if userAnswer == 'insert':
        insert_info()    
    elif userAnswer == 'delete':
        delete_info()
    elif userAnswer == 'select':
        select_info()
    else:
        print('Please enter Insert or Delete, it is case sensetive')
        welcome()
        
    while_case = True

    while while_case == True:
        user = input("Do you want to do something else? (type yes or no):").lower()

        if user == "yes":
            while_case = True
            welcome()
        elif user == "no":
            while_case = False

def insert_info():
    print('Please enter the info you wish to add to the database \n')

    userType = input('Please enter the type of error you recieved: ')
    userMes = input('Please enter the message associated with the error: ')
    userDate = input('When did the error occur(enter in this format yyyy-mm-dd): ')
    userFile = input('Which file did the error occur in: ')
    userLine = input('Which line did the error occur on(just enter the number): ')

    cur.execute("INSERT INTO bug VALUES ('%s', '%s', '%s', '%s', '%s')" % (userType, userMes, userDate, userFile, userLine))

    con.commit()

def delete_info():
    print("Before entering what you want to delete please look in the database for what you are looking for and choose a column, preferrably type.")

    userInput = input("Please enter the entry you wish to remove (example: use type for column and what it states in that column, if there are multiple use date instead and enter the date of that row):")

    cur.execute("DELETE FROM bug WHERE type = '%s'" % userInput)

    con.commit()

def select_info():
    print("To better help in comparing bugs and data from the bugs collected. The data can be organized by any column in the database, for conveniance the order by request will give the options to choose from. \n")

    print("Please enter the information below \n")

    user_item = input("Please enter the name of the type of bug you wish to select(example: syntax error): ")

    order_by = input("How would you like to order the data? \n Options: type, message, date, filename, or line").lower()

    print("\n")

    user_answer = input("would you like to display a single item or multiple items? (single or multiple):").lower()

    print("\n")

    if user_answer == "single":
        cur.execute("SELECT type, message, date, filename, line FROM bug WHERE type = '%s' ORDER BY %s" % (user_item, order_by))
        print(cur.fetchone)
    elif user_answer == "multiple":
        for row in cur.execute("SELECT type, message, date, filename, line FROM bug WHERE type = '%s' ORDER BY %s" % (user_item, order_by)):
            print(row)
    else:
        print("please enter single or multiple, is case sensetive")
        select_info()


welcome()

con.close()