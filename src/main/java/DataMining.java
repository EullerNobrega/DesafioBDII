import org.jdmp.core.algorithm.classification.bayes.NaiveBayesClassifier;
import org.jdmp.core.algorithm.clustering.SelfOrganizingMap;
import org.jdmp.core.dataset.DataSet;
import org.jdmp.core.dataset.ListDataSet;

public class DataMining {
	public void JDM() {
	// carregar exemplo de conjunto de dados
	ListDataSet dataSet = DataSet.Factory.IRIS ();

	// cria um classificador
	NaiveBayesClassifier classifier = new NaiveBayesClassifier ();

	// treina o classificador usando todos os dados
	classifier.trainAll(dataSet);

	// use o classificador para fazer previsões
	classifier.predictAll (dataSet);

	// obtém os resultados
	double precisão = dataSet.getAccuracy ();

	System.out.println ("precisão:" + precisão);
	}
	
	public void JDMGui() {
		// carrega o conjunto de dados de exemplo 
		ListDataSet dataSet = DataSet.Factory.ANIMALS (); 

		// cria um mapa auto-organizado 
		SelfOrganizingMap som = new SelfOrganizingMap (); 

		// treina o SOM usando todos os dados 
		try {
			som.train(dataSet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// use o SOM para fazer previsões 
		try {
			som.predict(dataSet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		// exibe o conjunto de dados na tela 
		dataSet.showGUI ();
	}
}
