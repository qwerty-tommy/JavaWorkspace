package song13;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	Scanner keyin = new Scanner(System.in);
	List<Song> songs = new ArrayList<>();
	void mymain() {
		readSongs("songs.txt");
		//songs.stream().forEach(Song::print);  // this¸¦ ½ºÆ®¸²ÀÇ ¿ä¼Ò
		readUsers("users.txt");
		//users.stream().forEach(User::print);  // this¸¦ ½ºÆ®¸²ÀÇ ¿ä¼Ò

//		System.out.println("Á¦¸ñ ¼øÀ¸·Î Á¤·Ä (20°³¸¸):");		
//		Collections.sort(songs, (x, y) -> x.songTitle.compareTo(y.songTitle));  
//		// FunctionalInterface¿¡ ÀÇÇØ¼­ ¶÷´Ù°¡ ÀÎÅÍÆäÀÌ½º °´Ã¼·Î Àü´ÞµÈ´Ù
//		songs.stream()
//			.map(x->x.songTitle)
//			.limit(20)
//			.forEach(System.out::println);
//		System.out.println("\n\n3È¸ ÀÌ»ó µîÀåÇÑ °¡¼ö:");
//		Map<String, Long> singerCnt
//	 		= songs.stream()
//	 			.collect(
//	 				Collectors.groupingBy(o->o.name, 
//	 							Collectors.counting()));
//		String result = singerCnt.entrySet().stream()
//			.filter(x -> x.getValue() > 2)
//			//.forEach(x -> System.out.printf("%s(%dÈ¸)\n", x.getKey(), x.getValue()));
//			.map(x -> x.getKey())
//			.collect(Collectors.joining(", "));
//		System.out.println(result);
//		
		String kwd;
		List<Song> result = null;
		while (true) {
			System.out.print("=> ");
			kwd = keyin.next();
			result = findAll(kwd);
			result.stream()
				.map(x->x.name)
				//.distinct()
				.limit(10)
				.forEach(System.out::println);
		}
	}
	List<Song> findAll(String kwd) {
		return songs.stream()
			.filter(x -> x.matches(kwd))
			.collect(Collectors.toList());
	}
	public void readSongs(String filename) {
		Song m = null;
		Scanner filein = openFile(filename);
		while (filein.hasNext()) {
		    m = new Song();
			m.read(filein);
			songs.add(m);
		}
		filein.close();
	}
	ArrayList<User> users = new ArrayList<>();
	void readUsers(String filename) {
		Scanner filein = openFile(filename);
		User m = null;
		while (filein.hasNext()) {
		    m = new User();
			m.read(filein, this);
			users.add(m);
		}
		filein.close();
	}
	Song findSong(int n) {
		return songs.get(n-1);
	}
	public Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (Exception e) {
			System.out.println(filename + ": ÆÄÀÏ ¾øÀ½");
			System.exit(0);
		}
		return filein;
	}
	public static void main(String[] args) {
		Main a = new Main();
		a.mymain();
	}
}
