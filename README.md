Project Assignment Tracker
Project Description: The Project is designed to track the user's grade in their class. If they have no grade, no results will be shown; it will use basic arithmetic to display student's numerical grade and display the letter for the class. 

UML Diagram: https://docs.google.com/drawings/d/1HwFLYHV7FXvXUUTDnVtAreo06s1bEtcV8W8z2WD6RVQ/edit?usp=sharing

Pseudocode:

START PROGRAM

CREATE GradeBook object gradeBook

LOOP forever:
    DISPLAY menu options:
       0. Exit
       1. Display Grade
       2. Add Assignment

Switch (Option == 0)
The program will promptly end. 
 
Switch (Option == 1)
Call displaycurrentgradebook
The program will display the grade that user has input in the system, if no changes were made


Switch (Option == 2) 
If user chooses Option 2, the program will ask for the assignment, name, and weight. The user can add more points than the weight due to the possibility of extra credit.




JavaDocs were added to this project to clearly describe the purpose of each class, method, and important variable. These comments help explain how the program works and make the code easier for us and others to understand.

After writing the JavaDoc comments, the documentation was generated into HTML pages and stored in the docs/ folder. GitHub Pages is used to host these files online, so the JavaDocs can be viewed in a browser without needing the project files.

Using JavaDocs improves code readability, helps with debugging, and provides a professional level of documentation for the project.
