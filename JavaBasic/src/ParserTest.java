interface Parseable{
	//구문작업을 수행
	public abstract void parse(String fileName);
}
class ParserManager{
	//리턴타입이 Parseable인터페이스
	public static Parseable getParser(String type) {
		if(type.contentEquals("XML")){
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + "- HTML parsing completed.");
	}
}

class ParserTest {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("doucument.html");

	}

}
