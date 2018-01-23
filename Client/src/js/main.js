

var app = new Vue({
  el: '#app',
  data: {
    carsInfo :{

      durum:'',
      fiyat:'',
      km:'',
      marka:'',
      model:'',
      motor_gucu:'',
      resim:'',
      yil:''
    },
    cars :[]
  },
    created() {

this.getData();
    },
    methods : {
      getData : function(){
        {
  // GET /someUrl
  this.$http.get('http://127.0.0.1:8081/cars').then(response => {

    // get body data
    this.cars = response.body;

  }, response => {
    // error callback
  });
}
      },
      deleteCar : function(id) {
       {
  // GET /someUrl?foo=bar
  this.$http.delete('http://127.0.0.1:8081/cars', {params: {id: id}}).then(response => {
    alert('silme basarili');
    this.getData();
  }, response => {
    alert('silme basarisiz');
  });
}
      },
       addCar : function() {
       {
  // GET /someUrl?foo=bar
  this.$http.delete('http://127.0.0.1:8081/cars', {params: {id: id}}).then(response => {
    alert('silme basarili');
    this.getData();
  }, response => {
    alert('silme basarisiz');
  });
}
      }
    }
})

new Vue({
  el: '#app2',
  data: {
    carsInfo :{

      durum:'',
      fiyat:'',
      km:'',
      marka:'',
      model:'',
      motor:'',
      resim:'',
      yil:''
    }
  },
  methods: {
      submitData: function() {
      
            this.$http.post('http://127.0.0.1:8081/cars', JSON.stringify(this.carsInfo));
              alert('Kayıt Başarılı!');
        }
  }
})
