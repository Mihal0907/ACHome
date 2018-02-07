package ua.artcode.week6.exeptions;

public class Intro {

    public static void main(String[] args) throws Exception {
        try{
            String res = MyService.login("admin6", "67");
            System.out.println(res);
        } catch (InvalidCredentialException e){
            System.err.println(e.getMessage());
        }
    }
}
