package model;

public class VerificadorPasword {


    public boolean VerificadorExtens (String password){
        return password.length() < 5;

    }

    public boolean VerificadorMayusc (String password){
        return  password.toLowerCase().equals(password);
    }

    public String CheckerStrength(String password){
        if (VerificadorExtens(password)){
            return ("Weak");
        }
        else {
            if (VerificadorMayusc(password)){
                return ("Medium");
            }
            else{
                return ("Strong");
            }
        }
    }


}
