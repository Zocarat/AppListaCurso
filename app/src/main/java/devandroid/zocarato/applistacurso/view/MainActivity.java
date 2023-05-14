package devandroid.zocarato.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.zocarato.applistacurso.R;
import devandroid.zocarato.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;
    String tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        // Atribuir conteúdo, valores para o Objeto
        // Conforme o seu MODELO, TEMPLATE
        pessoa.setPrimeiroNome("Jhonata");
        pessoa.setSobrenome("Zocarato");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("16 981120703");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("José");
        outraPessoa.setSobrenome("Silva");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("18 99999999");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobrenome();
        dadosPessoa += " Curso desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobrenome();
        dadosOutraPessoa += " Curso desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();




        Log.i(tag:"POOAndroid", pessoa.toString());
        Log.i(tag:"POOAndroid", pessoa.toString());



    }
}