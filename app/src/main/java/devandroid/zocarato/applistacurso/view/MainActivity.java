package devandroid.zocarato.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.zocarato.applistacurso.Controller.PessoaController;
import devandroid.zocarato.applistacurso.R;
import devandroid.zocarato.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {


    SharedPreferences preferences;
    public static final String NOME_PREFERENCES = "pref_listavip";
    PessoaController controller;

    Pessoa pessoa;
    Pessoa outraPessoa;

    EditText edit_primeiro_nome;
    EditText edit_sobrenome;
    EditText edit_nome_do_curso;
    EditText edit_telefone_contato;

    Button btn_limpar;
    Button btn_salvar;
    Button btn_finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences(NOME_PREFERENCES, 0);
        SharedPreferences.Editor listaVip = preferences.edit();


        controller = new PessoaController();
        controller.toString();

        pessoa = new Pessoa();
        //oi

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("José");
        outraPessoa.setSobrenome("Silva");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("18 99999999");

        edit_primeiro_nome = findViewById(R.id.edit_primeiro_nome);
        edit_sobrenome = findViewById(R.id.edit_sobrenome);
        edit_nome_do_curso = findViewById(R.id.edit_nome_do_curso);
        edit_telefone_contato = findViewById(R.id.edit_telefone_contato);

        btn_limpar = findViewById(R.id.btn_limpar);
        btn_salvar = findViewById(R.id.btn_salvar);
        btn_finalizar = findViewById(R.id.btn_finalizar);

        edit_primeiro_nome.setText(pessoa.getPrimeiroNome());
        edit_sobrenome.setText(pessoa.getSobrenome());
        edit_nome_do_curso.setText(pessoa.getCursoDesejado());
        edit_telefone_contato.setText(pessoa.getTelefoneContato());
        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_primeiro_nome.setText("");
                edit_sobrenome.setText("");
                edit_nome_do_curso.setText("");
                edit_telefone_contato.setText("");
            }
        });
        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();

                finish();
            }
        });
        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pessoa.setPrimeiroNome(edit_primeiro_nome.getText().toString());
                pessoa.setSobrenome(edit_sobrenome.getText().toString());
                pessoa.setCursoDesejado(edit_nome_do_curso.getText().toString());
                pessoa.setTelefoneContato(edit_telefone_contato.getText().toString());

                Toast.makeText(MainActivity.this, "SALVO" + pessoa.toString(), Toast.LENGTH_LONG).show();

                listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
                listaVip.putString("sobrenome", pessoa.getSobrenome());
                listaVip.putString("cursoDesejado", pessoa.getCursoDesejado());
                listaVip.putString("telefone", pessoa.getTelefoneContato());
                listaVip.apply();

                controller.salvar(pessoa);

            }
        });

        Log.i("POOAndroid", " Objeto pessoa:  " + pessoa.toString());

    }
}