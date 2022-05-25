package edu.elp.siselp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.elp.siselp.entity.Escuela;
import edu.elp.siselp.entity.Estudiante;
import edu.elp.siselp.service.IEstudianteService;
import edu.elp.siselp.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estudiante")
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/list")
    public RestResponse listaEstudianteByEscuela(@RequestParam("idescuela")Escuela idescuela){
        List<Estudiante> estudianteList=this.estudianteService.listaEstudiantesByEscuela(idescuela);
        try {

            if (estudianteList.isEmpty()){
                return new RestResponse(HttpStatus.NO_CONTENT.value(),"No se encontraron Registros");
            }else{
                return new RestResponse(HttpStatus.OK.value(),"Registro de estudiantes",estudianteList);
            }

        }catch (Exception e){
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Estamos trabajando en ello, vueva mas tarde");
        }
    }
    @GetMapping("/listPorPagina")
    public Page<Estudiante> listaEstudiantePorPagina(@RequestParam("pagina") int pagina, @RequestParam("idescuela")Escuela idescuela){

        Pageable pageable = PageRequest.of(pagina,3);

        return this.estudianteService.listaEstudiantesPorPagina(pageable,idescuela);
    }
    @PostMapping("/registrar")
    public String registrarEstudiante(@RequestBody String jsonEstudiante) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        Estudiante estudiante =objectMapper.readValue(jsonEstudiante,Estudiante.class);
        this.estudianteService.guardarEstudiante(estudiante);
        return "Se guardo correctamente";
    }

    @GetMapping("/bycodigo/{coddni}")
    public Estudiante estudianteByDni(@PathVariable("coddni") String coddni){

        return this.estudianteService.obtenerPorCodigoOrDni(coddni);
    }
    @PostMapping("/delet/{idestudiante}")
    public String eliminarEstudiante(@PathVariable("idestudiante") Long idestudiante){
        this.estudianteService.eliminarEstudiante(idestudiante);
        return "Estudiante eliminado correctamente";
    }
    @PutMapping("/update/{estudiante}")
    public String actualizarEstudiante(@RequestBody String jsonEstudiante) throws JsonProcessingException {

        Estudiante estudiante =objectMapper.readValue(jsonEstudiante,Estudiante.class);
        this.estudianteService.actualizarEstudiante(estudiante);
        return "Estudiante actualizado correctamente";
    }
}

