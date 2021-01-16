package presenter;

import model.VerificadorPasword;
import presenter.IViewPresenter;

public class Presentador {

    private IViewPresenter mView;
    private VerificadorPasword mModel;
    //Se elimina model generado, para que no conoscan con el model
    public Presentador(IViewPresenter mView) {
        this.mView = mView;
        this.mModel = new VerificadorPasword();
    }

    public void  verifcadorPassword (String password){

        if (mModel.CheckerStrength(password).equals("Weak")){
    mView.showPasswordString("#D50D0D", "Weak Password");
        }
        else {
            if (mModel.CheckerStrength(password).equals("Medium")){
                mView.showPasswordString("#FFEB3B","Medium Password");
            }
            else {
                mView.showPasswordString("#76FF3B", "Strong Password");
            }
        }
    }
}
