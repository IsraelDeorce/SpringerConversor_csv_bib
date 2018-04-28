package main;

public class Article {

	private String title;
	private String journal;	
	//ignorei bookSeriesTitle
	private String volume;
	private String number;
	private String doi;
	private String author;
	private String year;
	private String url;
	private String abstrac; //usei o url para o abstract
	//ignorei contentType
	
	public Article(){		
	}
	
	public Article(String title, String journal, String volume, String number, String doi, String author, String year,
			String url, String abstrac) {
		super();
		this.title = title;
		this.journal = journal;
		this.volume = volume;
		this.number = number;
		this.doi = doi;
		this.author = author;
		this.year = year;
		this.url = url;
		this.abstrac = abstrac;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getJournal() {
		return journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getAbstrac() {
		return abstrac;
	}

	public void setAbstrac(String abstrac) {
		this.abstrac = abstrac;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("@article{\n");
		str.append("author = {"+author+"}\n");
		str.append("title = {"+title+"}\n");
		str.append("journal = {"+journal+"}\n");
		str.append("year = {"+year+"}\n");
		str.append("volume = {"+volume+"}\n");
		str.append("number = {"+number+"}\n");
		str.append("doi = {"+doi+"}\n");
		str.append("url = {"+url+"}\n");
		str.append("abstract = {"+abstrac+"}\n");
		str.append("}\n");
		
		return str.toString();
	}

}
