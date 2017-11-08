package edu.wpi.first.shuffleboard.plugin.base.data;

import edu.wpi.first.shuffleboard.api.data.ComplexData;
import java.util.HashMap;
import java.util.Map;

public class SchedulerData extends ComplexData<SchedulerData> {
  private String[] names;
  private Number[] ids;
  private Number[] cancel;

  public SchedulerData() {
    names = new String[]{};
    ids = new Number[]{};
    cancel = new Number[]{};
  }

  public SchedulerData(Map<String, Object> map) {
    names = (String[]) map.getOrDefault("Names", new String[]{});
    ids = (Number[]) map.getOrDefault("Ids", new Number[]{});
    cancel = (Number[]) map.getOrDefault("Cancel", new Number[]{});
  }

  @Override
  public Map<String, Object> asMap() {
    Map<String, Object> out = new HashMap<>();
    out.put("Names", names);
    out.put("Ids", ids);
    out.put("Cancel", cancel);
    return out;
  }

  public String[] getNames() {
    return names;
  }

  public Number[] getIds() {
    return ids;
  }

  public Number[] getCancel() {
    return cancel;
  }
}
