package com.github.terma.gigaspacesqlconsole;

public class ExecuteServlet extends JsonWithCorrectAppVersionServlet<ExecuteRequest> {

    @Override
    protected Object doJsonWithCorrectAppVersion(ExecuteRequest request) throws Exception {
        return Executor.query(request);
    }

    @Override
    protected Class<ExecuteRequest> getRequestClass() {
        return ExecuteRequest.class;
    }

}
