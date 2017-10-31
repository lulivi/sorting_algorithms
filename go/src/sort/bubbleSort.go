package sort

func bubbleSort(arr []int) {
	for i := 0; i < len(arr)-1; i++ {
		c := false
		for j := len(arr) - 1; j > i; j-- {
			if arr[j] < a[j-1] {
				x := arr[j]
				arr[j] = a[j-1]
				arr[j-1] = x
				c = true
			}
		}

		if !c {
			break
		}
	}
}
