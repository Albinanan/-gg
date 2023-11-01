<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <script>
        class  Baza {
  constructor() {
    this.Category = [
      { category_id: 1, name: "clothes" },
      { category_id: 2, name: "vegetables" },
      { category_id: 3, name: "fruits" },
      { category_id: 4, name: "drinks" },
      { category_id: 5, name: "shoes" },
    ]

    this.Product = [
      { product_id: 1, name: "t-shirts", seller_id: 1, category_id: 3,id_brand: 1},
      {  product_id: 2, name: "zucchini",  seller_id: 2, category_id: 3, id_brand: 2 },
      {  product_id: 3, name: "banana",  seller_id: 2, category_id: 1,id_brand: 3 },
      {  product_id: 4, name: "juice",  seller_id: 1, category_id: 2,id_brand: 4 },
      {  product_id: 5, name: "velvet_traction",  seller_id: 1, category_id: 1,id_brand: 5},
    ]


    this.Saler = [
      { saler_id: 1, name: "Sasha" },
      { saler_id: 2, name: "Vasya" },
      { saler_id: 3, name: "Pety" },
      { saler_id: 4, name: "Lexa" },
      { saler_id: 5, name: "Myxamad" },
    ]

    this.Brand = [
      { id_brand: 1, name: "Gusi" },
      { id_brand: 2, name: "Y_Myxamada" },
      { id_brand: 3, name: "Y_Pety" },
      { id_brand: 4, name: "Lexidink" },
      { id_brand: 5, name: "Chyrkin_mir" },
    ]
  }

  findById(id) {

  let str = ""
  const product = this.Product.find( product =>  product.product_id == id)
 
  str = str + product.product_id + " " + product.name

  const seller = this.Saler.find(seller => seller.saler_id === product.seller_id)
  str += " " + seller.name
  // console.log(seller)
  const brand = this.Brand.find(brand => brand.id_brand === product.id_brand )
  str += " " + brand.id_brand 


  const category = this.Category.find(category => category.category_id === product.category_id)
  str += " " + category.category_id

  return str

}
        }
const db = new Baza();
console.log(db.findById(3))




  </script>
</body>
</html>
