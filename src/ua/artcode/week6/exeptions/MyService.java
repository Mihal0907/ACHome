package ua.artcode.week6.exeptions;

public class MyService {



    public static String login (String name, String pass) throws InvalidCredentialException {

        if ("admin".equalsIgnoreCase(name) && "67".equalsIgnoreCase(pass)){
            return String.valueOf(genRandomKey());
        } else {
                throw new InvalidCredentialException("wrong pass or login");
        }
    }

    private static int genRandomKey() {
        return (int)(System.currentTimeMillis() * Math.random());
    }
}
