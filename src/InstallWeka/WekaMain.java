package InstallWeka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

import java.io.IOException;

import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;

public class WekaMain {
	
	public static BufferedReader readDataFile(String filename) {
		BufferedReader inputReader = null;

		try {
			inputReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException ex) {
			System.err.println("File not found: " + filename);
		}

		return inputReader;
	}
	
	/**
	 * Sets the class index as the last attribute.
	 * @param fileName
	 * @return Instances data
	 * @throws IOException
	 */
	public static Instances loadData(String fileName) throws IOException{
		BufferedReader dataFile = readDataFile(fileName);

		Instances data = new Instances(dataFile);
		data.setClassIndex(data.numAttributes() - 1); //In HW1 the last attribute is our class attribute
		return data;
	}
	
	public static void main(String[] args) throws Exception {
		//load data
		Instances trainingSet = loadData("housing_training.txt");
		for (int i = 0; i < 3; i++) {
			System.out.println(trainingSet.instance(i));
		}
		System.out.println("------------------");
		//trainingSet.
		Instance myFirstInstance = trainingSet.instance(0);
		Random random = new Random();
		trainingSet.randomize(random);
		System.out.println(myFirstInstance);
		System.out.println(trainingSet.instance(0));
		System.out.println("------------------");
		
		for (int i = 0 ; i < trainingSet.numAttributes(); i++) {
			Attribute attribute = trainingSet.attribute(i);
			System.out.println(attribute);
		}
		System.out.println("------------------");
		System.out.println(myFirstInstance.classValue());
		System.out.println("------------------");
		for (int i = 0 ; i < myFirstInstance.numAttributes(); i++) {
			System.out.println(myFirstInstance.value(i));
		}
		System.out.println("------------------");
		for (int i = 0; i < myFirstInstance.numAttributes(); i++) {
			if( i != myFirstInstance.classIndex()) {
				System.out.println(myFirstInstance.value(i));
		    }
		}
		System.out.println("------------------");
		LinearRegression linearRegression = new LinearRegression();
		linearRegression.buildClassifier(trainingSet);
	}

}
