public class Main {
    public static void main(String[] args) {
        enterProgram("Java_student", "qwerqwer", "qwerqwer");
        System.out.println(3);
    }

    public static void enterProgram(String login, String password, String confirmPassword) {

        try {
            checkPassword(login, password, confirmPassword);
            checklogin(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            throw new WrongLoginException();
        } catch (WrongPasswordException e) {
            throw new WrongPasswordException();
        /*}finally{
            System.out.println("пароль введен неверно!!!. Попробуйте заново!!!");
            }*/
        }
    }

    public static void checkPassword(String login, String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() > 20 || password.equals(confirmPassword) == false) {
            throw new WrongPasswordException();
        }
    }

    public static void checklogin(String login, String password, String confirmPassword) throws WrongLoginException {
        char[] arr = login.toCharArray();
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
        for (int i = 0; i < arr.length; i++) {
            for (char ch = 'А'; ch <= 'Я'; ch++) {
                if (arr[i] == ch) {
                    throw new WrongLoginException();
                }
            }
            for (char ch = 'а'; ch <= 'я'; ch++) {
                if (arr[i] == ch) {
                    throw new WrongLoginException();
                }
            }
        }
    }
}



