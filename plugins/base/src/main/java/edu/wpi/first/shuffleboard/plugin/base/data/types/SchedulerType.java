package edu.wpi.first.shuffleboard.plugin.base.data.types;

import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
import edu.wpi.first.shuffleboard.plugin.base.data.SchedulerData;
import edu.wpi.first.shuffleboard.plugin.base.widget.CommandData;
import java.util.Map;
import java.util.function.Function;

public class SchedulerType extends ComplexDataType<SchedulerData> {

  public SchedulerType() {
    super("Scheduler", SchedulerData.class);
  }

  @Override
  public Function<Map<String, Object>, SchedulerData> fromMap() {
    return SchedulerData::new;
  }

  @Override
  public SchedulerData getDefaultValue() {
    return new SchedulerData();
  }
}
