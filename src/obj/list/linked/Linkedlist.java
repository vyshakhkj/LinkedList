package obj.list.linked;

import obj.list.linked.NodeObject;
public class Linkedlist {
	private NodeObject start;

	private NodeObject end;

	private int size;

	public Linkedlist() {
		start = null;
		end = null;
		size = 0;
	}

	public void insertLast(String data){
		NodeObject nodeObject = new NodeObject(data, null);
		size++;
		if(start == null){
			start = nodeObject;
			end = start;
		} else {
			end.setLink(nodeObject);
			end = nodeObject;
		}
	} 

	public void insertFirst(String data){
		NodeObject nodeObject = new NodeObject(data,null);
		size++;
		if(start == null){
			start = nodeObject;
			end = start;
		} else {
			nodeObject.setLink(start);
			start = nodeObject;
		}
	}

	public void insertAtPos(String data, int pos){
		NodeObject nodeObject = new NodeObject(data,null);
		NodeObject currentNode = start;
		pos = pos - 1;
		for(int i = 1; i <= size; i++){
			if(pos == i){
				nodeObject.setLink(currentNode.getLink());
				currentNode.setLink(nodeObject);
				break;
			}
			currentNode = currentNode.getLink();
		}
		size++;
	}

	public void deleteAtPos(int pos){
		if(size == 0){
			return;
		}else {
			if(pos == 1){
				start = start.getLink();
				size--;
				return;
			} else if(pos == size){
				NodeObject temp = start;
				while(temp != end){
					temp = temp.getLink();
				}
				end = temp;
				temp.setLink(null);
				size--;
				return;
			}
			NodeObject temp = start;
			pos = pos - 1;
			for(int i = 1; i <= size; i++){
				if(pos == i){
					temp.setLink(temp.getLink().getLink());
					break;
				}
				temp = temp.getLink();
			}
			size--;
		}
	}
	
	public void display(){
		System.out.print("Singly Linked List = ");
		if(size == 0){
			System.out.println("empty");
			return;
		}
		if(start.getLink() == null){
			System.out.println(start.getData());
			return;
		}
		NodeObject currentNode = start;
		System.out.print(start.getData()+" --->");
		currentNode = currentNode.getLink();
		while(currentNode.getLink() != null){
			System.out.print(currentNode.getData()+" --->");
			currentNode = currentNode.getLink();
		}
		System.out.println(currentNode.getData());
	}

	public int getSize() {
		return size;
	}
	
	public boolean isEmpty()
    {
        return start == null;
    }
}
