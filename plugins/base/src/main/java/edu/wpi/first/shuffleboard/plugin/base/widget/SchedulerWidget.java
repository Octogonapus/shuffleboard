package edu.wpi.first.shuffleboard.plugin.base.widget;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import edu.wpi.first.shuffleboard.plugin.base.data.SchedulerData;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

@Description(
    name = "Scheduler",
    summary = "Show Commands",
    dataTypes = {
        SchedulerData.class
    })
@ParametrizedController("Scheduler.fxml")
public class SchedulerWidget extends SimpleAnnotatedWidget<SchedulerData> {
  @FXML
  private Pane root;
  @FXML
  private ListView<String> listView;

  @FXML
  private void initialize() {
    dataProperty().addListener((__, oldData, newData) ->
        listView.getItems().setAll(newData.getNames()));
  }

  @Override
  public Pane getView() {
    return root;
  }
}
