package dad.javafx.buscaryreemplazar;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class BYRView extends GridPane {
	TextField buscarText;
	TextField reemplazarText;
	CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
	Button buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton;
	VBox naranja;
	GridPane amarillo;
	GridPane verde;
	public BYRView() {
		super();

		buscarText = new TextField();

		reemplazarText = new TextField();
		
		checkBox1 = new CheckBox("Mayúsculas y minúsculas");
		checkBox2 = new CheckBox("Buscar hacia atrás");
		checkBox3 = new CheckBox("Expresión regular");
		checkBox4 = new CheckBox("Resaltar resultados");
		
		amarillo = new GridPane();
		amarillo.add(checkBox1, 0, 0);
		amarillo.add(checkBox2, 0, 1);
		amarillo.add(checkBox3, 1, 0);
		amarillo.add(checkBox4, 1, 1);
		amarillo.setHgap(5);
		amarillo.setVgap(5);
		
		verde = new GridPane();
		verde.addRow(0, new Label("Buscar:"), buscarText);
		verde.addRow(1, new Label("Reemplazar con:"), reemplazarText);
		verde.setHgap(5);
		verde.setVgap(5);
		verde.add(amarillo, 1, 2);
		
		
		buscarButton = new Button("Buscar");
		reemplazarButton = new Button("Reemplazar");
		reemplazarTodoButton = new Button("Reemplazar Todo");
		cerrarButton = new Button("Cerrar");
		ayudaButton = new Button("Ayuda");
		
		buscarButton.setMinWidth(120);
		reemplazarButton.setMinWidth(120);
		reemplazarTodoButton.setMinWidth(120);
		cerrarButton.setMinWidth(120);
		ayudaButton.setMinWidth(120);
		
		naranja = new VBox();
		naranja.getChildren().addAll(buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton);
		naranja.setAlignment(Pos.CENTER);
		naranja.setSpacing(5);
		
		setPadding(new Insets(5));
		setHgap(5);
		setVgap(5);
		addRow(0, verde, naranja);
		setAlignment(Pos.TOP_LEFT);
		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints(),
	};

		getColumnConstraints().setAll(cols);
		
		cols[0].setHalignment(HPos.RIGHT);

		cols[1].setHgrow(Priority.NEVER);
		cols[1].setFillWidth(true);

	}
}