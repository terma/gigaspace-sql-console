/*
Copyright 2015 Artem Stasiuk

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.github.terma.gigaspacewebconsole.provider.groovy;

import com.github.terma.gigaspacewebconsole.core.ExecuteRequest;
import com.github.terma.gigaspacewebconsole.provider.AdminLocator;
import groovy.lang.Closure;

public class AdminClosure extends Closure {

    private final ExecuteRequest request;

    public AdminClosure(final ExecuteRequest request) {
        super(null);
        this.request = request;
    }

    @Override
    public Object call() {
        return AdminLocator.get(request);
    }

}