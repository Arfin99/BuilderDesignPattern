package computerConfiguration;

public class ComputerBuilder {
	private String operatingSystem;
	private String processor;
	private int ram;
	private int generation;
	private boolean hasNvme;
	private boolean hasSSD;
	
	public ComputerBuilder setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
		return this;
	}
	public ComputerBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public ComputerBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public ComputerBuilder setGeneration(int generation) {
		this.generation = generation;
		return this;
	}
	public ComputerBuilder setHasNvme(boolean hasNvme) {
		this.hasNvme = hasNvme;
		return this;
	}
	public ComputerBuilder setHasSSD(boolean hasSSD) {
		this.hasSSD = hasSSD;
		return this;
	}
	
	public Computer getComputer() {
		return new Computer(operatingSystem, processor, ram, generation, hasNvme, hasSSD);
	}
	
	
	

}
