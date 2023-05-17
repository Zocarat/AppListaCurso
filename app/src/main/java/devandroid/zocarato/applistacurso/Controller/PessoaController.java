package devandroid.zocarato.applistacurso.Controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.zocarato.applistacurso.model.Pessoa;

public class PessoaController {
    @NonNull
    @Override
    public String toString() {

        Log.d("MCV_Controller", "Controller iniciada ");

        return super.toString();
    }

    public void salvar(Pessoa pessoa) {

        Log.d("MCV_Controller", "Salvo "+pessoa.toString());

    }
}
