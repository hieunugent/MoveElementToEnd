import java.util.*;

class MoveElementToEnd{
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove){
    int left = 0 ;
    int right = array.size()-1;

    while(right > left && array.get(right) == toMove){
  		     right--;
  		}

  		while (left < right ){
  			if(array.get(left) == toMove && array.get(right)!= toMove){
  				swap(left, right, array);
  				left++;
  				right--;
  			}else if (array.get(right)== toMove){
  				right--;
  			}
  			else{
  				left++;
  			}
  		}
      return array;
    }

  	public static void swap (int idxA, int idxB, List<Integer> array){
  		Integer temp = array.get(idxA);
  		array.set(idxA, array.get(idxB));
  		array.set(idxB, temp);
  	}
}
