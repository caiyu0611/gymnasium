    new Vue({
        el:"#app",
        data:{
            userList:[],
            pageNum: 1,
            pageSize: 5,
            total:0
        },
        created:function (){
            //先是执行的函数内容  类似js中的 window.location
            this.getUsersByPage();
        },
        methods: {
            getUsersByPage:function(){
                axios({
                    url:"/user/selectUserByPage",
                    method:"POST",
                    params:{
                        pageNum:this.pageNum,
                        pageSize:this.pageSize
                    }
                }).then((result)=>{
                    console.log(result);
                    this.userList = result.data.data;
                    this.total = result.data.total;
                })
            },

            currentChange:function (newPageNum){
                this.pageNum = newPageNum;
                this.getUsersByPage();
            },

            sizeChange:function (newPageSize){
                this.pageSize = newPageSize;
                this.getUsersByPage();
            }
        }
    })