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

        String condition = mModel.CheckerStrength(password).getCondition();
        String colour = mModel.CheckerStrength(password).getColour();
        mView.showPasswordString(colour,condition);

    }
}
