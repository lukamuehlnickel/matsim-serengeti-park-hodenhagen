package org.matsim.analysis;

import org.matsim.core.events.EventsUtils;

public class StartAnalysis {

    public static void main(String[] args) {

        var handler = new LinkCounterHandler();
        var histogramhandler = new HistogramHandler();
        var manager = EventsUtils.createEventsManager();
        manager.addHandler(handler);
        manager.addHandler(histogramhandler);
        EventsUtils.readEvents(manager, "C:/Users/lukam/IdeaProjects/matsim-serengeti-park-hodenhagen/scenarios/serengeti-park-v1.0/output/output-serengeti-park-v1.0-run1/serengeti-park-v1.0-run1.output_events.xml");

        System.out.println(handler.counter);

        for(var stringIntegerEntry : histogramhandler.histogram.entrySet()){
            System.out.println(stringIntegerEntry);
        }
    }
}
