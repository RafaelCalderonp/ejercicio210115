package model;

public class VerificadorPasword {

    Dev dev = new Dev();

    public boolean VerificadorExtens (String password){
        return password.length() < 5;

    }

    public boolean VerificadorMayusc (String password){
        return  password.toLowerCase().equals(password);
    }

    public Dev CheckerStrength(String password){
        if (VerificadorExtens(password)){
            dev.colour = "#D50D0D";
            dev.condition = "Weak Password";
            return (dev);
        }
        else {
            if (VerificadorMayusc(password)){
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
public class Dev {

        String colour, condition;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}

}
