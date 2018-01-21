$(function () {
    $("a.deleteAnch").confirm({
        theme: 'supervan',
        title: 'Czy na pewno',
        draggable: false,
        content: 'chcesz usunąć ten rekord?',
        buttons: {
            Tak: function () {
                location.href = this.$target.attr('href');
            },
            Anuluj: function () {

            }
        }
    });
});