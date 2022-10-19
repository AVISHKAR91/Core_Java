package arrayList;


	public class Movie {
		
		String Movie_name;
		float Movie_dur;
		String Movie_actor;
		
		public Movie() {
			
		}

		public Movie(String movie_name, float movie_dur, String movie_actor) {
			super();
			Movie_name = movie_name;
			Movie_dur = movie_dur;
			Movie_actor = movie_actor;
			
		}

		public void print() {
			// TODO Auto-generated method stub
			
			System.out.println("Movie Name: " + Movie_name);
			System.out.println("Movie Duration:" + Movie_dur);
			System.out.println("Movie Actor :"+ Movie_actor);
		}

		@Override
		public String toString() {
			return "Movie [Movie_name=" + Movie_name + ", Movie_dur=" + Movie_dur + ", Movie_actor=" + Movie_actor
					+ "]";
		}
	}

