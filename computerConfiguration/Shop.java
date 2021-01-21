package computerConfiguration;

public class Shop {
	public static void main(String[] args) {
		Computer c1  = new ComputerBuilder().setOperatingSystem("Windows 10 Pro").setProcessor("i5 10400").setGeneration(10).getComputer();
		
		Computer c2 = new ComputerBuilder().setHasNvme(true).setHasSSD(true).getComputer();
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
