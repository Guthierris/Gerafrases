# GeraFrases
O programa tem como função gerar frases aleatórias pré-definidas armazenadas em um vetor.
Para funcionar o programa você precisa emular o codigo no android studio, e utilizar de um android connectado usb ou em ambiente virtual.
#
📱 Inteface: você deve criar um botão para utilizar o Onclick com a função (geraFrases), e um TextView om id = gerador.
#
Codigo Fonte:

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void geraFrases (View v){
        String vetFrases[] = {"Com grandes poderes vem grandes responsabilidades.",
                "Você não vai ser hackeado por gringos se utilizar (ç) nas senhas.",
                "Passe para frente tudo aquilo que você aprendeu.",
                "Para todo game over existe um play again.",
                "Aquilo que não me mata me da XP.",
                "I Am Groot."
        };

        int numero = new Random().nextInt(6);
        TextView texto = findViewById(R.id.gerador);
        texto.setText(vetFrases[numero]);
    }

