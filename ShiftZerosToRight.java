// Shift all the zeros in an array to the right, inline 
// example 
// input :  [12,0,0,4,6,3,25,0,1]
// output : [12,4,6,3,25,1,0,0,0] 

public int[] shiftZerosToRight(int[] a) {
		int i = 0, j = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[j] = a[i];
				j++;
			}
		}
    //Get the remaing zeros added to the end of the array. 
		while (j < i) {
			a[j] = 0;
			j++;
		}
		return a;
	}
