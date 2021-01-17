package model;

public class VerificadorPasword {

    Dev dev = new Dev();
    int mayusc;

   /* public boolean VerificadorExtens (String password){
        return password.length() < 5;
    }*/

   /* public boolean VerificadorMayusc (String password){
        return  password.toLowerCase().equals(password);
    }*/

    public int LargoPassword (String password){
        return password.length();
    }

    public int ContadorMayusc (String password){
        mayusc = 0;
        int length = password.length();
        String passwordM = password.toUpperCase();
        String passwordm = password.toLowerCase();

        for (int i = 0; i < length; i++ ){
            if(!(password.charAt(i) == passwordm.charAt(i))
                    && (password.charAt(i) == passwordM.charAt(i))){
                mayusc = 1 + mayusc;
            }
        }
        return mayusc;
    }


    public Dev CheckerStrength(String password){
        if (LargoPassword(password)<3){
            dev.colour = "#D50D0D";
            dev.condition = "Weak Password";
            return (dev);
        }
        else {
            if ((LargoPassword(password)>=3 && LargoPassword(password)<5)){
                dev.colour = "#FF9800";
                dev.condition = "Normal Password";
                return (dev);
            }
            else {
                if (ContadorMayusc(password)<2){
                    dev.colour = "#FFEB3B";
                    dev.condition = "Medium Password";
                    return (dev);
                }
                else{
                    dev.colour = "#76FF3B";
                    dev.condition = "Strong Password";
                    return (dev);
                }
        }

        }
    }
public class Dev {

        String colour, condition;

    public String getColour() {
        return colour;
    }

   /* public void setColour(String colour) {
        this.colour = colour;
    }*/

    public String getCondition() {
        return condition;
    }

   /* public void setCondition(String condition) {
        this.condition = condition;
    }*/
}

}
