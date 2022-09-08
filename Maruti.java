package bridgelabz.javapractice.Basics;
class Car {
	boolean isAC;
	String vehicleType;
}
class Maruti extends Car{
	String categoryType;
	Maruti( boolean isAc, String vehicleType, String categoryType){
		super.isAC = isAC;
		super.vehicleType=vehicleType;
		this.categoryType=categoryType;
		}
	
		public static void main(String[] args) {
			Maruti altoSeries1 = new Maruti(false, "sedan", "economy");
			System.out.println(altoSeries1.isAC);
			System.out.println(altoSeries1.vehicleType);
			System.out.println(altoSeries1.categoryType);
		}
	}

