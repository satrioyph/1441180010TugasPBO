//nama kelas circle.java
class circle{
	//variabel radius dan color
	//radius = double
	//color = string 
		private double radius;
		private String color;
	//konstruktor untuk class circle?
	//karena nama kelas sama dengan nama fungsi

		public circle(){
			radius=1.0;
			color="pink";
		}
//nambah konstruktor

		public circle(double r, String c){
			radius=r;
			color=c;
		}

		public double getRadius(){
			return radius;
		}

		public String getColor(){
			return color;
		}

		public double getArea(){
			return(radius*radius*Math.PI);
		}

		// setter for color
		public void setColor(String c) {
			 color = c;
		}

		// setter for radius
		public void setRadius(double r) {
			 radius = r;
		}

	
}