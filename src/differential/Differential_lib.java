package differential;

public class Differential_lib implements Differential_if{
 
	private double a, g, h;
	
	public Differential_lib(double a, double h) {
		super();
		this.a = a;
		this.h = h;
	}

	@Override
	public double getRx() {
		// TODO 自動生成されたメソッド・スタブ
		return 2*this.a;
	}

	@Override
	public double getDx() {
		// TODO 自動生成されたメソッド・スタブ
		return (Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/h;
	}
	
	double gosa() {
		if(getRx() > getDx()) {
			g = (getRx() - getDx()) / getRx() * 100;
		}else {
			g = (getDx() - getRx()) / getRx() * 100;
		}
		return g;
	}
}
