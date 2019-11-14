package com.myspace.subproc;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.ProcessContext;

/**
 * MainProcScript
 */
public class MainProcScript {

    public static void callSubProc(ProcessContext kcontext) {
        String processId = (String) kcontext.getVariable("processId");

        Map<String, Object> params = new HashMap<>();
		kcontext.getKieRuntime().startProcess(processId, params);
    }
}