<!DOCTYPE html>

<?php

    class Mensagem {
        private $nome, $email, $cidade, $mensagem;
        public function getNome(){ return $this->nome; }
        public function setNome($nome) { $this->nome = $nome; }
        public function getEmail(){ return $this->email; }
        public function setEmail($email) { $this->email = $email; }
        public function getCidade(){ return $this->cidade; }
        public function setCidade($cidade) { $this->cidade = $cidade; }
        public function getMensagem(){ return $this->mensagem; }
        public function setMensagem($mensagem) { $this->mensagem = $mensagem; }
        public function __construct($n, $e, $c, $m) {
            $this->setNome($n);
            $this->setEmail($e);
            $this->setSexo($c);
            $this->setMensagem($m);
        }
    }

    // quando houver erros, strlen($erro) > 0; caso contrario, strlen($erro) == 0
    $erro = '';

    // o formulario foi enviado?
    if (isset($_POST['nome'])) {

        // simplifica
        $dados = $_POST;

        // valida os campos
        $erro = '';
        if (strlen($dados['nome']) == 0) $erro .= 'O nome é obrigatório.<br />';
        if (strlen($dados['email']) == 0) $erro .= 'O e-mail é obrigatório.<br />';
        if (strlen($dados['cidade']) == 0) $erro .= 'Informe a cidade.<br />';
        if (strlen($dados['mensagem']) == 0) $erro .= 'O endereço é obrigatória.<br />';

        // se nao tem erro, cria o objeto Mensagem
        if (strlen($erro) == 0)
            $objMensagem =  new Mensagem(
                                $dados['nome'],
                                $dados['email'],
                                $dados['cidade'],
                                $dados['mensagem']
                            );

    }

?>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Title -->
    <title>C.R.E.P.O.R.</title>

    <!-- Favicon -->
    <link rel="icon" href="trans.png">

    <!-- Stylesheet -->
    <link rel="stylesheet" href="style.css">

</head>

<body>
    <!-- Preloader -->
    <div id="preloader">
        <div class="loader"></div>
    </div>

    <!-- **** Header Area Start **** -->
    <header class="header-area">
        <!-- Top Header Area Start -->
        <div class="top-header-area">
            <div class="container h-100">
                <div class="row h-100 align-items-center">
                    <div class="col-6">
                        <div class="top-header-content">
                            <a href="#"><i class="icon_mail"></i> <span>creporifsp@gmail.com</span></a>
                            <a href="#"><i class="icon_phone"></i> <span>(XX)XXXX-XXXX</span></a>
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="top-header-content">
                            <!-- Top Social Area -->
                            <div class="top-social-area ml-auto">
                                <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                               
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Top Header Area End -->

        <!-- Main Header Start -->
        <div class="main-header-area animated">
            <div class="classy-nav-container breakpoint-off">
                <div class="container">
                    <!-- Classy Menu -->
                    <nav class="classy-navbar justify-content-between" id="rehomesNav">

                        <!-- Logo -->
                        <a class="nav-brand" href="./index.html"><img width="200" height="100"  src="linha.png" alt="" ></a>

                        <!-- Navbar Toggler -->
                        <div class="classy-navbar-toggler">
                            <span class="navbarToggler"></span>
                        </div>

                        <!-- Menu -->
                        <div class="classy-menu">
                            <!-- Menu Close Button -->
                            <div class="classycloseIcon">
                                <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                            </div>
                            <!-- Nav Start -->
                            <div class="classynav">
                                <ul id="nav">
                                    <li class="active"><a href="./index.html">Home</a></li>
                                    <li><a href="./pontocoleta.html">Pontos de Coleta</a></li>
                                  
                                    <li><a href="./sobre.html">Desenvolvedores</a></li>
                                </ul>
                                   <div class="contact-btn mt-3 mt-lg-0 ml-3 ml-lg-5">
                                    <a href="www.google.com">Pesquisar</a>
                                </div>
                            </div>

                              
                            </div>
                            <!-- Nav End -->
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </header>
    <!-- **** Header Area End **** -->

    <!-- **** Breadcrumb Area Start **** -->
    <div class="breadcrumb-area bg-img bg-overlay-3 wow fadeInUp" data-wow-delay="200ms" style="background-image: url(fundo.jpg);">
        <div class="container h-100">
            <div class="row h-100 align-items-center">
                <div class="col-12">
                    <div class="breadcrumb-content">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="index.html">Home</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Adicionar Ponto</li>
                            </ol>
                        </nav>
                        <h2 class="page-title">Adicionar Ponto de Coleta</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- **** Breadcrumb Area End **** -->

    <!-- **** About Us Area Start **** -->
    <section class="about-us-area section-padding-100-60">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="about-us-title mb-40 wow fadeInUp" data-wow-delay="200ms">
                        <h2>Adicione um ponto!!!</h2>
                        <p>Preencha as informações do ponto de coleta que você conhece! </p>
                    </div>
                </div>
                <fieldset>

            <form action="" method="POST">

                <p> Nome pessoal: </p>
                <input type="text" name="nome" value="<?= isset($dados['nome']) ? $dados['nome'] : '' ?>" />

                <p> E-mail pessoal : </p>
                <input type="email" name="email" value="<?= isset($dados['email']) ? $dados['email'] : '' ?>" />

                <p> Selecion sua cidade: </p>
                <select name="cidade">
                    <option value="Bragança Paulista" <?= isset($dados['cidade']) && $dados['cidade']=='Bragança Paulista' ? 'selected' : ''; ?>>Bragança Paulista</option>
                    <option value="Piracaia"<?= isset($dados['cidade']) && $dados['cidade']=='Piracaia' ? 'selected' : ''; ?>> Piracaia </option>
                    <option value="Tuiuti"<?= isset($dados['cidade']) && $dados['cidade']=='Tuiuti' ? 'selected' : ''; ?>>Tuiuti</option>
                </select>

                <p> Escreva o endereço (nome do pnto, contato(telefone, e-mail) rua, número, bairro, cep):  </p>
                <textarea name="mensagem" rows="5" cols="50"><?= isset($dados['mensagem']) ? $dados['mensagem'] : ''; ?></textarea>

                <p> <input type="submit" value="Enviar" /> </p>

            </form>
        </fieldset>

        <?php if (isset($_POST['nome'])) { ?>
            <?php if (strlen($erro) > 0) { ?>
                <p style="background-color: red; padding: 25px; color: #fff"><?= $erro; ?></p>
            <?php } else { ?>
                <p style="background-color: black; padding: 25px; color: #fff; border: lightgreen 10px solid;">
                    Mensagem enviada com sucesso:<br />
                    De: <?= $objMensagem->getNome(); ?> (<?= $objMensagem->getCidade(); ?>)<br />
                    E-mail: <?= $objMensagem->getEmail(); ?><br />
                    Endereço::<br />
                    <?= $objMensagem->getMensagem(); ?>
                </p>
        <?php
                }
            }
        ?>

              
    <!-- **** Testimonials Area End **** -->

    <!-- **** Choose Us Area Start **** -->
  
                <!-- Single choose us content -->
                
    <!-- **** Choose Us Area End **** -->

    <!-- **** Partner Area Start **** -->
    <div class="partner-area wow fadeInUp" data-wow-delay="200ms">
        <div class="container">
            <div class="row">
                <div class="col-12">
                   
                </div>
            </div>
        </div>
    </div>
    <!-- **** Partner Area End **** -->

    <!-- **** Footer Area Start **** -->
    <footer class="footer-area bg-img bg-overlay-2 section-padding-100-0" style="background-image: url(img/bg-img/17.jpg);">
        <!-- Main Footer Area -->
        <div class="main-footer-area">
            <div class="container">
                <div class="row justify-content-between">

                    <!-- Footer Widget Area -->
                    <div class="col-12 col-sm-6 col-lg-3">
                        <div class="single-footer-widget mb-80">
                            <!-- Footer Logo -->
                            <a href="#" class="footer-logo"><img width="100" height="50"  src="trans.png" alt=""></a>

                           
                            <!-- Social Info -->
                            <div class="social-info">
                                <a href=""><i class="fa fa-facebook" aria-hidden="true"></i></a>
                               
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                                
                            </div>
                        </div>
                    </div>

                    <!-- Footer Widget Area -->
                    <div class="col-12 col-sm-6 col-lg-3">
                        <div class="single-footer-widget mb-80">
                            <!-- Widget Title -->
                            <h5 class="widget-title">Informações</h5>

                            <!-- Contact Area -->
                            <div class="footer-contact">
                                <p>Phone: <span>(xx) xxxx-xxxx</span></p>
                                <p>Email: <span>creporifsp@gmail.com</span></p>
                               
                            </div>
                        </div>
                    </div>

                    <!-- Footer Widget Area -->
                    <div class="col-12 col-sm-6 col-lg-3">
                        <div class="single-footer-widget mb-80">
                            <!-- Widget Title -->
                            <h5 class="widget-title">Cidades</h5>

                            <!-- Footer Nav -->
                            <ul class="footer-nav d-flex flex-wrap">
                                <li><a href="#"><i class="fa fa-map-marker" aria-hidden="true"></i> Bragança Paulista-SP</a></li>
                                <li><a href="#"><i class="fa fa-map-marker" aria-hidden="true"></i> Piracaia-SP</a></li>
                                <li><a href="#"><i class="fa fa-map-marker" aria-hidden="true"></i> Tuiuti-SP</a></li>
                             </ul>  
                        </div>
                    </div>

                    <!-- Footer Widget Area -->
                    <div class="col-12 col-sm-6 col-lg-3">
                        <div class="single-footer-widget mb-80">
                            <!-- Widget Title -->
                            <h5 class="widget-title">Digite seu e-mail </h5>
                            <p>Para receber mensagens sustentáveis!!!</p>

                            
                            <!-- Newsletter Form -->
                            <form action="index.html" class="nl-form">
                                <input type="email" name="nl-email" class="form-control" placeholder="Enter your email...">
                                <button type="submit"><i class="fa fa-paper-plane" aria-hidden="true"></i></button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Copywrite Area -->
        <div class="copywrite-content">
            <div class="container">
                <div class="row align-items-center">
                    <!-- Copywrite Text -->
                    <div class="col-12 col-sm-6">
                        <div class="copywrite-text">
                            <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
 &copy;<script>document.write(new Date().getFullYear());</script>  <i class="fa fa-heart-o" aria-hidden="true"></i>  <a href="https://colorlib.com" target="_blank"></a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                        </div>
                    </div>

                    <!-- Footer Menu -->
                    <div class="col-12 col-sm-6">
                        <div class="footer-menu">
                            <ul class="nav">
                              <li class="active"><a href="./index.html">Home</a></li>
                                    <li><a href="./pontocoleta.html">Pontos de Coleta</a></li>
                                    
                                    <li><a href="./sobre.html">Desenvolvedores</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- **** Footer Area End **** -->

    <!-- **** All JS Files ***** -->
    <!-- jQuery 2.2.4 -->
    <script src="js/jquery.min.js"></script>
    <!-- Popper -->
    <script src="js/popper.min.js"></script>
    <!-- Bootstrap -->
    <script src="js/bootstrap.min.js"></script>
    <!-- All Plugins -->
    <script src="js/rehomes.bundle.js"></script>
    <!-- Active -->
    <script src="js/default-assets/active.js"></script>

</body>

</html>