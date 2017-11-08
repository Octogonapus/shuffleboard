package edu.wpi.first.shuffleboard.plugin.base.widget;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.shuffleboard.api.components.NumberField;
import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import edu.wpi.first.shuffleboard.plugin.base.data.SchedulerData;
import java.util.stream.Collectors;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import org.fxmisc.easybind.EasyBind;

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
    dataProperty().addListener((__, oldData, newData) -> {
      listView.getItems().setAll(newData.getData()
          .stream()
          .map(CommandData::getName)
          .collect(Collectors.toList()));
    });
  }

  @Override
  public Pane getView() {
    return root;
  }
}
