package InstallWeka;

import weka.classifiers.Classifier;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;

public class LinearRegression implements Classifier {
	
	
	//the method which runs to train the linear regression predictor, i.e.
	//finds its weights.
	@Override
	public void buildClassifier(Instances trainingData) throws Exception {
		System.out.println("Hello Weka!!!");
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
