// array

// To Code : 5 min
// Execution : 6 ms

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

		if (carType == 1 && big-- > 0)
			return true;
		else if (carType == 2 && medium-- > 0)
			return true;
		else if (carType == 3 && small-- > 0) // (small-- > 0) .... incorrect
			return true;

		return false;
	}
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */