package edu.wpi.first.shuffleboard.plugin.base.data;

import edu.wpi.first.shuffleboard.api.data.ComplexData;
import java.util.HashMap;
import java.util.Map;

public class SchedulerData extends ComplexData<SchedulerData> {
  private String[] names;
  private double[] ids;
  private double[] cancel;

  public SchedulerData() {
    names = new String[]{};
    ids = new double[]{};
    cancel = new double[]{};
  }

  public SchedulerData(Map<String, Object> map) {
    names = (String[]) map.getOrDefault("Names", new String[]{});
    ids = (double[]) map.getOrDefault("Ids", new double[]{});
    cancel = (double[]) map.getOrDefault("Cancel", new double[]{});
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

  public double[] getIds() {
    return ids;
  }

  public double[] getCancel() {
    return cancel;
  }
}
