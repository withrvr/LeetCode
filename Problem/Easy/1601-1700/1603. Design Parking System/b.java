// array

// To Code : 5 min
// Execution : 7 ms

// Time complexity: O(n)
// Space complexity: O(1)

class ParkingSystem {

	int[] slots = new int[3];

	public ParkingSystem(int big, int medium, int small) {
		this.slots[0] = big;
		this.slots[1] = medium;
		this.slots[2] = small;
	}

	public boolean addCar(int carType) {
		if (this.slots[carType - 1]-- > 0)
			return true;

		return false;
	}
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */