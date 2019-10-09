$(document).ready(function() {
	$(window).load(function(){
        loadData();
    });

	function loadData(){
        window.table=$('#tabla-aseguradoras').DataTable({
                "autoWidth": false,
                "destroy":true,
                "responsive":true,
                "language": {
                "lengthMenu": "Mostrar _MENU_ registros por pagina",
                "zeroRecords": "No se han encontrado registros",
                "info": "(_MAX_ clientes) Pagina _PAGE_ de _PAGES_",
                "search": "Buscar",
                "infoEmpty": "No hay registros disponibles",
                "infoFiltered": "(registros disponibles _MAX_)"
                }
            });
        editarAseguradora("#tabla-aseguradoras tbody",table);
        eliminarAseguradora("#tabla-aseguradoras tbody",table);
    }

    $("#cancelar-editarAseguradora").click(function(){
        $("#id-cliente").html("");
        document.getElementById("form-editarCliente").reset();
    });

    function editarCliente(tbody,table){
        $(tbody).on("click", ".editar-cliente", function(){
            var data=table.row($(this).parents("tr")).data();
            $("#id-cliente").html(data[0]);

            $("#input-documento-cliente-editar").val(data[0]);
            $("#input-nombre-cliente-editar").val(data[1]);
            $("#input-apellido1-cliente-editar").val(data[1]);
            $("#input-apellido2-cliente-editar").val(data[1]);
            $("#input-telefono-cliente-editar").val(data[2]);
            $("#input-direccion-cliente-editar").val(data[3]);
            $("#input-nacimiento-cliente-editar").val(data[4]);
            $("#input-ingresos-cliente-editar").val(data[5]);
            $("#input-egresos-cliente-editar").val(data[6]);           
            $("#modal-editar-cliente").modal("show");
        });
    }

    function eliminarCliente(tbody,table){
        $(tbody).on("click", ".eliminar-cliente", function(){
            var data=table.row($(this).parents("tr")).data();
            Swal({
              title: 'Estas seguro?',
              text: "Se eliminara el cliente "+data[1]+"!",
              type: 'warning',
              showCancelButton: true,
              confirmButtonColor: '#3085d6',
              cancelButtonColor: '#d33',
              confirmButtonText: 'Si, Eliminarlo!',
              cancelButtonText: "Cancelar"
            }).then((result) => {
              if (result.value) {
                $.ajax({
                    url: '#',
                    type: 'POST',
                    data: {"documento":data[0]},
                    success:function(data){  
                      if(data!=""){
                        if(data==1){
                            loadData();
                            setTimeout(function(){
                                Swal(
                                  'Satisfactorio!',
                                  'Se ha eliminado correctamente el cliente',
                                  'success'
                                );
                            },500); 
                            
                        }else if(data==0 || data==3){
                            loadData();  
                            setTimeout(function(){
                                Swal(
                                  'Error!',
                                  'Ha ocurrido un error, vuelva a intentar',
                                  'error'
                                );
                            },500);        
                        }
                      }
                    }   
                });
              }
            });
        });
    }

    $("#cancelar-editarCliente").click(function(){
        $("#id-cliente").html("");
        $("#digitoDeVerificacion").html("");
        document.getElementById("form-editarCliente").reset();
    });

    $("#form-editarCliente").submit(function(event){
        event.preventDefault();
        var data;
            data = {
                "documento" : $("#input-documento-cliente-editar").val(),
                "nombre" : $("#input-nombre-cliente-editar").val(),
                "apellido1" : $("#input-apellido1-cliente-editar").val(),
                "apellido2" : $("#input-apellido2-cliente-editar").val(),
                "direccion" : $("#input-direccion-cliente-editar").val(),
                "telefono" : $("#input-telefono-cliente-editar").val(),
                "fechaNacimiento" : $("#input-nacimiento-cliente-editar").val(),
                "ingresos" : $("#input-ingresos-cliente-editar").val(),
                "egresos" : $("#input-ingresos-cliente-editar").val()
            }
            $.ajax({
                url: 'aseguradoras/save',
                type: 'POST',
                data: data,
                success:function(data){ 
                  if(data!=""){
                    if(data==1){
                        $("#modal-editar-cliente").modal("hide");
                        setTimeout(function(){
                            Swal(
                              'Satisfactorio!',
                              'Se ha editado correctamente el cliente',
                              'success'
                            );
                            $("#id-cliente").html("");
                            document.getElementById("form-editarCliente").reset();
                        },500); 
                    }else if(data==0){
                        $("#modal-editar-cliente").modal("hide");
                        setTimeout(function(){
                            Swal(
                              'Error!',
                              'Ha ocurrido un error, vuelva a intentar',
                              'error'
                            );
                            $("#id-cliente").html("");
                            document.getElementById("form-editarCliente").reset();
                        },500);
                    }else if(data==3){
                        $("#modal-editar-cliente").modal("hide");
                        setTimeout(function(){
                            Swal(
                              'Error!',
                              'Opps, no se ha encontrado el cliente para editar',
                              'error'
                            );
                        },500);
                    }
                  }
                }   
            }).always(function(){
                        loadData();                        
                            });

    });

    $("#form-añadirAseguradora").submit(function(event){
        event.preventDefault();
        var data;
            data = {
                "nit" : $("#input-nit-aseguradora").val(),
                "nombre" : $("#input-nombre-aseguradora").val(),
                "contacto" : $("#input-contacto-aseguradora").val()
            }
            $.ajax({
                url: '#',
                type: 'POST',
                data: data,
                success:function(data){  
                  if(data!=""){
                    if(data==1){
                        $("#añadirAseguradora").modal("hide");
                        setTimeout(function(){
                            Swal(
                              'Satisfactorio!',
                              'Se ha registrado correctamente la aseguradora',
                              'success'
                            );
                            document.getElementById("form-añadirAseguradora").reset();
                            loadData(); 
                        },500); 
                    }else if(data==0){
                        $("#añadirAseguradora").modal("hide");
                        setTimeout(function(){
                            Swal(
                              'Error!',
                              'Ha ocurrido un error, vuelva a intentar',
                              'error'
                            );
                            document.getElementById("form-añadirAseguradora").reset();
                            loadData();  
                        },500);
                    }else if(data==2){
                        setTimeout(function(){
                            Swal(
                              'Error!',
                              'Al parecer este numero de NIT ya esta registrado',
                              'error'
                            );
                        },500);
                    }
                  }
                }   
            });

    });

});