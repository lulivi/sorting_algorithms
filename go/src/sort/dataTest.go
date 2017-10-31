package sort

import (
	"math/rand"
	"testing"
	"time"
)

func testSort(t *testing.T, fn func([]int), n int) {
	a := getRandomArray(n)
	fn(a)
	testSortedArray(t, a)
}

func testSortedArray(t *testing.T, a []int) {
	// TODO: test that the expected values are all present
	for i := 1; i < len(a); i++ {
		if a[i] < a[i-1] {
			t.Fatalf("Value at offset %v/%v is less than the value at offset %v", i, len(a), i-1)
		}
	}
}

func getRandomArray(n int) []int {
	rand.Seed(time.Now().UnixNano())
	a := make([]int, n)
	for i := 0; i < len(a); i++ {
		a[i] = rand.Int()
	}

	return a
}

func benchmakeSortRandom(b *testing.B, fn func([]int), n int) {
	v := getRandomArray(n)

	for i := 0; i < b.N; i++ {
		a := make([]int, len(v))
		copy(a, v)

		fn(a)
	}
}

func benchmarkSortSorted(b *testing.B, fn func([]int), n int) {
	a := make([]int, n)
	for i := 0; i < len(a); i++ {
		a[i] = i
	}

	for i := 0; i < b.N; i++ {
		fn(a)
	}
}

func benchmarkSortReverseSorted(b *testing.B, fn func([]int), n int) {
	v := make([]int, n)
	for i := 0; i < len(v); i++ {
		v[i] = len(v) - i
	}

	for i := 0; i < b.N; i++ {
		a := make([]int, len(v))
		copy(a, v)
		fn(a)
	}
}
