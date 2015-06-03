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

package com.github.terma.gigaspacesqlconsole.counts;

import com.github.terma.gigaspacesqlconsole.AppVersionValidator;
import com.github.terma.gigaspacesqlconsole.JsonServlet;
import com.github.terma.gigaspacesqlconsole.Validator;
import com.github.terma.gigaspacesqlconsole.core.CountsRequest;

public class CountsServlet extends JsonServlet<CountsRequest> {

    @Override
    protected Object doJson(CountsRequest request) throws Exception {
        return Counts.counts(request);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Class getRequestClass() {
        return CountsRequest.class;
    }


    @Override
    protected Validator<CountsRequest> getValidator() {
        return new AppVersionValidator<>();
    }

}
