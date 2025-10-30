function isPerfectSquare(num) {

	if (num < 0) {
		return false;
		}

	if (num === 0) {
	return true;
	}

	const sqrt = Math.sqrt(num);
		return sqrt === Math.floor(sqrt);
	}


