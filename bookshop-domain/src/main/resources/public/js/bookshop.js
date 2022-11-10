$(function () {
  console.log("In set up");
  $('h1')
    .text("Welcome")
    .addClass("title");
  $("h1").click(function () {
    console.log("Clicked on H1");
    $(this)
      .hide()
      .show("slow")
  })
  console.log('Setting up maintain form');
  $("#maintain-form").submit(function(event) {

    let url = "http://localhost:8082/bookshop/addresses";
    let obj = $(this).serializeJSON();
    let data = JSON.stringify(obj);

    $.ajax({
      type: "POST",
      url: url,
      data: data,
      contentType: "application/json; charset=utf-8", // data sent
      dataType: "json" // type of data returned
    });

  });

});

// -------

class Book  {
  constructor(isbn, title, author, genre, publisher, price) {
    this.price = price;
    this.discount = 0.0;
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.publisher = publisher;
  }
  setSaleDiscount(discount) {
    this.discount = discount;
  }
  calculateSalePrice() {
    let discountAmount = this.price * this.discount;
    return this.price - discountAmount;
  }
  // Override default toString method
  toString() {
    return (
      "Book(" +
      this.isbn +
      "," +
      this.title +
      "," +
      this.author +
      "," +
      this.genre +
      "," +
      this.publisher +
      "," +
      this.price +
      "," +
      this.discount +
      "," +
      ")"
    );
  }
}

let books = [
  new Book(1, "JavaScript Unleashed", "Bill Smith", "Technical", "Tech Books", 15.99),
  new Book(1, "JavaScript Server", "Denise Willis", "Technical", "InfoQ", 12.99),
  new Book(
    1,
    "JavaScript Live",
    "John Cooke",
    "Technical",
    "Tech Books",
    14.49
  )
];

function displayBooks() {
  console.log(books)
  $("#books").empty();
  $.each(books, function (i, book) {
    console.log(i, book);
    let html = "<div class='book'>";
    html += "<h3 class='title'>" + book.title + "</h3>";
    html += "Author: " + book.author;
    html += "<br>Publisher: " + book.publisher;
    html += "<br>Price: " + book.price;
    html += "</div>";
    $("#books").append($(html));
  });
}


function displayAddresses() {
  console.log("displayAddresses");
  $.get("http://localhost:8082/bookshop/addresses", function (addresses) {
    console.log(addresses);
    $("#addresses").empty();
    let html = "<div class='addresses'>";
    $.each(addresses, function (i, address) {
      console.log(address);
      html += "<h3 class='title'>" + address.id + "</h3>";
      html += "<ul>"
      html += "<li>number: " + address.number + "</li>";
      html += "<li>street: " + address.street + "</li>";
      html += "<li>city: " + address.city + "</li>";
      html += "<li>county: " + address.county + "</li>";
      html += "<li>postcode: " + address.postcode + "</li>";
      html += "</ul>"
    });
    html += "</div>";
    $("#addresses").append($(html));
  });
}
