$(document).ready(function() {
	$(window).load(function(){
        loadData();
    });
	
	$("#form-añadirCliente").submit(function(event){
	    event.preventDefault();
	    var data;
	        data = {
	            "categoria" : $("#input-nombre-categoria").val()
	        }
	        $.ajax({
	            url: 'categorias/save',
	            type: 'POST',
	            data: data,
	            success:function(data){  
	              if(data!=""){
	                if(data==1){
	                    $("#añadirCategoria").modal("hide");
	                    setTimeout(function(){
	                        Swal(
	                          'Satisfactorio!',
	                          'Se ha registrado correctamente la categoria',
	                          'success'
	                        );
	                        document.getElementById("form-añadirCategoria").reset();
	                        loadData(); 
	                    },500); 
	                }else if(data==0){
	                    $("#añadirCategoria").modal("hide");
	                    setTimeout(function(){
	                        Swal(
	                          'Error!',
	                          'Ha ocurrido un error, vuelva a intentar',
	                          'error'
	                        );
	                        document.getElementById("form-añadirCategoria").reset();
	                        loadData();  
	                    },500);
	                }else if(data==2){
	                    setTimeout(function(){
	                        Swal(
	                          'Error!',
	                          'Al parecer esta categoria ya esta registrada',
	                          'error'
	                        );
	                    },500);
	                }
	              }
	            }   
	        });

	});



});