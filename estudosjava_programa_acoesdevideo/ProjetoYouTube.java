package estudosjava_programa_acoesdevideo;

// programa de ações de vídeo, usando interface, sobrecarga, construtor, encapsulamento... - criado com prof.Guanabara

public class ProjetoYouTube {

	public static void main(String[] args) {

		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO"); // chamo o construtor
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");

		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, "M", "juba"); // informar o que tem no construtor(nome, idade, sexo, login)
		g[1] = new Gafanhoto("Cleusa", 53, "F", "cleusinha");

//atributo espectador e filme são instâncias de classes neste caso = agregação

		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[2]);// Jubileu assiste HTML5
		vis[0].avaliar();
		System.out.println(vis[0].toString());

		vis[1] = new Visualizacao(g[0], v[1]);// Jubileu assiste PHP
		vis[0].avaliar(87.0f);
		System.out.println(vis[1].toString());

//		System.out.println(v[0].toString());//vou transformar v[0] em uma String
//		System.out.println(g[0].toString()); //se não tivesse o construtor no Gafanhoto, retornaria "Pessoa" no console, pq todo gafanhoto é PESSOA, é herança 
//		
	}
}
