$(document).ready(function() {
	$("#addFavorito").on('click',function() {
		var id = $(this).val();
				if (id > 0) {
			$.ajax({
				url: '/imovel/add',
				data: { "id": id },
				success:function() {
					alert('Imóvel adicionado à lista de favoritos!');		
				}	
			});
		}
	});
});