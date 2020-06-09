package uk.gov.ons.fsdr.common;

public class ActionQueueConfig {

  public static final String ACTION_RESULT_ROUTING_KEY = "action.result.request";
  public static final String ACTION_RESULT_EXCHANGE = "action.result.exchange";

  public static final String GSUITE_ACTIONS_ROUTING_KEY = "gsuite.actions.request";

  public static final String XMA_LEAVER_ROUTING_KEY = "xma.leaver.request";
  public static final String XMA_AREA_MANAGER_ROUTING_KEY = "xma.area.manager.request";
  public static final String XMA_COORDINATOR_ROUTING_KEY = "xma.coordinator.request";
  public static final String XMA_FIELD_OFFICER_ROUTING_KEY = "xma.field.officer.request";

  public static final String SNOW_LEAVER_ACTIONS_ROUTING_KEY = "snow.leaver.actions.request";
  public static final String SNOW_MOVER_ACTIONS_ROUTING_KEY = "snow.mover.actions.request";
  public static final String SNOW_ACTIONS_ROUTING_KEY = "snow.actions.request";

  public static final String LWS_ACTIONS_ROUTING_KEY = "lws.actions.request";

  public static final String ADECCO_ACTIONS_ROUTING_KEY = "adecco.actions.request";
}