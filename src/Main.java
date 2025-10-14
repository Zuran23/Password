//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));



    for (char ch : password.toCharArray()) {
        if (Character.isDigit(ch)) {
            hasDigit = true;
        }
        if (specialCharacters.indexOf(ch) != -1) {
            hasSpecialChar = true;
        }
        if (hasDigit && hasSpecialChar) {
            return true;
            // If both conditions are met, no need to check further
        }
    }

}
}
