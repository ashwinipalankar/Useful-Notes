package com.ashwini.utility;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	List<Integer> getPrimeFactors (int Number) {
		List<Integer> factors = new ArrayList<>();
		while (Number%2 == 0) {
			Number/=2;
			factors.add(2);
		}
		
		return factors;
		
	}
}
