/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluster;

/**
 *
 * @author dangm
 */
import java.io.BufferedReader;
import java.io.FileReader;
import weka.core.converters.ConverterUtils.DataSource;
import java.util.Random;
import weka.associations.FPGrowth;
import weka.core.Instances;

public class AssociationFPGrowth {
//Association Rule FPGrowth

    public static void main(String[] args) throws Exception{

        Instances dataset = new Instances(new BufferedReader(new FileReader("dfm_done_cluster_train.arff")));
    	FPGrowth fpg = new FPGrowth();
        fpg.setMinMetric(0.7);
        fpg.setLowerBoundMinSupport(0.05);
        fpg.setNumRulesToFind(1000);
	fpg.buildAssociations(dataset); 
        System.out.println(fpg);      
    }
    
}
