package computerConfiguration;

public class Computer {
	private String operatingSystem;
	private String processor;
	private int ram;
	private int generation;
	private boolean hasNvme;
	private boolean hasSSD;
	
	
	public Computer(String operatingSystem, String processor, int ram, int generation, boolean hasNvme,
			boolean hasSSD) {
		
		this.operatingSystem = operatingSystem;
		this.processor = processor;
		this.ram = ram;
		this.generation = generation;
		this.hasNvme = hasNvme;
		this.hasSSD = hasSSD;
	}


	
	public String toString() {
		return "Computer [operatingSystem=" + operatingSystem + ", processor=" + processor + ", ram=" + ram
				+ ", generation=" + generation + ", hasNvme=" + hasNvme + ", hasSSD=" + hasSSD + "]";
	}
	
	
	
	
	
	
	

}
