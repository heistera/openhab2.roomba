/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.irobot;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link VacuumBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author hkuhn42 - Initial contribution
 */
public class IRobotBindingConstants {

    public static final String BINDING_ID = "irobot";

    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_ROOMBA = new ThingTypeUID(BINDING_ID, "roomba");

    // List of all Channel ids
    public final static String CHANNEL_COMMAND = "command";
    public final static String CHANNEL_CYCLE = "cycle";
    public final static String CHANNEL_PHASE = "phase";
    public final static String CHANNEL_BIN = "bin";
    public final static String CHANNEL_BATTERY = "battery";
    public final static String CHANNEL_ERROR = "error";
    public final static String CHANNEL_RSSI = "rssi";
    public final static String CHANNEL_SNR = "snr";
    // iRobot's JSON lists weekdays starting from Saturday
    public final static String CHANNEL_SCHED_SWITCH_PREFIX = "sched_";
    public final static String[] CHANNEL_SCHED_SWITCH = { "sched_sun", "sched_mon", "sched_tue", "sched_wed",
            "sched_thu", "sched_fri", "sched_sat" };
    public final static String CHANNEL_SCHEDULE = "schedule";
    public final static String CHANNEL_EDGE_CLEAN = "edge_clean";
    public final static String CHANNEL_ALWAYS_FINISH = "always_finish";
    public final static String CHANNEL_POWER_BOOST = "power_boost";
    public final static String CHANNEL_CLEAN_PASSES = "clean_passes";

    public final static String CMD_CLEAN = "clean";
    public final static String CMD_SPOT = "spot";
    public final static String CMD_DOCK = "dock";
    public final static String CMD_PAUSE = "pause";
    public final static String CMD_STOP = "stop";

    public final static String BIN_OK = "ok";
    public final static String BIN_FULL = "full";
    public final static String BIN_REMOVED = "removed";

    public final static String BOOST_AUTO = "auto";
    public final static String BOOST_PERFORMANCE = "performance";
    public final static String BOOST_ECO = "eco";

    public final static String PASSES_AUTO = "auto";
    public final static String PASSES_1 = "1";
    public final static String PASSES_2 = "2";
}
