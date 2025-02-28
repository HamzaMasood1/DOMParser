

public class Track {
	private int id;
	private String name;
	private String artist;
	private String album;
	private String genre;
	private int time;
	public Track() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Track(int id, String name, String artist, String album, String genre, int time) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.genre = genre;
		this.time = time;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @return the album
	 */
	public String getAlbum() {
		return album;
	}
	/**
	 * @param album the album to set
	 */
	public void setAlbum(String album) {
		this.album = album;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Track [id=" + id + ", name=" + name + ", artist=" + artist + ", album=" + album + ", genre=" + genre
				+ ", time=" + time + "]\n";
	}
	
	
}
