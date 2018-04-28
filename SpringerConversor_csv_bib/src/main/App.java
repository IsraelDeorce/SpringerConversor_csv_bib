package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * FREE App that converts a Springer CSV file to a BIB format
 * 
 * @author Israel Deorce
 * @email israel.idvj@gmail.com
 *
 */
public class App {

	private static List<Article> artigos = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			carregaDados("tive que fazer assim-alteraPainelDeControleBarrinha; Salva excel e csv.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro na leitura do primeiro arquivo");
		}
		try {
			escreveDados("Springer.bib");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro na leitura do segundo arquivo");
		}

	}

	public static void carregaDados(String arquivo) throws IOException {
		Path path1 = Paths.get(arquivo);
		try (Scanner sc = new Scanner(Files.newBufferedReader(path1, Charset.forName("utf8")))) {
			sc.useDelimiter("[|\n]"); // separadores: ; e nova linha
			String header = sc.nextLine(); // pula cabecalho
			System.out.println(header);
			String author, title, journal, year, volume, number, doi, url, abstrac;
			String bookseries, contentType; // pular na leitura

			while (sc.hasNext()) {
				title = sc.next();
				journal = sc.next();
				bookseries = sc.next();
				volume = sc.next();
				number = sc.next();
				doi = sc.next();
				author = sc.next();
				year = sc.next();
				url = sc.next();
				abstrac = url;
				if (sc.hasNext())
					contentType = sc.next();
				artigos.add(new Article(title, journal, volume, number, doi, author, year, url, abstrac));
			}
			System.out.println(artigos);
			System.out.println(artigos.size());
		}
	}

	public static void escreveDados(String arquivo) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter(arquivo, "UTF-8");
		for (Article a : artigos) {
			writer.println(a.toString());
		}
	}
}
