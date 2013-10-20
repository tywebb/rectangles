package mfilosa.exec;

import mfilosa.shapes.mfilosaRectangle;

public class RectangleExec {
	
	public static void main(String[] args) {

		mfilosaRectangle rectangleA = new mfilosaRectangle(0, 0, 10, 10);
		mfilosaRectangle rectangleB = new mfilosaRectangle(5, 5, 10, 9);

		// Example 1

		System.out.println("--------------- Example 1: -------------- ");
		System.out.println("Intersecting example");
		System.out.println("rectangle A: " + rectangleA);
		System.out.println("rectangle B: " + rectangleB);
		System.out.println("--------------------------------------------- \n");		
		
		generateTest(rectangleA,rectangleB);
		
		// Example 2

		System.out.println("\n--------------- Example 2: -------------- ");
		System.out.println("Containment example");
		System.out.println("rectangle A: " + rectangleA);
		System.out.println("rectangle B: " + rectangleB);
		System.out.println("--------------------------------------------- \n");		
		
		rectangleA = new mfilosaRectangle(0, 0, 20, 20);
		rectangleB = new mfilosaRectangle(5, 5, 10, 10);
		
		generateTest(rectangleA,rectangleB);
		
		// Example 3

		System.out.println(" \n--------------- Example 3: -------------- ");
		System.out.println("Adjacent Example ");
		System.out.println("rectangle A: " + rectangleA);
		System.out.println("rectangle B: " + rectangleB);
		System.out.println("--------------------------------------------- \n");		
		
		rectangleA = new mfilosaRectangle(10, 0, 9, 9);
		rectangleB = new mfilosaRectangle(0, 0, 10, 9);
		
		generateTest(rectangleA,rectangleB);
		
	}	

	private static void generateTest(mfilosaRectangle rectangleA, mfilosaRectangle rectangleB) {	
				
				System.out.println("Rectangle A contains Rectangle B ? : "
						+ rectangleA.contains(rectangleB));

				System.out.println("Rectangle A is adjacent to Rectangle B ? : "
						+ rectangleA.adjecent(rectangleB));
				
				if (!rectangleA.contains(rectangleB)) {

					System.out.println("Rectangle A intersects Rectangle B ? : "
							+ rectangleA.intersects(rectangleB));

					if (rectangleA.intersects(rectangleB)) {

						System.out.println(" The intersecting rectangle is: "
								+ rectangleA.intersection(rectangleB));

						System.out.println(" The intersection points are :");

						if (rectangleA.x > rectangleB.x) {

							System.out
									.println("  X, Y : "
											+ (rectangleA.intersection(rectangleB).x + rectangleA
													.intersection(rectangleB).width)
											+ ","
											+ rectangleA.intersection(rectangleB).y);
							System.out
									.println("  X, Y : "
											+ (rectangleA.intersection(rectangleB).x
													+ "," + (rectangleA
													.intersection(rectangleB).y + rectangleA
													.intersection(rectangleB).height)));
						} else {
							System.out.println("  X, Y : "
									+ rectangleA.intersection(rectangleB).x + ","
									+ rectangleA.intersection(rectangleB).y);
							System.out
									.println("  X, Y : "
											+ (rectangleA.intersection(rectangleB).x + rectangleA
													.intersection(rectangleB).width)
											+ ","
											+ (rectangleA.intersection(rectangleB).y + rectangleA
													.intersection(rectangleB).height));
						}

					}

				}		
				
			}
		

}
