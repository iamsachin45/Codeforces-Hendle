package com.example.codeforceshandle;

import java.util.List;

public class Root4
{
    public String status;
    public List<Pojo> result;

    public Root4(String status, List<Pojo> result)
    {
        this.status = status;
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Pojo> getResult() {
        return result;
    }

    public void setResult(List<Pojo> result) {
        this.result = result;
    }
}
