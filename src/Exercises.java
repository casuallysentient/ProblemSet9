import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}

		if (a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1)) {
			return true;
		}

		return false;	// default return value to ensure compilation
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		if (values == null || values.size() < n || n <= 0) {
			return new ArrayList<String>();
		}

		ArrayList<String> newString = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			newString.add(i, values.get(i));
		}

		int index = n;
		for (int i = values.size() - n; i < values.size(); i++) {
			newString.add(index, values.get(i));
			index++;
		}

		return newString;
	}

	public int difference(ArrayList<Integer> numbers) {
		if (numbers != null && numbers.size() >= 1) {
			int maxValue = numbers.get(0);
			int minValue = numbers.get(0);
			for (int i = 0; i < numbers.size(); i++) {
				if (i == 0) {
					minValue = numbers.get(i);
					maxValue = numbers.get(i);
				}
				if (maxValue < numbers.get(i)) {
					maxValue = numbers.get(i);
				}
				if (minValue > numbers.get(i)) {
					minValue = numbers.get(i);
				}
			}
			int differenceOfValues = maxValue - minValue;
			return differenceOfValues;
		}

		return -1;		// default return value to ensure compilation
	}

	public double biggest(ArrayList<Double> numbers) {
		if (numbers != null && numbers.size() >= 3 && numbers.size() % 2 == 1) {
			boolean allPositive = true;
			for (int i = 0; i < numbers.size(); i++) {
				if (numbers.get(i) < 0) {
					allPositive = false;
				}
			}
			if (allPositive == true) {
				double firstValue = numbers.get(0);
				double lastValue = numbers.get(numbers.size() - 1);
				int middleIndex = (int) Math.floor(numbers.size() / 2);
				double middleValue = numbers.get(middleIndex);
				double biggestValue = firstValue;
				if (firstValue >= middleValue && firstValue >= lastValue) {
					biggestValue = firstValue;
				} else if (middleValue >= firstValue && middleValue >= lastValue) {
					biggestValue = middleValue;
				} else if (lastValue >= firstValue && lastValue >= middleValue) {
					biggestValue = lastValue;
				}
				return biggestValue;
			}
		}

		return -1;		// default return value to ensure compilation
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		if (values == null || values.size() < 3 || values.size() % 2 == 0) {
			return new ArrayList<String>();
		}

		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) == null) {
				return new ArrayList<String>();
			}
		}

		int middleIndex = (int)(Math.ceil(values.size() / 2));
		ArrayList<String> returnString = new ArrayList<String>();
		returnString.add(values.get(middleIndex - 1));
		returnString.add(values.get(middleIndex));
		returnString.add(values.get(middleIndex + 1));
		return returnString;
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		int counter = 0;
		int number = -1;
		for (int i = 0; i < numbers.size(); i++) {
			if (i == 0) {
				counter = 1;
				number = numbers.get(i);
			}

			if (numbers.get(i) == number + 1) {
				counter += 1;
				number = numbers.get(i);
			} else {
				counter = 1;
				number = numbers.get(i);
			}

			if (counter == 3) {
				return true;
			}
		}

		return false;
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		if (numbers == null || numbers.size() < 1) {
			return false;
		}

		boolean previousInstance = false;
		int space = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == x) {
				previousInstance = true;
				space = 0;
			} else {
				if (i == 1 && previousInstance == false) {
					return false;
				} else if (previousInstance == false) {
					space++;
				}
				previousInstance = false;
			}

			if (space == 2) {
				return false;
			}
		}

		return true;
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		int remainder = -1;
		int prevRemainder = -1;
		int inARow = 0;
		for (int i = 0; i < numbers.size(); i++) {
			remainder = numbers.get(i) % 2;
			if (remainder == 1) {
				if (prevRemainder == 1) {
					inARow++;
				} else {
					inARow = 1;
				}
			} else {
				if (prevRemainder == 0) {
					inARow++;
				} else {
					inARow = 1;
				}
			}

			if (inARow == 3) {
				return true;
			}

			prevRemainder = remainder;
		}

		return false;
	}

	public boolean balance(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 2) {
			return false;
		}

		for (int i = 0; i < numbers.size() - 1; i++) {
			int xSum = 0;
			int ySum = 0;

			for (int x = i; x >= 0; x--) {
				xSum += numbers.get(x);
			}

			for (int y = i + 1; y < numbers.size(); y++) {
				ySum += numbers.get(y);
			}

			if (xSum == ySum) {
				return true;
			}
		}

		return false;
	}

	public int clumps(ArrayList<String> values) {
		if (values == null) {
			return -1;
		}
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) == null) {
				return -1;
			}
		}

		boolean isSame = false;
		boolean previousSame = false;
		String previous = "";
		int numClumps = 0;

		for (int i = 0; i < values.size(); i++) {
			if (previous.equals(values.get(i))) {
				isSame = true;
				if (previousSame != true) {
					numClumps++;
				}
			} else {
				isSame = false;
			}
			previous = values.get(i);
			previousSame = isSame;
		}

		return numClumps;
	}
}

//hey mr. wilson
