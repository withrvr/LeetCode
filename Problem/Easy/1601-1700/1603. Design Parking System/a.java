// switch

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
		switch (carType) {
			case 1: // big
				if (big-- > 0)
					return true;
				break;

			case 2: // medium
				if (medium-- > 0)
					return true;
				break;

			case 3: // small
				if (small-- > 0)
					return true;
				break;

			default:
				System.out.println("incorrct number");
				break;
		}

		return false;
	}
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */