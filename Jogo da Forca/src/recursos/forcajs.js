	//Classe Jogo
	function Jogo(){
		this.arrayFase = new Array(); 
	}
	
	//Classe Fase
	function Fase(){
		this.arrayPalavra = new Array();
		this.mensagem;
	}

	//Classe Palavra
	function Palavra(nome,dica,qtdMaxErro,tipoMultimidia,urlMultimidia,mensagemAoAcertar,mensagemAoErrar){
		this.nome=nome;
		this.dica=dica;
		this.qtdMaxErro=qtdMaxErro;
		this.tipoMultimidia=tipoMultimidia;
		this.urlMultimidia = urlMultimidia;
		this.mensagemAoAcertar = mensagemAoAcertar;
		this.mensagemAoErrar = mensagemAoErrar;
	}
	
	/*Variáveis Globais*/
	
	var jogo;
	var faseAtual;
	var objetoPalavra;	
	
	//Variáveis Globais que mudam a cada troca de palavra
	var palavraAtual;
	var qtdMaxErroAtual;	
	var mensagemAoAcertarPalavraAtual;
	var mensagemAoErrarPalavraAtual;
	var tipoMultimidiaAtual;
	var urlMultimidiaAtual;
	var dicaTextualAtual;
	
	//Variáveis globais para controlar o boneco que indica o andamento do usuário. Mudam a cada palavra
	var fatorIncremento;
	var mudarBoneco;
	var auxiliaURLBoneco = 0;
	
	var palavraAuxiliar = new Array();
	var input="";	
	var erros = 0;
	var acertos = 0;
	var erro=0;
	var contadorDeFase=0;
	var contadorDePalavra=0;
	var recuperaDiv;
	setaJogo();	
	var qtdFases = jogo.arrayFase.length;
	var qtdPalavrasFaseAtual=0;
	
	function iniciar(){
		reset();
		atulizaTelaAcerto();
		input="";
		setaPalavra();		
		exibeEspacos();
		montaTeclado();
		atualizaDica();
	} //fim da função iniciar
	
	function exibeEspacos(){		
		for(var i =0;i<palavraAtual.length;i++){
			if(palavraAtual[i]==" "){
				input = input+"&nbsp &nbsp &nbsp" ;
			}else{
			input = input + "<input class='entrada' type=\"text\";\" class='palavra' maxlength=\"1\" size=\"1\" readonly value=\" \"> ";
			palavraAuxiliar[i] = " ";}
		}		
		var divMostraPalavra = document.getElementById("divMostraPalavra");
		divMostraPalavra.innerHTML = input;		
	}
	
	function montaTeclado(){
		var teclado="";
		teclado = teclado + "</br></br>";
		teclado = teclado +"<table id=\"tecladao\" class=\"teclado\" >";
		teclado = teclado +" <tr> <form name=f action=# onsubmit='return false;'>";
		var linha=0;
		for(i=65; i < 91; i++){					
			if(linha == 7) {
				linha=0;
			teclado = teclado + "</tr><tr>";
			}
						
			teclado = teclado + "<td class='fundo-tecla'>";			
			teclado = teclado + "<input  class='tecla'  type=submit id='" + String.fromCharCode(i)+"'  onclick=\"verificaErro('" + String.fromCharCode(i);
			teclado = teclado +"');\" value=" + String.fromCharCode(i) + " ></td>";
			linha++;
		}
		teclado = teclado +"</tr></form></table>";
		var recuperaDivTeclado = document.getElementById("divTeclado");
		recuperaDivTeclado.innerHTML = teclado;
	}
	
	function setaPalavra(){		
		
		if(qtdFases > contadorDeFase){
			faseAtual = jogo.arrayFase[contadorDeFase];			
			var qtdPalavras = faseAtual.arrayPalavra.length;
			
			if(qtdPalavras > contadorDePalavra){			
				objetoPalavra = faseAtual.arrayPalavra[contadorDePalavra];
				palavraAtual = objetoPalavra.nome;
				dicaTextualAtual = objetoPalavra.dica;
				urlMultimidiaAtual = objetoPalavra.urlMultimidia;
				qtdMaxErroAtual = objetoPalavra.qtdMaxErro;
				tipoMultimidiaAtual = objetoPalavra.tipoMultimidia;	
				mensagemAoErrarPalavraAtual = objetoPalavra.mensagemAoErrar;
				mensagemAoAcertarPalavraAtual = objetoPalavra.mensagemAoAcertar;
				
				if(qtdMaxErroAtual%2!=0){
					fatorIncremento = (qtdMaxErroAtual+1)/3;
				}
				else{
					fatorIncremento = qtdMaxErroAtual/3;
				}
				mudarBoneco = fatorIncremento;				
				contadorDePalavra++;				
			} 
			else{	
				//passou de fase
				abreModal("<p align='center'>Palavra: "+palavraAtual.toUpperCase()+"</br>Passou de Fase.</p>");
				var fase = document.getElementById("fase");				
				contadorDePalavra=0;
				contadorDeFase++;
				fase.innerHTML = "Fase "+(contadorDeFase+1);
				setaPalavra();				
			}		
			
		} else{
			alert("FIM DE JOGO!!!");
			window.location.reload();
		}
	}
	
	function verificaErro(letra){
		//stringChute = stringChute+" "+letra;
		//var chute = document.getElementById("chutadas");
		//chute.innerHTML = stringChute;
		var botao = document.getElementById(letra);
		botao.style.display='none';
		var string ="";
		var acertou = false;
		for (var i = 0; i< palavraAtual.length;i++){
			if(letra.toUpperCase() == palavraAtual[i].toUpperCase()){
				palavraAuxiliar[i] = letra;
				acertos++;
				acertou = true;				
			}			
		}		
		if(!acertou){			
			erros++;			
			if(erros>qtdMaxErroAtual){				
				abreModal("<p align ='center'>"+mensagemAoErrarPalavraAtual+"</p>");
				resetaPalavra();
			}
			else if(erros >= mudarBoneco){
				//MudarBoneco				
				var imgBoneco = document.getElementById("boneco");				
				auxiliaURLBoneco++;				
				imgBoneco.src="boneco/b"+auxiliaURLBoneco+".png";
				mudarBoneco = mudarBoneco + fatorIncremento;
				if(erros ==qtdMaxErroAtual){
					imgBoneco.src="boneco/b3.png";
				}
			}
		}		
		atulizaTelaAcerto();		
		for(i=0;i<palavraAtual.length;i++){
			if(palavraAtual[i]==" "){
				string = string +"<div></br></div> ";
			}else{
			string = string + "<input type=\"text\" class='entrada' maxlength=\"1\" size=\"1\" readonly value=" + palavraAuxiliar[i] + "> ";
			}
		}
		
		divMostraPalavra = document.getElementById("divMostraPalavra");
		divMostraPalavra.innerHTML = string; //Altera o conteúdo da Div de exibição da palavra.		
		
		if(acertos == palavraAtual.length){			
			botao.style.display='inline';
			abreModal("<p align='center'>Palavra: "+palavraAtual.toUpperCase()+"</br>"+mensagemAoAcertarPalavraAtual+"</p>");			
			iniciar();
		}
				
	}
	
	function atualizaDica(){		
		var dicaTextual = document.getElementById("dicaTextual");
		dicaTextual.innerHTML = "<align='center'>Dica: "+dicaTextualAtual+"</p>";		
		if(tipoMultimidiaAtual=='imagem'){				
			var dicaMultimidia = document.getElementById("dicaMultimidia");
			dicaMultimidia.innerHTML = "<img class='multimidia' src ="+urlMultimidiaAtual+" </img>";
		}
		else if(tipoMultimidiaAtual=='video'){
			var dicaMultimidia = document.getElementById("dicaMultimidia");
			dicaMultimidia.innerHTML = " <video class='video' controls > <source src="+urlMultimidiaAtual+"></source></video>";
		}
		else if(tipoMultimidiaAtual=='audio'){
			var dicaMultimidia = document.getElementById("dicaMultimidia");
			dicaMultimidia.innerHTML = "<br/> <audio class='audio' controls > <source src="+urlMultimidiaAtual+"></source></audio>";
		}
		else {
			var dicaMultimidia = document.getElementById("dicaMultimidia");
			dicaMultimidia.innerHTML = "<p></p>";
		}
	}

	function resetaPalavra(){		
		reset();
		montaTeclado();
		exibeEspacos();
			
	}
	
	function atulizaTelaAcerto(){		
		var recuperaAcertos = document.getElementById("acertos");
		recuperaAcertos.innerHTML = acertos; //Altera o conteúdo da Div de exibição da palavra.	
		var recuperaErros = document.getElementById("erros");
		recuperaErros.innerHTML = erros; //Altera o conteúdo da Div de exibição da palavra.	
	}		
	
	function reset(){		
		erros = 0;
		acertos = 0;
		document.getElementById("boneco").src="imagens/b0.png";
		auxiliaURLBoneco = 0;
		mudarBoneco = fatorIncremento;	
	}
	
	function abreModal(mensagemParaModal){				
		var modal = document.getElementById("modal");
		var mensagemModal = document.getElementById("mensagemModal");
		mensagemModal.innerHTML = mensagemParaModal;
		modal.style.opacity="1";
		modal.style.pointerEvents="auto";				
	}
			
	function fecharModal(){
		var modal = document.getElementById("modal");				
		modal.style.opacity="0";
		modal.style.pointerEvents="none";
	}
	
	function setaJogo(){	
		jogo = new Jogo();
		erros = 0, acertos = 0;		
		?fases	
	}
	
	