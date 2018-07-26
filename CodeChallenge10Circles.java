import java.util.ArrayList;

public class CodeChallenge10Circles {
	// Stan & Anesha
	public static void main(String[] args) {
		ArrayList<Circle> circles = new ArrayList<>();

		Circle circle1 = new Circle(13.14);
		Circle circle2 = new Circle(10.72);
		Circle circle3 = new Circle(60.00);

		circles.add(circle1);
		circles.add(circle2);
		circles.add(circle3);
		double smallestArea = Double.MAX_VALUE;
		double largestArea = 0.0;
		for (int i = 0; i < circles.size(); i++) {
			circles.get(i);

			double tempArea = circles.get(i).getArea();
			if (largestArea < tempArea) {
				largestArea = tempArea;
			
			}
			 smallestArea = Double.MAX_VALUE;
			for (int j = 0; j < circles.size(); j++) {
				circles.get(i);

				tempArea = circles.get(j).getArea();
				if (smallestArea > tempArea) {
					smallestArea = tempArea;
				}
			}
		}
	System.out.println(largestArea);
	System.out.println(smallestArea);

	}
}
