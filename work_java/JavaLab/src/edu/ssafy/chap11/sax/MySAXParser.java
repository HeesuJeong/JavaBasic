package edu.ssafy.chap11.sax;


import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySAXParser {
	ArrayList<Check> list;

	//check태그 정보 담을 클래스를 arraylist로 만든다.
	public ArrayList<Check> getContent(String url){
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			//event driven
			SAXParser parser = factory.newSAXParser();
			//핵심인 myhandler
			MyHandler handler = new MyHandler();
			//웹으로 접속->웹서버에 연결->인풋스트림가져온다(result.xml연다)->파싱한다
			//인자로 myhandler 
			parser.parse(new URL(url).openConnection().getInputStream(), handler);
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}
	//default handler의 주 기능 5가지
	//1.문서 시작 startDocument
	//2.문서 끝 endDocument
	public class MyHandler extends DefaultHandler{
		private StringBuilder sb;
		Check ch;
		
		//스타트태그, 엔드태그, 본문내용마다 매번 호출 됨
		@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			super.characters(ch, start, length);
			sb.append(ch, start, length);
		}
		//태그 끝날때 호출됨
		@Override
		public void endElement(String uri, String localName, String name)
				throws SAXException {
			super.endElement(uri, localName, name);
			if (this.ch != null){
				if (name.equalsIgnoreCase("Clean")){
					//태그 끝날 때 자동으로 호출되는 characters()에서 sb에 본문 내용을 저장한다.
					//저장된 sb를 setClean한다.
					ch.setClean(sb.toString().trim());
				} else if (name.equalsIgnoreCase("Ready")){
					ch.setReady(sb.toString().trim());
				} else if (name.equalsIgnoreCase("Response")){
					ch.setResponse(sb.toString().trim());
				} else if (name.equalsIgnoreCase("Request")){
					sb.trimToSize();
					if(sb.length()>0)
						ch.setRequest(sb.toString().trim());
				} else if (name.equalsIgnoreCase("Check")){
				     list.add(ch);
				     //앞에서 저장된 객체를 arraylist에 저장
				     //리스트에 check 태그 내용들이 모두 저장되어 있겠지~
				}
				sb.setLength(0);	//sb초기화 !
			}
		}
		//문서 끝날때 호출됨
		@Override
		public void endDocument() throws SAXException {
			// TODO Auto-generated method stub
			super.endDocument();
		}
		//문서 시작할 때 호출됨
		@Override
		public void startDocument() throws SAXException {
			super.startDocument();
			list = new ArrayList<Check>();
			sb = new StringBuilder();
		}
		//태그 시작시 호출됨
		@Override
		public void startElement(String uri, String localName, String name,
				Attributes attributes) throws SAXException {
			super.startElement(uri, localName, name, attributes);
			if (name.equalsIgnoreCase("Check")){
				//check로 시작한 태그가 있다면 
				//객체 하나 만들어서 코드와 날짜번호 저장한다.
				ch = new Check();
				ch.setCode(attributes.getValue(0));
				ch.setDate(attributes.getValue(1));
			}
	}
}
}