
Source installation information for modders
-------------------------------------------
This code follows the Minecraft Forge installation methodology. It will apply
some small patches to the vanilla MCP source code, giving you and it access 
to some of the data and functions you need to build a successful mod.

Note also that the patches are built against "un-renamed" MCP source code (aka
SRG Names) - this means that you will not be able to read them directly against
normal code.

Setup Process:
==============================

Step 1: Open your command-line and browse to the folder where you extracted the zip file.

Step 2: You're left with a choice.
If you prefer to use Eclipse:
1. Run the following command: `gradlew genEclipseRuns` (`./gradlew genEclipseRuns` if you are on Mac/Linux)
2. Open Eclipse, Import > Existing Gradle Project > Select Folder 
   or run `gradlew eclipse` to generate the project.

If you prefer to use IntelliJ:
1. Open IDEA, and import project.
2. Select your build.gradle file and have it import.
3. Run the following command: `gradlew genIntellijRuns` (`./gradlew genIntellijRuns` if you are on Mac/Linux)
4. Refresh the Gradle Project in IDEA if required.

If at any point you are missing libraries in your IDE, or you've run into problems you can 
run `gradlew --refresh-dependencies` to refresh the local cache. `gradlew clean` to reset everything 
{this does not affect your code} and then start the process again.

Mapping Names:
=============================
For the latest license text, refer to the mapping file itself, or the reference copy here:
https://github.com/MinecraftForge/MCPConfig/blob/master/Mojang.md

Additional Resources: 
=========================
Community Documentation: https://mcforge.readthedocs.io/en/latest/gettingstarted/  
LexManos' Install Video: https://www.youtube.com/watch?v=8VEdtQLuLO0  
Forge Forum: https://forums.minecraftforge.net/  
Forge Discord: https://discord.gg/UvedJ9m  

# Overview

##Description 
This minecraft mod makes copper useful by making copper tools and copper armor. The copper tools are slightly worse then iron (to keep it balanced) but is as good at enchanting as gold (which is high).

[Software Demo Video](https://youtu.be/EXiqxxQUymE)

# Development Environment

## Tools
We used the forge mod template and forge mod program. We also used jira and teams to keep up with the project. We also used VS code and github for our coding. 

## Language and Libraries
The Language we used are python for the data base and java for the mod. The modding code felt like a different Language all together. The libraries we used is sq light 3 for the Data base and the Libraries that came with the mod template.

# Collaborators
Parker Minchey
Jack Peterson
Shon Ashby
Matt Talbert
Jonathan Starks

# Useful Websites

* [Useful libraries](https://docs.python.org/3.8/library/sqlite3.html)
* [SQLite - Python](https://www.tutorialspoint.com/sqlite/sqlite_python.html)
* [SQLite Tutorial](https://www.sqlitetutorial.net/)
* [getting the armor to have values of armor](https://github.com/The-Aether-Team/The-Aether/tree/1.20.4-develop)

# Future Work

* New weapons and types of weapons
* new dog skins 
* add magic 
