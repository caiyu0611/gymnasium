new Vue({
    el:"#app",
    data:{
        //数据设置默认
        insertUserData:{
            name:undefined,
            password:undefined,
            sex:undefined,
            phone:undefined,
            email:undefined,
        },
        //添加数据校验
        formRules:{
            name:[
                {required:true,message:"用户姓名必须填写",trigger:"blur"},
                {min:2,max:10,message: "用户名2-10中文",trigger: "blur"}
            ],
            password:[
                {required:true,message:"密码必须填写",trigger:"blur"},
                {min:2,max:10,message: "密码6位数字组成",trigger: "blur"}
            ],
            sex:[
                {required:true,message:"性别必须填写",trigger:"blur"},
            ],
            phone:[
                {required:true,message:"手机号必须填写",trigger:"blur"},
                {min:2,max:10,message: "手机号格式错误",trigger: "blur"}
            ],
            email:[
                {required:true,message:"邮箱必须填写",trigger:"blur"},
            ],

        }
    },
    methods: {
        //点击立即注册按钮时
        insertUserOk:function (){
            //先校验数据是否正确
            this.$refs['insertUserRef'].validate((valid)=>{
                //如果数据正确
                if (valid){
                    //向后台发出请求
                    axios({
                        url:"/user/insertUser",
                        method:"POST",
                        params:this.insertUserData
                    }).then((result)=>{
                        let code = result.data.code;
                        if (code == 200){
                            //提示注册成功
                            this.$notify({
                                message:"注册成功"
                            });
                            //跳转到登陆页面
                            window.location.href="/views/login.html";
                        }else{
                            let msg=result.data.msg;
                            //添加失败
                            this.$notify({
                                message:msg+"注册失败",
                            })
                        }
                    })
                }
            })
        }
    }
})

