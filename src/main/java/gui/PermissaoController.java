package gui;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerGrantsSecurity;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Alert.AlertType;
import util.front.Alerts;

public class PermissaoController {
	
		ControllerGrantsSecurity security = new ControllerGrantsSecurity();
	
	 	@FXML
	    private CheckBox checkInsertG;

	    @FXML
	   private CheckBox checkInsertF;

	    @FXML
	    private CheckBox checkDeleteG;

	    @FXML
	    private CheckBox checkDeleteF;

	    @FXML
	    private CheckBox checkSelectG;

	    @FXML
	    private CheckBox checkSelectF;

	    @FXML
	    private CheckBox checkUpdateG;

	    @FXML
	    private CheckBox checkUpdateF;

	    @FXML
	    private CheckBox checkFuncionarioG;

	    @FXML
	    private CheckBox checkFuncionarioF;

	    @FXML
	    private CheckBox checkFornecedorG;

	    @FXML
	    private CheckBox checkFornecedorF;

	    @FXML
	    private CheckBox checkEnderecoG;

	    @FXML
	    private CheckBox checkEnderecoF;

	    @FXML
	    private CheckBox checkTanqueG;

	    @FXML
	    private CheckBox checkTanqueF;

	    @FXML
	    private CheckBox checkPrecoG;

	    @FXML
	    private CheckBox checkPrecoF;

	    @FXML
	    private CheckBox checkCombustivelG;

	    @FXML
	    private CheckBox checkCombustivelF;
	    
	    @FXML
	    private Button btnEnviarF;

	    @FXML
	    private Button btnEnviarG;
	    
	    @FXML
	    public void getGrantFrentista() {
	    	List<String> listTablesF = new ArrayList();
	    	List<String> listTablesG = new ArrayList();
	    	List<String> listPermissaoG = new ArrayList();
	    	List<String> listPermissaoF = new ArrayList();
	    	
	    	//para as tabelas
	    	boolean a = (checkCombustivelF.isSelected()) ? listTablesF.add(checkCombustivelF.getText()) : false;
	    	boolean b = (checkFornecedorF.isSelected()) ? listTablesF.add(checkCombustivelF.getText()) : false;
	    	boolean c = (checkFuncionarioF.isSelected()) ? listTablesF.add(checkCombustivelF.getText()) : false;
	    	boolean d = (checkEnderecoF.isSelected()) ? listTablesF.add(checkCombustivelF.getText()) : false;
	    	boolean e = (checkPrecoF.isSelected()) ? listTablesF.add(checkCombustivelF.getText()) : false;
	    	boolean f = (checkTanqueF.isSelected()) ? listTablesF.add(checkCombustivelF.getText()) : false;
	    		    	
	    	boolean g = (checkCombustivelG.isSelected()) ? listTablesG.add(checkCombustivelF.getText()) : false;
	    	boolean h = (checkFornecedorG.isSelected()) ? listTablesG.add(checkCombustivelF.getText()) : false;
	    	boolean i = (checkFuncionarioG.isSelected()) ? listTablesG.add(checkCombustivelF.getText()) : false;
	    	boolean j = (checkCombustivelG.isSelected()) ? listTablesG.add(checkCombustivelF.getText()) : false;
	    	boolean k = (checkEnderecoG.isSelected()) ? listTablesG.add(checkCombustivelF.getText()) : false;
	    	boolean l = (checkPrecoG.isSelected()) ? listTablesG.add(checkCombustivelF.getText()) : false;
	    	boolean m = (checkTanqueG.isSelected()) ? listTablesG.add(checkCombustivelF.getText()) : false;
	    	
	    	boolean n = (checkInsertF.isSelected()) ? listPermissaoF.add(checkCombustivelF.getText()) : false;
	    	boolean p = (checkDeleteF.isSelected()) ? listPermissaoF.add(checkCombustivelF.getText()) : false;
	    	boolean q = (checkUpdateF.isSelected()) ? listPermissaoF.add(checkCombustivelF.getText()) : false;
	    	boolean r = (checkSelectF.isSelected()) ? listPermissaoF.add(checkCombustivelF.getText()) : false;
	    	
	    	boolean s = (checkInsertF.isSelected()) ? listPermissaoG.add(checkCombustivelF.getText()) : false;
	    	boolean t = (checkDeleteF.isSelected()) ? listPermissaoG.add(checkCombustivelF.getText()) : false;
	    	boolean u = (checkUpdateF.isSelected()) ? listPermissaoG.add(checkCombustivelF.getText()) : false;
	    	boolean v = (checkSelectF.isSelected()) ? listPermissaoG.add(checkCombustivelF.getText()) : false;
	    	
	    	security.configurarGrants(listTablesF, listTablesG, listPermissaoF, listPermissaoG);
	    	Alerts.showAlert("PERMISSOES","ALTERADAS COM SUCESSO!" , null, AlertType.CONFIRMATION);
	    		    	
	    }
	    
	    
}
