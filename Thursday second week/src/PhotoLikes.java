
public class PhotoLikes {

	public static void main(String[] args) {
		int returnLikes = like(0,"cool!", true);
		like(returnLikes,"Nice", true);
	}

	public static int like(int currentLikes, String comment, boolean liked ) {
		System.out.println("Feedback: " + comment);
		if (liked) {
			currentLikes++;
		}
		System.out.println("The photo has " + currentLikes + " likes");
		return currentLikes;
	}
}
