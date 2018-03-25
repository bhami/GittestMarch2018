import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GitTest1 {

	public static void main(String[] args) {
		
			List<String> colorList = new ArrayList<String>(10);
			colorList.add("bhami");
			colorList.add("sami");
			colorList.add("bhanu");
			colorList.add("sanu");
			System.out.println("ArrayList contains:" + colorList);
			//iterating elements
			for(String str: colorList){
				System.out.println(str);
			}
			//adding element at first position and last position of list
			colorList.add(0, "Satish");
			colorList.add(5,"Priya");
			System.out.println("New ArrayList contains:" + colorList);
			
			//to retreive an element at specified index
			System.out.println("Retreiving element at index 3: " + colorList.get(3));
			
			//update specific array element by given element
			colorList.set(3,"Rahul");
			System.out.println("After updating  element at index 3 , now ArrayList contains:" + colorList);
			
			//removing 3rd element from the arraylist
			colorList.remove(2);
			System.out.println("After removing  element at 3rd position, now ArrayList contains:" + colorList);
			//serach an element "bhami"
			if(colorList.contains("bhami"))
				System.out.println("Found the element");
			else
				System.out.println("Not fonund the element");
			//sort the arrayList
			Collections.sort(colorList);
			System.out.println("After sorting, now ArrayList contains:" + colorList);
			//copy the one arraylist into another
			List<String> copyList = new ArrayList<String>(10);
			copyList.add("priyanka");
			copyList.add("vivek");
			copyList.add("gargi");
			copyList.add("arya");
			copyList.add("manu");
			
			Collections.copy(copyList,colorList);
			//copyList = colorList;
			System.out.println("After copying, now ArrayList contains:" + copyList + "colorList:" + colorList);
			//revrese element in the arraylist
			Collections.reverse(colorList);
			System.out.println("After reversing, now ArrayList contains:" + colorList);
			//shuffling the elements of the list
			Collections.shuffle(colorList);
			System.out.println("After shuffling, now ArrayList contains:" + colorList);
			//sublist of the original list
			List<String> subList = colorList.subList(0, 2);
			System.out.println("Sublist of  ArrayList contains:" + subList);
			System.out.println("Bhami made first change to test git");
			
	}

}
	

