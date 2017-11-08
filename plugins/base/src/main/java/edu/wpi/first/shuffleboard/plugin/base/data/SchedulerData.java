package edu.wpi.first.shuffleboard.plugin.base.data;

import edu.wpi.first.shuffleboard.api.data.ComplexData;
import edu.wpi.first.shuffleboard.plugin.base.widget.CommandData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchedulerData extends ComplexData<SchedulerData> {
  private List<CommandData> data;

  public SchedulerData() {
    data = new ArrayList<>();
  }

  public SchedulerData(Map<String, Object> map) {
    this();
    map.values().forEach(val -> {
      if (val instanceof CommandData) {
        data.add((CommandData)val);
      }
    });
  }

  @Override
  public Map<String, Object> asMap() {
    Map<String, Object> out = new HashMap<>();
    data.forEach(elem -> out.putAll(elem.asMap()));
    return out;
  }

  public List<CommandData> getData() {
    return data;
  }
}
