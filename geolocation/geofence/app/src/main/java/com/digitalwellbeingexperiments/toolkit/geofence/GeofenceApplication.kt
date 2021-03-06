// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.digitalwellbeingexperiments.toolkit.geofence

import android.app.Application

class GeofenceApplication : Application() {
    companion object {
        lateinit var instance: GeofenceApplication
            private set //Safety: only this class can set the instance
    }
    lateinit var triggerManager: TriggerManager

    override fun onCreate() {
        super.onCreate()
        triggerManager = TriggerManager(applicationContext)
        instance = this
    }
}