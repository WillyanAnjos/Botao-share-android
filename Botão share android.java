Intent sendIntent = new Intent();
	sendIntent.setAction(Intent.ACTION_SEND);
	//Define os dados
	String mensagem = "Mensagem ou dados que queira passar";
        //Passa os dados pela tela
	sendIntent.putExtra(Intent.EXTRA_TEXT, mensagem);
        //Define o tipo
	sendIntent.setType("text/plain");
	//chama a tela
        startActivity(sendIntent);