public class GeneticAlgorithm{
	private int populationSize;
	private double mutationRate;
	private double crossoverRate;
	private int elitismCount;

	puplic GeneticAlgorithm(int populationSize, double mutationRate, double crossoverRate, int elitismCount){
		this.populationSize = populationSize;
		this.mutationRate = mutationRate;
		this.crossoverRate = crossoverRate;
		this.elitismCount = elitismCount;
	}
	
}