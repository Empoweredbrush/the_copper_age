import sqlite3

#Creates the database if it doesn't exist
con = sqlite3.connect('error.db')
cur = con.cursor()

#Prints opened successfully id database is opened correctly
print("Opened successfuly")

