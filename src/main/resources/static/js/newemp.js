// JavaScript source code
$(function () {
    $('a#goback').confirm({
            theme: 'supervan',
            title: 'Powrót',
            draggable: false,
            content: 'Wrócić do bazy pracowników bez zapisywania?',
            buttons: {
                Tak: function () {
                    location.href = this.$target.attr('href');
                },
                Anuluj: function () {
                   
                }
            }
        });
  

});