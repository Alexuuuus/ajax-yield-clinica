<%-- 
    Document   : form
    Created on : 24-febrero-2014, 04:35:26
    Author     : Alejandro
--%>

<form class="form-horizontal" action="#" id="formulario" name="formulario">
    <h2>Paciente</h2>
    <div class="control-group">
        <label class="control-label" for="inputId">Id:</label>
        <div class="controls">
            <input type="text" id="id" name="id" placeholder="id" />
        </div>
    </div>
    <div class="control-group">
        <label class="control-label"  for="inputNombre">Nombre:</label>
        <div class="controls">
            <input type="text" id="nombre" name="nombre" size="30" placeholder="Nombre" />
        </div>
    </div>
    <div class="control-group">
        <label class="control-label"  for="inputNombre">Apellidos:</label>
        <div class="controls">
            <input type="text" id="apellidos" name="apellidos" size="50" placeholder="Apellidos" />
        </div>
    </div>
    <div class="control-group">
        <label class="control-label"  for="inputNombre">Telefono</label>
        <div class="controls">
            <input type="text" id="telefono" name="telefono" size="20" placeholder="telefono" />
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="inputApe1" >DNI:</label>
        <div class="controls">
            <input type="text" id="dni" name="dni" size="30" placeholder="dni"/>
        </div>
    </div>
    <div class="control-group">
        <div class="controls">
            <button type="submit" id="submitForm" class="btn submitForm">Submit</button>
        </div>
    </div>
</form>
<script>
    $(function() {
        $("#datepicker").datepicker();
    });
</script>