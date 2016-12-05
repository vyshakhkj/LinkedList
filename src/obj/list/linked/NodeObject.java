package obj.list.linked;

public class NodeObject {
	
	private String data;
	
	private NodeObject link;
	
	public NodeObject() {
		data = null;
		link = null;
	}

	public NodeObject(String data, NodeObject link) {
		super();
		this.data = data;
		this.link = link;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public NodeObject getLink() {
		return link;
	}

	public void setLink(NodeObject link) {
		this.link = link;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NodeObject [data=").append(data).append(", link=").append(link).append("]");
		return builder.toString();
	}
	
	
}
