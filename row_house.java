class Tower
{
	double area, price;
	
	void gett(double a, double p)
	{
		area=a;
		price=p;
	}
	void display()
	{
		System.out.println("\n Area in Sq feet : " +area );
		System.out.println("\n price : "+price);
	}
	
}
class row_house extends Tower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tower t = new Tower();
		System.out.println("\n Tower information : ");
		t.gett(230000,100000000);
		t.display();
		System.out.println("\n Row House information ");
		t.gett(2345,567890);
		t.display();

	}

}
