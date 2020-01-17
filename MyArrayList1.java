package myarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList1 implements List {

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		result = prime * result + count;
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyArrayList1 other = (MyArrayList1) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		if (count != other.count)
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "MyArrayList1 [array=" + Arrays.toString(array) + ", count=" + count + ", size=" + size + "]";
	}



	private Object array[]; 
    private int count; 
    private int size; 
    
    
	public MyArrayList1() {
		array = new Object[1]; 
        count = 0; 
        size = 1;
	}

	@Override
	public boolean add(Object e) {
        if (count == size) { 
            growSize(array,size);
        }  
        array[count] =  e; 
        count++;
		return true; 
	}
	
	
	
	public Object growSize(Object array,int size) 
    { 
//  
//        Object temp[] = null; 
//        if (count == size) { 
//  
//           
//            temp = new Object[array.length * 2]; 
//            { 
//                for (int i = 0; i < size; i++) { 
//                    // copy all array value into temp 
//                    temp[i] = array[i]; 
//                } 
//            } 
//        } 
//  
//        // double size array temp initialize 
//        // into variable array again 
//        array = temp; 
//         
//        // and make size is double also of array 
//        size = size * 2; 
		
		 int oldSize = java.lang.reflect.Array.getLength(array);
		   Class elementType = array.getClass().getComponentType();
		   Object newArray = java.lang.reflect.Array.newInstance(
		         elementType, size);
		   int preserveLength = Math.min(oldSize, size);
		   if (preserveLength > 0)
		      System.arraycopy(array, 0, newArray, 0, preserveLength);
		   return newArray;
    } 

	@Override
	public void add(int index, Object element) {
		 // if size is not enough make size double 
        if (count == size) { 
            growSize(); 
        } 
  
        for (int i = count - 1; i >= index; i--) { 
  
            // shift all element right  
            // from given index 
            array[i + 1] = array[i]; 
        } 
  
        // insert data at given index 
        array[index] = element; 
        count++; 
		
	}

	@Override
	public boolean addAll(Collection c) {
		if (count == size) { 
            growSize();
        }  
        array[count] =  c; 
        count++;
		return true; 
	}

	@Override
	public boolean addAll(int index, Collection c) {
		 if (count == size) { 
	            growSize(); 
	        } 
	  
	        for (int i = count - 1; i >= index; i--) { 
	  
	            // shift all element right  
	            // from given index 
	            array[i + 1] = array[i]; 
	        } 
	  
	        // insert data at given index 
	        array[index] = c; 
	        count++;
	        return true;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int index) {
        if (count > 0) { 
            for (int i = index; i < count - 1; i++) { 
  
                // shift all element of right  
                // side from given index in left 
                array[i] = array[i + 1]; 
            } 
            array[count - 1] = 0; 
            count--; 
        } 
        return array;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
