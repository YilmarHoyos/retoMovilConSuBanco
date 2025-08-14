package com.consubanco.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class UsuarioLombokData {

    String user;
    String pass;

    public static List<UsuarioLombokData> setData(DataTable dataTable) {
        List<UsuarioLombokData> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, UsuarioLombokData.class));
        }
        return dates;
    }

}