package gui;

import java.io.IOException;
import java.util.function.Consumer;



import controller.ControllerCombustivelCliente;
import controller.ControllerFornecimento;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import model.CombustivelCliente;
import model.Fornecimento;
import util.front.Alerts;

public class MenuViewController {

	@FXML
	private MenuItem menuItemGastosMensais;

	@FXML
	private MenuItem menuItemGanhosMensais;

	@FXML
	private MenuItem menuItemCombustiveis;

	@FXML
	private MenuItem menuItemNivelCombustiveis;

	@FXML
	private MenuItem menuItemClienteFidelidade;

	@FXML
	private MenuItem menuItemGraficoFornecedor;

	@FXML
	private MenuItem menuItemLucro;

	@FXML
	private MenuItem menuItemQtdAbastecimentoHora;

	@FXML
	private MenuItem menuItemAbastecimentoHoraGrafico;

	@FXML
	private MenuItem menuItemVendaAcumulada;
	
	@FXML
	private MenuItem meniItemTopFuncionario;
	
	@FXML
	private MenuItem menuItemLucroGrafico;
	
	@FXML
	private MenuItem menuItemFrentista;
	
	@FXML
	private MenuItem menuitemAtivaCartao;
	
	@FXML
	private MenuItem menuItemConsumoTanque;
	
	@FXML
	private MenuItem menuItemVolumeTanque;

	@FXML // ranking fornecedor
	public void onMenuItemRankingCombustive() {

		// loadView("/gui/GastosMensais.fxml", x->{});

		loadView("/gui/rankingCombustivel.fxml", (RankingCombustivelController controller) -> {
			controller.setControllerFornecimento(new ControllerFornecimento<Fornecimento>());
			controller.updateTableView();
		});

	}

	/*
	 * @FXML public void onMenuItemCombustivel() {
	 * loadView("/gui/ganhosMensais.fxml", x -> { }); }
	 */

	@FXML
	public void onMenuItemCombustiveis() {
		loadView("/gui/CombustivelMaisVendidoView.fxml", (CombustivelMaisVendidoController controller) -> {
			controller.setControllerCombustivelCliente(new ControllerCombustivelCliente<CombustivelCliente>());
			controller.updateList();
		});
	}

	@FXML // tabela de variação de preço de combustiveis
	public void onMenuItemNivelCombustiveis() {
		loadView("/gui/CombustiveisGrafico.fxml", (CombustiveisGraficoController controller) -> {
			controller.setVariacaoPrecoCombustivel();
		});
	}

	@FXML
	public void onMenuItemCartaoFidelidade() {
		loadView("/gui/ClienteFidelidadeTable.fxml", (ClienteFidelidadeTableController controller) -> {
			controller.setControllerCliente(new ControllerCombustivelCliente<CombustivelCliente>());
			controller.updateTable();
		});
	}

	@FXML
	public void onMenuItemGraficoFornecedor() {

		loadView("/gui/RankingFornecedorGrafico.fxml", (RankingFornecedorGraficoController controller) -> {
			controller.setVariacaoRankingFornecedor();
		});

	}

	@FXML // tabela lucro tabela
	public void onMenuItemLucro() {

		loadView("/gui/LucroTable.fxml", (LucroTableController controller) -> {
			controller.setControllerCombustivelCliente(new ControllerCombustivelCliente<CombustivelCliente>());
			controller.updateTable();
		});
	}

	@FXML
	public void onMenuItemQtdAbastecimentoHora() {
		loadView("/gui/HorarioPicoCombustivel.fxml", (HorarioPicoController controller)->{
			controller.setControllerCombustivelCliente(new ControllerCombustivelCliente<CombustivelCliente>());
			controller.updateList();
		});
	}

	@FXML
	public void onMenuItemAbastecimentoHoraGrafico() {
		loadView("/gui/QtdAbastecimentoHoraGrafico.fxml", (QtdAbastecimentoHoraGraficoController controller) -> {
			controller.setQtdAbastecimentoHora();
		});
	}
	
	@FXML
	public void onMenuItemLucroGrafico() {
		loadView("/gui/LucroGrafico.fxml", (LucroGraficoController controller)->{
			controller.setMediaLucro();
			controller.setVariacaoLucro();
		});
	}
	@FXML
	public void onMenuItemVendaAcumulada() {
		loadView("/gui/VendaAcumuladaView.fxml", x -> {
		});
	}
	@FXML
	public void onMenuItemTopFuncionario() {
		loadView("/gui/TopFuncionario.fxml", x->{});
	}
	@FXML
	public void onMenuItemPermissao() {
		loadView("/gui/PermissaoFrentista.fxml",x->{});
	}
	
	@FXML
	public void onMenuItemAtivaCartao() {
		ControllerCombustivelCliente<CombustivelCliente> s = new ControllerCombustivelCliente<>();
		s.ativaTriggerCartaoFidelidade();
		Alerts.showAlert("CARTÃO FIDELIDADE","ATIVADO COM SUCESSO!" , null, AlertType.CONFIRMATION);
	}
	
	@FXML
	public void onMenuItemConsumoTanque() {
		ControllerCombustivelCliente<CombustivelCliente> s = new ControllerCombustivelCliente<>();
		s.ativaTriggerConsumoTanque();
		Alerts.showAlert("CONSUMO TANQUE","CONSUMO ATUALIZADO COM SUCESSO!" , null, AlertType.CONFIRMATION);
	}
	
	
	@FXML
	public void onMenuItemVolumeTanque() {
		ControllerFornecimento<Fornecimento> s = new ControllerFornecimento();
		s.ativarTriggerVolumeTanque();
		Alerts.showAlert("VOLUME TANQUE","VOLUME DO TANQUE ATUALIZADO COM SUCESSO!" , null, AlertType.CONFIRMATION);
	}

	private synchronized <T> void loadView(String absoluteName, Consumer<T> initializingAction) {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			Scene mainScene = LoginViewController.getScene();
			VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			Node mainMenu = mainVbox.getChildren().get(0);
			
			mainVbox.getChildren().clear();
			mainVbox.getChildren().add(mainMenu);
			mainVbox.getChildren().addAll(newVBox.getChildren());

			T controller = loader.getController();
			initializingAction.accept(controller);

		} catch (IOException e) {
			Alerts.showAlert("IO EXCEPTION", "Error loading Page", e.getMessage(), AlertType.ERROR);
		}
	}
}
