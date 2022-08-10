public class Main {
    public static void main(String[] args) {
        enterProgram("Java_studendйй", "qwerqwer", "qwerqwer");
    }
    public static void enterProgram(String login, String password, String confirmPassword) {
        boolean bool=true;
        try {
            checkPassword( password, confirmPassword);
            checklogin(login);
        } catch (WrongLoginException e) {
           bool=false;
            throw new WrongLoginException() ;
        } catch (WrongPasswordException e) {
            bool=false;
            throw new WrongPasswordException();
       } finally {
            if (bool){
                System.out.println("Вход успешно выполнен!!!");
            } else {
                System.out.println("Попробуйте снова!!!");
            }
        }
        }

    public static boolean checkPassword( String password, String confirmPassword) throws WrongPasswordException {
        char[] arr = password.toCharArray();
        if (password.length() > 20 || password.equals(confirmPassword) == false) {
            throw new WrongPasswordException();
        }
        for (int j = 0; j < arr.length; j++){
          if (arr[j]>='A'&& arr[j]<='Z'||arr[j]>='a'&& arr[j]<='z'||arr[j]=='_'||arr[j]>='0' &&arr[j]<='9') {
            }else {
              throw new WrongPasswordException();
          }
        }
        return false;
    }


    public static boolean checklogin(String login) throws WrongLoginException {
      //  boolean bool=true;
        char[] arr = login.toCharArray();
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]>='A'&& arr[j]<='Z'||arr[j]>='a'&& arr[j]<='z'||arr[j]=='_' ) {
                }else {

                    throw new WrongLoginException();
                }
            }
         return false;
    }
}



