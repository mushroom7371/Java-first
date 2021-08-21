package ch11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List {
	Object [] data = null;	//객체를 담기 위한 객체배열을 선언
	int capacity = 0;	//용량
	int size = 0;		//크기
	
	MyVector(int capacity){	//생성자를 통한 초기화 인자값으로 배열의 크기과 용량을 설정한다.
		if(capacity < 0)
			throw new IllegalArgumentException("유효하지 않은 값입니다 :. " + capacity);
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	public void ensureCapacity(int minCapacity) {
		if (minCapacity - data.length > 0)
			setCapacity(minCapacity);
	}
	
	public boolean add(Object obj) {
		// 새로운 객체를 저장하기 전에 저장할 공간을 확보한다.
		ensureCapacity(size+1);
		data[size++] = obj; 
		return true;
	}
	
	public Object get(int index) {
		if(index < 0 || index >= size) 
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");

		return data[index];
	}
	
	public Object remove(int index) { 
		Object oldObj = null;

		if(index < 0 || index >= size) 
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");

		oldObj = data[index];

		// 삭제하고자 하는 객체가 마지막 객체가 아니라면, 배열복사를 통해 빈자리를 채워줘야 한다.
		if(index != size-1) {
			System.arraycopy(data, index+1, data, index, size-index-1);
		}

        // 마지막 데이터를 null로 한다. 배열은 0 부터 시작하므로 마지막 요소는 index가 size-1이다.
		data[size-1] = null;	
		size--;
		return oldObj;
	}
	
	public boolean remove(Object obj) {
		for(int i=0; i< size; i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	public void trimToSize() {
		setCapacity(size);
	}
	
	private void setCapacity(int capacity) {
		if(this.capacity==capacity) return; // 크기가 같으면 변경하지 않는다.

		Object[] tmp = new Object[capacity];
		System.arraycopy(data,0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}
	
	public void clear(){ 
		for (int i = 0; i < size; i++)
			data[i] = null;
		size = 0;
	}

	public Object[] toArray(){ 
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);

		return result;
	}

	public boolean isEmpty() { return size==0;}
	public int capacity() { return capacity; }
	public int size() { return size; }

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
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
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
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
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
