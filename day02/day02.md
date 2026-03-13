## Pro1

* the use of v-for and v-if and v-bind

```html
<tr align="center" v-for="brand in brands" :key="brand.id">
    <td>{{brand.id / 10}}</td>
    <td>{{brand.brandName}}</td>
    <td>{{brand.companyName}}</td>
    <td>{{brand.ordered}}</td>
    <td>{{brand.description}}</td>
    <td> 
        <span v-if="brand.status == 1" style="color: green;">启用</span>
        <span v-else style="color: red;">禁用</span>
    </td>
    <td><a href="#">修改</a> <a href="#">删除</a></td>
</tr>
```

## Pro2

```javascript
    async mounted() {
        let res = await axios.get('https://mock.apifox.cn/m1/3128855-0-default/student');
        this.students = res.data.data;
    }
```

## Pro3

* the use of v-model

```html
<input type="text" placeholder="姓名" v-model="searchEmp.name" />

<select v-model="searchEmp.gender">
    <option value="">性别</option>
    <option value="1">男</option>
    <option value="2">女</option>
</select>
```
* the serach of axios

```javascript
createApp({
      data() {
        return {
          searchEmp:{
            name: '',
            gender: '',
            job: ''
          },
          empList: []
        }
      },
      methods: {
        async search() {
            let res = await axios.get('https://web-server.itheima.net/emps/list?name=' + this.searchEmp.name + '&gender=' + this.searchEmp.gender + '&job=' + this.searchEmp.job);
            this.empList = res.data.data;
        },
        clear() {
          this.searchEmp = {
            name: '',
            gender: '',
            job: ''
          };
          this.search();
        }

      },
      mounted() {
        this.search();
      }
    }).mount('#container')
```