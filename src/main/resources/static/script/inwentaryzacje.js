$(function () {



    var Item = function (code, name, unit, quantity, unitprice, value, comments) {
        var self = this;

        self.code = ko.observable(code);
        self.name = ko.observable(name);
        self.unit = ko.observable(unit);
        self.quantity = ko.observable(quantity);
        self.unitprice = ko.observable(unitprice);
        self.value = ko.observable(value);
        self.comments = ko.observable(comments);
    }

    var ViewModel = function () {
        var self = this;
        self.dateIn = ko.observable('');
        self.madeBy = ko.observable('');
        self.ItemToAdd = ko.observable(new Item());
        self.Items = ko.observableArray([]);

        self.addItem = function (item) {
            self.Items.push(item);
            self.ItemToAdd(new Item());
            $("#addButton").click(function () {
                $('html, body').animate({
                    scrollTop: $("#addButton").offset().bottom
                }, 100);
            });
            toastr.info("dziala");
        }

        self.removeItem = function () {
            self.Items.remove(this);
        }

    }

    //var ms = new ViewModel();

    //ko.applyBindings(ms);
 /*
vm = new ViewModel();
 ko.applyBindings(vm);*/
    $("#sendButton").click(function () {
        console.log(ko.toJSON(ms));
    });

});

