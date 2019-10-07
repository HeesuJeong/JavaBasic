package edu.ssafy.chap08;

import java.io.File;

public class FileInfo {

	//.java 우클릭 > Run As>RunConfiguration>arguments에 input.txt
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("using : java fileInfo input filename plz");
			System.exit(0);
		}
		System.out.println(args[0]);
		File f=new File(args[0]);
		if(f.exists()) {
			System.out.println("파일 이름: "+f.getName());
			System.out.println("파일 경로: "+f.getPath());
			System.out.println("전체 경로: "+f.getAbsolutePath());
			System.out.println("읽기 여부: "+f.canRead());
			System.out.println("파일 길이: "+f.length());
		}else {
			System.out.println(args[0]+"파일은 존재하지 않습니다.");
		}
	}
}
