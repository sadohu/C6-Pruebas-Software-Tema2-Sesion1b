package pe.edu.cibertec;

public class Tema2Sesion1b {

    public static boolean isLeap(int year) {

        return (year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0);

//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    return true;
//                } else {
//                    return false;
//                }
//            } else {
//                return true;
//            }
//        } else {
//            return false;
//        }
    }

    public static boolean pciPass(String password){
        String regex = "^(?=.*[A-Z])[a-zA-Z0-9]{6,10}$";
        return password.matches(regex);
    }

}
