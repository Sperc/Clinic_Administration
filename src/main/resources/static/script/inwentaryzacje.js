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
        title: 'Usunąć poniższy rekord?',
        draggable: false,
        content: '',
        onOpenBefore: function () {
            $id = $row.eq(0).html();
            $surname = $row.eq(1).html();
            $name = $row.eq(2).html();
            $position = $row.eq(3).html();
            $salary = $row.eq(4).html();
            $contractName = $row.eq(5).html();
            $contractWorkTime = $row.eq(6).html();
            this.setContent("<table class='table'><thead><tr><th>Id</th><th>Nazwisko</th><th>Imię</th><th>Stanowski</th><th>Pensja</th><th>Umowa</th><th>Ilość godzin</th></tr></thead><tbody class='stick-child-to-left'><tr><td>" + $id + "</td><td>" + $surname + "</td><td>" + $name + "</td><td>" + $position + "</td><td>" + $salary + "</td><td>" + $contractName + "</td><td>" + $contractWorkTime + "</td></tr></tbody></table>");
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







});

