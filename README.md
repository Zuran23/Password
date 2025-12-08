Project Requirements: Assigment Checker
Pseudocode:

START PROGRAM

CREATE GradeBook object gradeBook

LOOP forever:
    DISPLAY menu options:
        1. Add assignment
        2. View assignments
        3. View average
        4. Exit

    READ userChoice

    IF userChoice == 1:
        PROMPT "Enter assignment name"
        READ name
        PROMPT "Enter grade"
        READ grade
        CREATE Assignment object with (name, grade)
        CALL gradeBook.addAssignment(assignment)

    ELSE IF userChoice == 2:
        CALL gradeBook.displayAssignments()

    ELSE IF userChoice == 3:
        average = CALL gradeBook.calculateAverage()
        DISPLAY average

    ELSE IF userChoice == 4:
        DISPLAY "Goodbye!"
        BREAK loop

    ELSE:
        DISPLAY "Invalid option. Try again."

END LOOP

END PROGRAM


JavaDocs were added to this project to clearly describe the purpose of each class, method, and important variable. These comments help explain how the program works and make the code easier for us and others to understand.

After writing the JavaDoc comments, the documentation was generated into HTML pages and stored in the docs/ folder. GitHub Pages is used to host these files online, so the JavaDocs can be viewed in a browser without needing the project files.

Using JavaDocs improves code readability, helps with debugging, and provides a professional level of documentation for the project.
