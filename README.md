# calculoDescontos

1 - Para desenvolvermos a solução para o problema proposto precisamos usar o padrão Template Method nos descontos, pois cada um deles é implementado de forma semelhante e podem ser filhos de uma classe abstrata onde cada um terá sua própria implementação, e o Singleton na compra do cliente em si mas esse singleton teria que ser criado por requisição, para que cada cliente possua uma instância diferente mas que os descontos, sempre que chamados, acessem a instância em questão.

2 - Poderíamos criar métodos na classe principal e cada um alteraria a compra que está sendo efetuada.

3 - Tornaria o sistema mais suscetível a erros, não obedeceria a boas práticas de programação e tornaria difícil a manutenção do sistema.
