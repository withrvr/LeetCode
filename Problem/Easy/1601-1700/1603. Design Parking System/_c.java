// array

// To Code : 5 min
// Execution : 8 ms

// Time complexity: O(n)
// Space complexity: O(1)

class ParkingSystem {
	int big, medium, small;

	public ParkingSystem(int big, int medium, int small) {
		this.big = big;
		this.medium = medium;
		this.small = small;
	}

	public boolean addCar(int carType) {

		return (carType == 1 && big-- > 0) ||
				(carType == 2 && medium-- > 0) ||
				(carType == 3 && small-- > 0);
	}
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */