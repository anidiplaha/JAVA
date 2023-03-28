import java.util.*;  
public class BucketSort   
{  

private static void binSort(int[] array, int bucketSize)  
{   
List<Integer>[] buckets = new List[bktSize];     
for(int i = 0; i < bktSize; i++)  
{  
buckets[i] = new LinkedList<>();  
}  
for(int num : array)  
{  
buckets[hash(num, bktSize)].add(num);  
}  
for(List<Integer> bucket : buckets)  
{     
Collections.sort(bucket);  
}  
int index = 0;  
for(List<Integer> bucket : buckets)  
{  
for(int num : bucket)  
{  
array[index++] = num;  
}  
}  
}  
private static int hash(int num, int bucketSize)  
{  
return num/bucketSize;  
}  
public static void main(String args[])   
{   
int[] array = {24, 41, 18, 5, 13, 8, 76, 84, 37, 15, 55, 19, 57, 0, 11, 51};  
System.out.println("Unsorted Array: " + Arrays.toString(array));
binSort(array, 10);  
System.out.println("Sorted Array: " + Arrays.toString(array));  
}  
}  