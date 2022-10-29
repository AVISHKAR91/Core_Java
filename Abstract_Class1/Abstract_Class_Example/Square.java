package abstract_class;

public class Square extends Shape1{
	
	float side;
	
	@Override
	void findArea() {
		Area = side*side;
		
	}
	
	@Override
	void print() {
		// TODO Auto-generated method stub
		super.print();
	}

	public Square(float side) {
		super();
		this.side = side;
	}

}
