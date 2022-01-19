package application;


class Pair{
	int start;
	int end;
	public Pair(int start,int end)
	{
		this.start = start;
		this.end = end;
	}
}
public class ladder {
	private Pair[] array = new Pair[10];
	public void setLadder(int index, Pair pair)
	{
		array[index] = pair;
	}
}
