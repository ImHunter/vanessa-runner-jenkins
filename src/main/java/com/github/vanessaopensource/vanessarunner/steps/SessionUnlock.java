package com.github.vanessaopensource.vanessarunner.steps;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.AbortException;
import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;

public class SessionUnlock extends Session {

    @DataBoundConstructor
    public SessionUnlock() {
        super();
    }

    @Override
    public void setCommandContext(VRunnerContext context) throws AbortException {
        context.setCommand("session");
        context.setCommand("unlock");

        super.setCommandContext(context);
    }

    @Extension
    @SuppressWarnings("unused")
    public static class DescriptorImpl extends VRunner.Descriptor {

        @Override
        public String getFunctionName() {
            return "vrunnerSessionUnlock";
        }

        @NonNull
        @Override
        public String getDisplayName() {
            return Messages.getString("SessionUnlockStep.DisplayName");
        }
    }
}
