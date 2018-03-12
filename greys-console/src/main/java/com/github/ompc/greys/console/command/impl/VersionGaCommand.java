package com.github.ompc.greys.console.command.impl;

import com.github.ompc.greys.console.render.GpRender;
import com.github.ompc.greys.protocol.GreysProtocol;
import picocli.CommandLine.Command;

@Command(name = "version")
public class VersionGaCommand extends CommonGaCommand {

    @Override
    protected void onGp(GreysProtocol<?> gp) {
        consoleOut(
                new GpRender.Builder()
                        .build()
                        .rendering(gp)
        );
    }

}