$(function () {
    var $row;


    $("a.deleteAnch").click(function () {
        $row = $(this).closest("tr");    // Find the row
        $row = $row.find('td').slice(0, 3);

        //jc.setContent();
    }).confirm({
        columnClass: 'm',
        theme: 'supervan',
        title: 'Usunąć poniższy rekord?',
        draggable: false,
        content: '',
        onOpenBefore: function () {
            var $id = $row.eq(0).html();
            var $date = $row.eq(1).html();
            var $madeby = $row.eq(2).html();
            this.setContent("<table class='table'><thead><tr><th>Id</th><th>Data</th><th>Sporządzona przez</th></tr></thead><tbody class='stick-child-to-left'><tr><td>" + $id + "</td><td>" + $date + "</td><td>" + $madeby + "</td></tr></tbody></table>");
        },
        buttons: {
            Tak: function () {
                location.href = this.$target.attr('href');
            },
            Anuluj: function () {

            }
        }
    });

    $("a.removeEmployee").click(function () {
        $row = $(this).closest("tr");    // Find the row
        $row = $row.find('td').slice(0, 7);

        //jc.setContent();
    }).confirm({
        columnClass: 'l',
        theme: 'supervan',
        title: 'Zwolnić tego pracownika?',
        draggable: false,
        content: '',
        onOpenBefore: function () {
            $id = $row.eq(0).html();
            $surname = $row.eq(1).html();
            $name = $row.eq(2).html();
            $position = $row.eq(3).html();
            this.setContent("<table class='table'><thead><tr><th>Id</th><th>Nazwisko</th><th>Imię</th><th>Stanowski</th></tr></thead><tbody class='stick-child-to-left'><tr><td>" + $id + "</td><td>" + $surname + "</td><td>" + $name + "</td><td>" + $position + "</td></tr></tbody></table>");
        },
        buttons: {
            Tak: function () {
                location.href = this.$target.attr('href');
            },
            Anuluj: function () {

            }
        }
    });

    $("a.removePatient").click(function () {
        $row = $(this).closest("tr");    // Find the row
        $row = $row.find('td').slice(0, 5);

        //jc.setContent();
    }).confirm({
        columnClass: 'm',
        theme: 'supervan',
        title: 'Usunąć poniższy rekord?',
        draggable: false,
        content: '',
        onOpenBefore: function () {
            $id = $row.eq(0).html();
            $surname = $row.eq(1).html();
            $name = $row.eq(2).html();
            $pesel = $row.eq(3).html();
            $date = $row.eq(4).html();
            this.setContent("<table class='table'><thead><tr><th>Id</th><th>Nazwisko</th><th>Imię</th><th>PESEL</th><th>Data?</th></tr></thead><tbody class='stick-child-to-left'><tr><td>" + $id + "</td><td>" + $surname + "</td><td>" + $name + "</td><td>" + $pesel + "</td><td>" + $date + "</td></tr></tbody></table>");
        },
        buttons: {
            Tak: function () {
                location.href = this.$target.attr('href');
            },
            Anuluj: function () {

            }
        }
    });

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

    $("a#removeThisEmployee").confirm({
        columnClass: 'l',
        theme: 'supervan',
        title: 'Zwolnić tego pracownika?',
        draggable: false,
        content: '',
        buttons: {
            Tak: function () {
                location.href = this.$target.attr('href');
            },
            Anuluj: function () {

            }
        }
    });

    $("a#newSalary").confirm({
        columnClass: 'm',
        theme: 'supervan',
        title: 'Wprowadź nową wartość pensji:',
        content: '' +
        '<form action="" class="formName">' +
        '<div class="form-group">' +
        '<!--<label>Enter something here</label>-->' +
        '<input type="text" placeholder="Nowa wartość" class="salary form-control" required />' +
        '</div>' +
        '</form>',
        buttons: {
            formSubmit: {
                text: 'Zmień',
                btnClass: 'btn-blue',
                action: function () {
                    var name = this.$content.find('.salary').val();
                    if (!name) {
                        $.alert('Wprowadź poprawną wartość');
                        return false;
                    }
                    $.confirm({
                        columnClass: 'l',
                        theme: 'supervan',
                        title: 'Potwierdź zmiany',
                        draggable: false,
                        content: 'Zmiany zostaną wprowadzone na stałe. Kontynuować?',
                        buttons: {
                            Tak: function () {
                                $('.salary').html(name);
                                toastr.info("Zaktualizowano pensję");
                            },
                            Anuluj: function () {
                                
                            }
                        }
                    });
                }
            },
            Anuluj: function () {
                //close
            },
        },
        onContentReady: function () {
            // bind to events
            var jc = this;
            this.$content.find('form').on('submit', function (e) {
                // if the user submits the form by pressing enter in the field.
                e.preventDefault();
                jc.$$formSubmit.trigger('click'); // reference the button and click it
            });
        }
    });


});

