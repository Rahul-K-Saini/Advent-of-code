package main

import (
	"fmt"
	"sort"
)

func main() {
	arr1 := make([]int, 1000)
	arr2 := make([]int, 1000)
	fmt.Println("first list:")
	for i := 0; i < 1000; i++ {
		fmt.Scan(&arr1[i])
	}
	fmt.Println("second list:")
	for i := 0; i < 1000; i++ {
		fmt.Scan(&arr2[i])
	}

	fmt.Printf("Result: %d\n", findSimilarity(arr1, arr2))
	// fmt.Printf("Result: %d\n", dayone(arr1, arr2))
}

func findSimilarity(arr1 []int , arr2 []int) int{
	fmap := make(map[int]int)
	for _,val := range arr1 {
		fmap[val]++
	}
	ans := 0
	for _,val:=range arr2 {
		ans += fmap[val]*val
	}
	return ans
}

func dayone(arr1, arr2 []int) int {
	sort.Ints(arr1)
	sort.Ints(arr2)
	sum := 0
	for i := 0; i < len(arr2); i++ {
		diff := abs(arr1[i] - arr2[i])
		sum += diff
	}
	return sum
}

func abs(x int) int {
	if x < 0 {
		return -x
	}
	return x
}
