
	package ManytoMany;
	import java.util.List;


	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToMany;

	@Entity
	public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String genre;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Actor> actor;
	public Movie(String name, String genre) {
		super();
		this.name = name;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", genre=" + genre + ", actor=" + actor + "]";
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public List<Actor> getActor() {
		return actor;
	}
	public void setActor(List<Actor> actor) {
		this.actor = actor;
	}
	public Movie() {
		super();
	}


	}


