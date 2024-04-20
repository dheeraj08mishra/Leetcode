class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean lengthFlag = false, lowerCaseFlag = false, upperCaseFlag = false, digitFlag = false,
                specialCharFlag = false, twoSameCharFlag = true;

        if (password.length() > 7) {
            lengthFlag = true;
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                lowerCaseFlag = true;
            } else if (Character.isUpperCase(password.charAt(i))) {
                upperCaseFlag = true;
            } else if (Character.isDigit(password.charAt(i))) {
                digitFlag = true;
            } else if ("!@#$%^&*()-+".contains(String.valueOf(password.charAt(i)))) {
                specialCharFlag = true;
            }
        }
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                twoSameCharFlag = false;
                break;
            }
        }
        return twoSameCharFlag && specialCharFlag && upperCaseFlag && digitFlag && lowerCaseFlag && lengthFlag;
    }
}