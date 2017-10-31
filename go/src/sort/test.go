package sort

import (
	"testing"
)

func TestbubbleSort(t *testing.T) {
	testSort(t, bubbleSort, 16384)
}

func BenchmarkbubbleSortRandom(b *testing.B) {
	benchmakeSortRandom(b, bubbleSort, 4096)
}

func BenchmarkbubbleSortBestCase(b *testing.B) {
	benchmarkSortSorted(b, bubbleSort, 4096)
}

func BenchmarkbubbleSortWorstCase(b *testing.B) {
	benchmarkSortReverseSorted(b, bubbleSort, 4096)
}
