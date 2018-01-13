$(function () {


    /*var ViewModel = function() {
     var self = this;
      self.items = ko.observableArray([{comment:'first comment', amount:0}]);
      self.addNewItem = function(){
        self.items.push(new Item('',0));
      };
 }
  
 var Item = function(comment, amount) {
  var self = this;
  self.comment = ko.observable(comment);
  self.amount = ko.observable(amount);   
  }; */


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
            //ko.utils.arrayPushAll(self.ReverseItems, self.Items);
            //self.ReverseItems = self.Items.reverse();
            //console.log(ko.toJSON(self.ReverseItems));
            toastr.info("dziala");
        }

        self.removeItem = function () {
            self.Items.remove(this);
        }

    }

    var ms = new ViewModel();

    ko.applyBindings(ms);
 /*
vm = new ViewModel();
 ko.applyBindings(vm);*/
    $("#sendButton").click(function () {
        console.log(ko.toJSON(ms));
    });

    $('a#goback').confirm({
        theme: 'supervan',
        title: 'Powrót',
        draggable: false,
        content: 'Wszystkie zmiany zostaną utracone. Jesteś pewny?',
        buttons: {
            Tak: function () {
                location.href = this.$target.attr('href');
            },
            Anuluj: function () {

            }
        }
    });

    $("a#newSalary").confirm({
        title: 'Prompt!',
        content: '' +
        '<form action="" class="formName">' +
        '<div class="form-group">' +
        '<label>Enter something here</label>' +
        '<input type="text" placeholder="Your name" class="name form-control" required />' +
        '</div>' +
        '</form>',
        buttons: {
            formSubmit: {
                text: 'Submit',
                btnClass: 'btn-blue',
                action: function () {
                    var name = this.$content.find('.name').val();
                    if (!name) {
                        $.alert('provide a valid name');
                        return false;
                    }
                    $.alert('Your name is ' + name);
                }
            },
            cancel: function () {
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

