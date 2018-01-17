$(function() {
            var $testForm = $('#testForm')
            /*AJAX
             **/
            var $menu = $("#menu")
            var $content = $("#content")
                
                $menu.find('.add').on('click', function() {
                    // 发起一个加载局部页面的请求
                    // 第一个参数是url，请求路径
                    // 第二个参数是data，发送数据，可选
                    // 第三个参数是callback，回调函数
                    $content.load('userForm.jsp')
                })

                $testForm.on('submit', function() {

                    /*输入判定
                     **/
                    // 获取用户名
                    var username = $testForm.find('input[name="userModel.name"]')
                    // 获取密码
                    var password = $testForm.find('input[name="userModel.password"]')
                    var repeatPassword = $testForm.find('input[name="userModel.rePassword"]')
                    var email = $testForm.find('input[name="userModel.email"]')

                    // 非空验证
                    if (username.val() === '') {
                        alert('请输入用户名')
                        return false
                    }

                    if (password.val() === '') {
                        alert('请输入密码')
                        return false
                    }

                    if (repeatPassword.val() === '') {
                        alert('请输入重复密码')
                        return false
                    }

                    if (email.val() === '') {
                        alert('请输入邮箱')
                        return false
                    }

                    if (username.val().length < 6 || username.val().length > 20) {
                        alert("用户名长度在6-20个字符之间");
                        return false;
                    }
                    if (password.val().length < 6 || password.val().length > 20 || repeatPassword.val().length < 6 || repeatPassword.val().length > 20) {
                        alert("密码长度在6-20个字符之间");
                        return false;
                    }
                    if (password.val() != repeatPassword.val()) {
                        alert("两次密码不一致");
                        return false;
                    }
                })
            })