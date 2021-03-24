package com.calculadora.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button numeroZero,numeroUm,numeroDois,numeroTres,numeroQuatro,numeroCinco,numeroSeis,numeroSete,numeroOito,
    numeroNove,ponto,soma,Subtracao,Multiplicacao,Divisao,Igual,botaoLimpar;

    private TextView txtExpressao,txtResultado;
    private ImageView backspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniciarComponentes();
getSupportActionBar().hide();

numeroZero.setOnClickListener(this);
numeroUm.setOnClickListener(this);
numeroDois.setOnClickListener(this);
numeroTres.setOnClickListener(this);
numeroQuatro.setOnClickListener(this);
numeroCinco.setOnClickListener(this);
numeroSeis.setOnClickListener(this);
numeroSete.setOnClickListener(this);
numeroOito.setOnClickListener(this);
numeroNove.setOnClickListener(this);
ponto.setOnClickListener(this);
soma.setOnClickListener(this);
Subtracao.setOnClickListener(this);
Multiplicacao.setOnClickListener(this);
Divisao.setOnClickListener(this);

    botaoLimpar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtExpressao.setText("");
            txtResultado.setText("");
        }
    });
    }

    @SuppressLint("WrongViewCast")
    private void IniciarComponentes(){
        numeroZero = findViewById(R.id.numero_zero);
        numeroUm = findViewById(R.id.numero_um);
        numeroQuatro= findViewById(R.id.numero_quatro);
        numeroCinco= findViewById(R.id.numero_cinco);
        numeroSeis= findViewById(R.id.numero_seis);
        numeroSete= findViewById(R.id.numero_sete);
        numeroOito= findViewById(R.id.numero_oito);
        numeroNove= findViewById(R.id.numero_nove);
        ponto= findViewById(R.id.ponto);
        soma= findViewById(R.id.soma);
        Subtracao=findViewById(R.id.subtracao);
        Multiplicacao=findViewById(R.id.multiplicacao);
        Divisao=findViewById(R.id.divisao);
        Igual=findViewById(R.id.igual);
        botaoLimpar=findViewById(R.id.limpar);
        txtExpressao=findViewById(R.id.expressao);
        txtResultado=findViewById(R.id.resultado);
        backspace=findViewById(R.id.backspace);

    }

public void AcrecentarUmaExpressao(String string,boolean limpar_dados){

        if (txtResultado.getText().equals("")){
            txtExpressao.setText("");


        }
if (limpar_dados){
txtResultado.setText("");
txtExpressao.append(string);
}else{
    txtExpressao.append(txtResultado.getText());
    txtExpressao.append(string);
    txtResultado.setText("");
}
}

    @Override
    public void onClick(View view) {
switch (view.getId()){
    case R.id.numero_zero:
        AcrecentarUmaExpressao("0",true);
        break;
    case R.id.numero_um:
        AcrecentarUmaExpressao("1",true);
        break;

    case R.id.numero_dois:
        AcrecentarUmaExpressao("2",true);
        break;
    case R.id.numero_tres:
        AcrecentarUmaExpressao("3",true);
        break;
    case R.id.numero_quatro:
        AcrecentarUmaExpressao("4",true);
        break;
    case R.id.numero_cinco:
        AcrecentarUmaExpressao("5",true);
        break;
    case R.id.numero_seis:
        AcrecentarUmaExpressao("6",true);
        break;
    case R.id.numero_sete:
        AcrecentarUmaExpressao("7",true);
        break;
    case R.id.numero_oito:
        AcrecentarUmaExpressao("8",true);
        break;
    case R.id.numero_nove:
        AcrecentarUmaExpressao("9",true);
        break;
    case R.id.ponto:
        AcrecentarUmaExpressao(".",true);
        break;
    case R.id.soma:
        AcrecentarUmaExpressao("+",false);
        break;
    case R.id.subtracao:
        AcrecentarUmaExpressao("-",false);
        break;
    case R.id.multiplicacao:
        AcrecentarUmaExpressao("*",false);
        break;
    case R.id.divisao:
        AcrecentarUmaExpressao("/",false);
        break;
}
    }
}