
import weka.classifiers.Classifier;
import weka.core.Instance;
import weka.core.Instances;

public class LinearRegression implements Classifier {
	
    private int m_ClassIndex;
	private int m_truNumAttributes;
	private double[] m_coefficients;
	private double m_alpha;
	
	//the method which runs to train the linear regression predictor, i.e.
	//finds its weights.
	@Override
	public void buildClassifier(Instances trainingData) throws Exception {
		m_ClassIndex = trainingData.classIndex();
		//TODO: complete this method
		m_coefficients = gradientDescent(trainingData);
		
	}
	
	private void findAlpha(Instances data) throws Exception {
		
	}
	
	/**
	 * An implementation of the gradient descent algorithm which should
	 * return the weights of a linear regression predictor which minimizes
	 * the average squared error.
     * 
	 * @param trainingData
	 * @throws Exception
	 */
	private double[] gradientDescent(Instances trainingData)
			throws Exception {
		return null;
	}
	
	/**
	 * Returns the prediction of a linear regression predictor with weights
	 * given by m_coefficients on a single instance.
     *
	 * @param instance
	 * @return
	 * @throws Exception
	 */
	public double regressionPrediction(Instance instance) throws Exception {
		return 0;
	}
	
	/**
	 * Calculates the total squared error over the data on a linear regression
	 * predictor with weights given by m_coefficients.
     *
	 * @param testData
	 * @return
	 * @throws Exception
	 */
	public double calculateMSE(Instances data) throws Exception {

		return 0;
	}
    
    @Override
	public double classifyInstance(Instance arg0) throws Exception {
		// Don't change
		return 0;
	}

	@Override
	public double[] distributionForInstance(Instance arg0) throws Exception {
		// Don't change
		return null;
	}

	@Override
	public Capabilities getCapabilities() {
		// Don't change
		return null;
	}
}
