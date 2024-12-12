package week_two.day_four.src.questions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public  class MergeSort {

    public static <T extends Comparable<T>> List<T> sort(Collection<T> collection) {
        List<T> list = new ArrayList<>(collection);
        mergeSort(list, 0, list.size() - 1);
        return list;
    }


    public static <T> List<T> sort(Collection<T> collection, Comparator<T> comparator) {
        List<T> list = new ArrayList<>(collection);
        mergeSort(list, 0, list.size() - 1, comparator);
        return list;
    }


    private static <T extends Comparable<T>> void mergeSort(List<T> list, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(list, left, middle);  // Sort the left half
            mergeSort(list, middle + 1, right);  // Sort the right half
            merge(list, left, middle, right);  // Merge the two halves
        }
    }


    private static <T> void mergeSort(List<T> list, int left, int right, Comparator<T> comparator) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(list, left, middle, comparator);  // Sort the left half
            mergeSort(list, middle + 1, right, comparator);  // Sort the right half
            merge(list, left, middle, right, comparator);  // Merge the two halves
        }
    }


    public static <T extends Comparable<T>> void merge(List<T> list, int left, int middle, int right) {
        List<T> leftList = new ArrayList<>(list.subList(left, middle + 1));
        List<T> rightList = new ArrayList<>(list.subList(middle + 1, right + 1));

        int i = 0, j = 0, k = left;
        while (i < leftList.size() && j < rightList.size()) {
            if (leftList.get(i).compareTo(rightList.get(j)) <= 0) {
                list.set(k++, leftList.get(i++));
            } else {
                list.set(k++, rightList.get(j++));
            }
        }

        while (i < leftList.size()) {
            list.set(k++, leftList.get(i++));
        }
        while (j < rightList.size()) {
            list.set(k++, rightList.get(j++));
        }
    }


    public static <T> void merge(List<T> list, int left, int middle, int right, Comparator<T> comparator) {
        List<T> leftList = new ArrayList<>(list.subList(left, middle + 1));
        List<T> rightList = new ArrayList<>(list.subList(middle + 1, right + 1));

        int i = 0, j = 0, k = left;
        while (i < leftList.size() && j < rightList.size()) {
            if (comparator.compare(leftList.get(i), rightList.get(j)) <= 0) {
                list.set(k++, leftList.get(i++));
            } else {
                list.set(k++, rightList.get(j++));
            }
        }

        while (i < leftList.size()) {
            list.set(k++, leftList.get(i++));
        }
        while (j < rightList.size()) {
            list.set(k++, rightList.get(j++));
        }
    }
}