package songPlay_List;

public class Play_List {
	
	public static void main(String[]args) {
		User_List user = new User_List("Please Play The Songs");
		user.playSong(new Song_List("BTS : Butter"));
		user.playSong(new Song_List("Ive : I am"));
		user.playSong(new Song_List("Twice : Fancy"));
		user.playSong(new Song_List("BlackPink : Wistle"));
		user.playSong(new Song_List("Aespa : Black Mamba"));
		user.playSong(new Song_List("Justin : Anyone"));
		user.displaySongs();
	}

}
