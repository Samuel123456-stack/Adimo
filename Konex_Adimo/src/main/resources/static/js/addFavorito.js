$(document).ready(function() {
	$("#addFavorito").onclick(function() {
		var idcid = $(this).val();
		var s = '<option value=' + "" + '>Selecione o bairro</option>';
		if (idcid > 0) {
			$.ajax({
				url: '/imovel/favoritos2',
				data: { "idcid": idcid },
			});
		}
	});
});