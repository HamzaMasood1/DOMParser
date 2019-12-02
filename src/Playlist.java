import java.util.ArrayList;

public class Playlist {
	int id;
	String name;
	ArrayList<Track> tracks=new ArrayList<>();
	
	
	public Playlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Playlist(int id, String name, ArrayList<Track> tracks) {
		super();
		this.id = id;
		this.name = name;
		this.tracks = tracks;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Track> getTracks() {
		return tracks;
	}
	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}

	@Override
	public String toString() {
		return "Playlist [id=" + id + ", name=" + name + ", tracks=" + tracks + "]";
	}
	
}
