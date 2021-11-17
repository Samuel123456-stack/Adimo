$(document).ready(function() {
	$("#addFavorito").on('click',function() {
		var id = $(this).val();
				if (id > 0) {
			$.ajax({
				url: '/imovel/favoritos2',
				data: { "id": id },
			});
		}
	});
});