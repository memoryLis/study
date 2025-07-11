package com.exercise.suanfa;

/**
 * ClassName: QuickSort
 * Package: com.exercise.sort
 * Description:
 *
 * @Author liang
 * @Create 2025/6/24 22:49
 * @Version jdk17.0
 */
public class QuickSort {
    public int[] sortArray(int[] nums) {
        int head = 0;
        int tail = nums.length - 1;
        sortQuick(head, tail, nums);
        return nums;


    }

    private void sortQuick(int head, int tail, int[] nums) {
        if (head < tail) {
            // 获取分区位置
            int middle = partition(head, tail, nums);
            sortQuick(head, middle - 1, nums);
            sortQuick(middle + 1, tail, nums);

        }


    }

    private int partition(int head, int tail, int[] nums) {
        // 三数取中法选择基准值 //选择笔记好的基值，减少递归深度
        int mid = head + (tail - head) / 2;
        if (nums[head] > nums[mid]) swap(nums, head, mid);
        if (nums[head] > nums[tail]) swap(nums, head, tail);
        if (nums[mid] > nums[tail]) swap(nums, mid, tail);

        // 将中间值交换到头部作为基准值
        swap(nums, head, mid);
        // 获取首元素为基准元素
        int pivot = nums[head];
        while (head < tail) {
            while (head < tail) {
                if (nums[tail] < pivot) {
                    int temp = nums[tail];
                    nums[tail] = nums[head];
                    nums[head] = temp;
                    head++;
                    break;
                }
                tail--;
            }
            while (head < tail) {
                if (nums[head] > pivot) {
                    int temp = nums[tail];
                    nums[tail] = nums[head];
                    nums[head] = temp;
                    tail--;
                    break;
                }
                head++;
            }
        }
        nums[head] = pivot;
        return head;
    }


    // 交换数组中两个元素的位置
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] nums = {110, 100, 0};
        quickSort.sortArray(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
