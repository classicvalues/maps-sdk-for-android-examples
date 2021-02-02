/**
 * Copyright (c) 2015-2021 TomTom N.V. All rights reserved.
 *
 * This software is the proprietary copyright of TomTom N.V. and its subsidiaries and may be used
 * for internal evaluation purposes or commercial use strictly subject to separate licensee
 * agreement between you and TomTom. If you are the licensee, you are only permitted to use
 * this Software in accordance with the terms of your license agreement. If you are not the
 * licensee then you are not authorised to use this software in any manner and should
 * immediately return it to TomTom N.V.
 */
package com.tomtom.online.sdk.samples.cases.search;

import com.tomtom.online.sdk.samples.R;
import com.tomtom.online.sdk.samples.cases.RoutePlannerFragment;
import com.tomtom.online.sdk.samples.utils.views.OptionsButtonsView;

public class SearchAlongRouteFragment extends RoutePlannerFragment<SearchAlongRoutePresenter> {

    @Override
    protected SearchAlongRoutePresenter createPresenter() {
        return new SearchAlongRoutePresenter(this);
    }

    @Override
    protected void onOptionsButtonsView(OptionsButtonsView view) {
        view.addOption(R.string.btn_text_car_repair);
        view.addOption(R.string.btn_text_gas_stations);
        view.addOption(R.string.btn_text_ev_stations);
    }

    @Override
    public void onChange(boolean[] oldValues, boolean[] newValues) {
        if (newValues[0]) {
            presenter.performSearch("REPAIR_FACILITY");
        } else if (newValues[1]) {
            presenter.performSearch("PETROL_STATION");
        } else if (newValues[2]) {
            presenter.performSearch("ELECTRIC_VEHICLE_STATION");
        }
    }

}
