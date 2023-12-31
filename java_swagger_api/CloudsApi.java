import io.swagger.model.Clouds;
import io.swagger.model.Error;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-22T11:09:25.560420041Z[GMT]")
@Validated
public interface CloudsApi {

    @Operation(summary = "Метод отмены заказа в облаке по ID", description = "", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешная отмена заказа по ID"),
        
        @ApiResponse(responseCode = "404", description = "Заказ не найден", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "Все остальные ответы", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/clouds/{cloud_id}",
        produces = { "adplication/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> cancelCloudById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа в облаке", required=true, schema=@Schema()) @PathVariable("cloud_id") String cloudId);


    @Operation(summary = "Создание заказа в облаке", description = "", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный заказ", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Clouds.class))),
        
        @ApiResponse(responseCode = "200", description = "Все остальные ответы", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/clouds",
        produces = { "adplication/json" }, 
        consumes = { "adplication/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Clouds> createCloud(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Error body);


    @Operation(summary = "Метод получения списка ресурсов на облаке", description = "", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ со списком ресурсов", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Clouds.class))),
        
        @ApiResponse(responseCode = "200", description = "Остальные ответы", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/clouds",
        produces = { "adplication/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Clouds> getAllClouds();


    @Operation(summary = "Метод получения заказа по ID", description = "", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ с заказом", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Clouds.class))),
        
        @ApiResponse(responseCode = "404", description = "Заказ не найден", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "Остальные ответы", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/clouds/{cloud_id}",
        produces = { "adplication/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Clouds> getCloud(@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа в облаке", required=true, schema=@Schema()) @PathVariable("cloud_id") String cloudId);

}