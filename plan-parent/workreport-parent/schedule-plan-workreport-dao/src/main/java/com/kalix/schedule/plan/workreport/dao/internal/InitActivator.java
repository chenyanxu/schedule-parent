package com.kalix.schedule.plan.workreport.dao.internal;

import com.kalix.framework.core.util.SystemUtil;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Created by sunlf on 14-3-23.
 */
public class InitActivator implements BundleActivator {
    public void start(BundleContext bundleContext) throws Exception {
        SystemUtil.startBundlePrintln(bundleContext);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        SystemUtil.stopBundlePrintln(bundleContext);
    }
}