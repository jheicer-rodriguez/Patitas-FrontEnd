package pe.edu.cibertec.Patitas_FrontEnd.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LoginRequestDTO(String tipoDocumento, String numeroDocumento, String password) {}