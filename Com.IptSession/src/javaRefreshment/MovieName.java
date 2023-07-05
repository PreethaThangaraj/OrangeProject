package javaRefreshment;

public class MovieName {
	private String MovieName;
	private String Price;
	private String Time;
	
	public MovieName(String MovieName,String Price,String Time) {
		this.MovieName=MovieName;
		this.Price=Price;
		this.Time=Time;
	}

	@Override
	public String toString() {
		return "MovieName=" + MovieName + ", Price=" + Price + ", Time=" + Time + "";
	}

	

}
