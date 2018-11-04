package View;

import Controller.CozinheiroController;
import Controller.PedidoController;
import Controller.EntregaController;
import Model.Produto;
import Model.Cozinheiro;
import javax.swing.JOptionPane;

public class ProdutoView extends javax.swing.JFrame {
    

    PedidoController pedidoController;
    int flag; //0-novo, 1-editar
    int cozinhando1, cozinhando2, cozinhando3;
    
    CozinheiroController cozinheiroController;
    EntregaController entregaController;
    
    // Metodo construtor
    public ProdutoView() {
        super("Cadastro de Produtos");
        initComponents();
        configuraTela("inicio");
        flag=0;
        cozinhando1 = 0;
        cozinhando2 = 0;
        cozinhando3 = 0;
        pedidoController = new PedidoController();
        cozinheiroController = new CozinheiroController();
        entregaController = new EntregaController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelBotoes = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        painelDados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cPedido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cPreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cQtd = new javax.swing.JTextField();
        btOk = new javax.swing.JButton();
        painelConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cEntrega = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        cConsulta = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        cCozinheiro3 = new javax.swing.JTextArea();
        btnCozinhar3 = new javax.swing.JButton();
        btnCozinhar2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        cCozinheiro2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        cCozinheiro1 = new javax.swing.JTextArea();
        btEntrega = new javax.swing.JButton();
        btnCozinhar1 = new javax.swing.JButton();
        btnPronto2 = new javax.swing.JButton();
        btnPronto1 = new javax.swing.JButton();
        btnPronto3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Pedidos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(344, 344, 344))
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btNovo)
                .addComponent(btPesquisar)
                .addComponent(btEditar)
                .addComponent(btSalvar)
                .addComponent(btDeletar)
                .addComponent(btLimpar)
                .addComponent(btCancelar))
        );

        jLabel2.setText("Id:");

        jLabel3.setText("Pedido");

        jLabel4.setText("Valor:");

        jLabel5.setText("Quantidade:");

        btOk.setText("Ok");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cPreco))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cId, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addComponent(cQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cQtd)
                            .addComponent(btOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        cEntrega.setColumns(20);
        cEntrega.setRows(5);
        jScrollPane1.setViewportView(cEntrega);

        cConsulta.setColumns(20);
        cConsulta.setRows(5);
        jScrollPane2.setViewportView(cConsulta);

        cCozinheiro3.setColumns(20);
        cCozinheiro3.setRows(5);
        jScrollPane4.setViewportView(cCozinheiro3);

        btnCozinhar3.setText("Cozinhar 3");
        btnCozinhar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCozinhar3ActionPerformed(evt);
            }
        });

        btnCozinhar2.setText("Cozinhar 2");
        btnCozinhar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCozinhar2ActionPerformed(evt);
            }
        });

        cCozinheiro2.setColumns(20);
        cCozinheiro2.setRows(5);
        jScrollPane5.setViewportView(cCozinheiro2);

        cCozinheiro1.setColumns(20);
        cCozinheiro1.setRows(5);
        jScrollPane6.setViewportView(cCozinheiro1);

        btEntrega.setText("Entrega");
        btEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntregaActionPerformed(evt);
            }
        });

        btnCozinhar1.setText("Cozinhar 1");
        btnCozinhar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCozinhar1ActionPerformed(evt);
            }
        });

        btnPronto2.setText("Pronto");
        btnPronto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPronto2ActionPerformed(evt);
            }
        });

        btnPronto1.setText("Pronto");
        btnPronto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPronto1ActionPerformed(evt);
            }
        });

        btnPronto3.setText("Pronto");
        btnPronto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPronto3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConsultaLayout = new javax.swing.GroupLayout(painelConsulta);
        painelConsulta.setLayout(painelConsultaLayout);
        painelConsultaLayout.setHorizontalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConsultaLayout.createSequentialGroup()
                        .addComponent(btnCozinhar1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPronto1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConsultaLayout.createSequentialGroup()
                        .addComponent(btnCozinhar2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPronto2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConsultaLayout.createSequentialGroup()
                        .addComponent(btnCozinhar3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPronto3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaLayout.createSequentialGroup()
                        .addComponent(btEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addContainerGap())
            .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelConsultaLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(659, Short.MAX_VALUE)))
        );
        painelConsultaLayout.setVerticalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCozinhar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPronto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConsultaLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCozinhar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPronto2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCozinhar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPronto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)))
            .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelConsultaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1002, 643));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        configuraTela("novo");
        cPedido.requestFocus();
        this.flag=0;
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(this.flag==0){
            if(!pedidoController.insere(cPedido.getText(),
                              cPreco.getText(),
                              cQtd.getText()))
            {
                JOptionPane.showMessageDialog(null,"Erro!");
            }
        } else {
            if(!pedidoController.edita(cId.getText(),
                              cPedido.getText(),
                              cPreco.getText(),
                              cQtd.getText()))
            {
                JOptionPane.showMessageDialog(null,"Erro!");
            }
        }
        cConsulta.setText(pedidoController.mostraTudo());
        limpardados();
        configuraTela("inicio");
    }//GEN-LAST:event_btSalvarActionPerformed

    private void limpardados(){
        cPedido.setText("");
        cPreco.setText("");
        cQtd.setText("");
    }
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpardados();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        configuraTela("pesquisar");
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        configuraTela("inicio");
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        String id = cId.getText();
        btOkActionPerformed(id);
    }//GEN-LAST:event_btOkActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        configuraTela("editar");
        this.flag=1;
    }//GEN-LAST:event_btEditarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        String id = cId.getText();
        btDeletarActionPerformed(id);
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btnCozinhar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCozinhar3ActionPerformed
        if(this.cozinhando3 == 0) {            
            if (cozinheiroController.pesquisa(50) == null){
                if(!cozinheiroController.insereDadosCozinheiro(50, "Joselino", pedidoController.pegaPedido()))
                {
                    JOptionPane.showMessageDialog(null,"Erro!");
                }
            }
            
            String newPedido = pedidoController.pegaPedido();
            if (!newPedido.equals("")){
                cozinheiroController.cozinhaNovoPedido(newPedido, 50);
                cCozinheiro3.setText(cozinheiroController.mostraTudo(50));
                String textoPedido[] = cozinheiroController.pegaPedido(50).split(" ");
                btDeletarActionPerformed(textoPedido[0]);
                this.cozinhando3 = 1;
            } else {                
                cCozinheiro3.setText("Não há pedido para ser produzido!");
            }

        } else {
            cCozinheiro3.setText(cozinheiroController.mostraTudo(50) + "\n\n" + "O pedido está em produção!");
        }
    }//GEN-LAST:event_btnCozinhar3ActionPerformed

    private void btnCozinhar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCozinhar2ActionPerformed
        if(this.cozinhando2 == 0) {            
            if (cozinheiroController.pesquisa(10) == null){
                if(!cozinheiroController.insereDadosCozinheiro(10, "Sr. Andriolli", pedidoController.pegaPedido()))
                {
                    JOptionPane.showMessageDialog(null,"Erro!");
                }
            }
            
            String newPedido = pedidoController.pegaPedido();
            if (!newPedido.equals("")){
                cozinheiroController.cozinhaNovoPedido(newPedido, 10);
                cCozinheiro2.setText(cozinheiroController.mostraTudo(10));
                String textoPedido[] = cozinheiroController.pegaPedido(10).split(" ");
                btDeletarActionPerformed(textoPedido[0]);
                this.cozinhando2 = 1;
            } else {                
                cCozinheiro2.setText("Não há pedido para ser produzido!");
            }

        } else {
            
            cCozinheiro2.setText(cozinheiroController.mostraTudo(10) + "\n\n" + "O pedido está em produção!");
        }
    }//GEN-LAST:event_btnCozinhar2ActionPerformed

    private void btEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntregaActionPerformed
        if (entregaController.mostraTudo() != "") {
            entregaController.delete();
            cEntrega.setText(entregaController.mostraTudo());
            JOptionPane.showMessageDialog(null, "Pedido foi entregue!");
        } else {
            cEntrega.setText("Não há produto para ser entregue");
        }
    }//GEN-LAST:event_btEntregaActionPerformed

    private void btnCozinhar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCozinhar1ActionPerformed

        if(this.cozinhando1 == 0) {            
            if (cozinheiroController.pesquisa(23) == null){
                if(!cozinheiroController.insereDadosCozinheiro(23, "Joselino", pedidoController.pegaPedido()))
                {
                    JOptionPane.showMessageDialog(null,"Erro!");
                }
            }
            
            String newPedido = pedidoController.pegaPedido();
            if (!newPedido.equals("")){
                cozinheiroController.cozinhaNovoPedido(newPedido, 23);
                cCozinheiro1.setText(cozinheiroController.mostraTudo(23));
                String textoPedido[] = cozinheiroController.pegaPedido(23).split(" ");
                btDeletarActionPerformed(textoPedido[0]);
                this.cozinhando1 = 1;
            } else {                
                cCozinheiro1.setText("Não há pedido para ser produzido!");
            }

        } else {
            cCozinheiro1.setText(cozinheiroController.mostraTudo(23) + "\n\n" + "O pedido está em produção!");
        }
    }//GEN-LAST:event_btnCozinhar1ActionPerformed

    private void btnPronto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPronto2ActionPerformed
        if (cozinheiroController.pegaPedido(10) == "") {
            cCozinheiro2.setText("Não há pedido em produção!");
        } else {
            entregaController.insere(cozinheiroController.pegaPedido(10));
            cEntrega.setText(entregaController.mostraTudo());
            cozinheiroController.cozinhaNovoPedido("", 10);
            cCozinheiro2.setText("");
            this.cozinhando2 = 0;
        }
    }//GEN-LAST:event_btnPronto2ActionPerformed

    private void btnPronto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPronto1ActionPerformed
        if (cozinheiroController.pegaPedido(23) == "") {
            cCozinheiro1.setText("Não há pedido em produção!");
        } else {
            entregaController.insere(cozinheiroController.pegaPedido(23));
            cEntrega.setText(entregaController.mostraTudo());
            cozinheiroController.cozinhaNovoPedido("", 23);
            cCozinheiro1.setText("");
            this.cozinhando1 = 0;
        }
    }//GEN-LAST:event_btnPronto1ActionPerformed

    private void btnPronto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPronto3ActionPerformed
        if (cozinheiroController.pegaPedido(50) == "") {
            cCozinheiro3.setText("Não há pedido em produção!");
        } else {
            entregaController.insere(cozinheiroController.pegaPedido(50));
            cEntrega.setText(entregaController.mostraTudo());
            cozinheiroController.cozinhaNovoPedido("", 50);
            cCozinheiro3.setText("");
            this.cozinhando3 = 0;
        }
    }//GEN-LAST:event_btnPronto3ActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }
    
    public void configuraTela(String modo){
        if(modo=="inicio"){
            btNovo.setEnabled(true);
            btPesquisar.setEnabled(true);
            btEditar.setEnabled(false);
            btSalvar.setEnabled(false);
            btDeletar.setEnabled(false);
            btLimpar.setEnabled(false);
            btCancelar.setEnabled(true);
            btOk.setVisible(false);
            cId.setEditable(false);
            cPedido.setEditable(false);
            cPreco.setEditable(false);
            cQtd.setEditable(false);
            cEntrega.setEditable(false);
        } else {
            if(modo=="novo"){
                btNovo.setEnabled(false);
                btPesquisar.setEnabled(false);
                btEditar.setEnabled(false);
                btSalvar.setEnabled(true);
                btDeletar.setEnabled(false);
                btLimpar.setEnabled(true);
                btCancelar.setEnabled(true);
                btOk.setVisible(false);
                cId.setEditable(false);
                cPedido.setEditable(true);
                cPreco.setEditable(true);
                cQtd.setEditable(true);
                cEntrega.setEditable(false);
            }
            else if(modo=="pesquisar"){
                btNovo.setEnabled(false);
                btPesquisar.setEnabled(false);
                btEditar.setEnabled(false);
                btSalvar.setEnabled(false);
                btDeletar.setEnabled(false);
                btLimpar.setEnabled(true);
                btCancelar.setEnabled(true);
                btOk.setVisible(true);
                cId.setEditable(true);
                cPedido.setEditable(false);
                cPreco.setEditable(false);
                cQtd.setEditable(false);
                cEntrega.setEditable(false);
            } else if(modo=="ok"){
                btNovo.setEnabled(false);
                btPesquisar.setEnabled(false);
                btEditar.setEnabled(true);
                btSalvar.setEnabled(false);
                btDeletar.setEnabled(true);
                btLimpar.setEnabled(false);
                btCancelar.setEnabled(true);
                btOk.setVisible(true);
                cId.setEditable(true);
                cPedido.setEditable(false);
                cPreco.setEditable(false);
                cQtd.setEditable(false);
                cEntrega.setEditable(false);
            } else if(modo=="editar"){
                btNovo.setEnabled(false);
                btPesquisar.setEnabled(false);
                btEditar.setEnabled(false);
                btSalvar.setEnabled(true);
                btDeletar.setEnabled(false);
                btLimpar.setEnabled(true);
                btCancelar.setEnabled(true);
                btOk.setVisible(false);
                cId.setEditable(false);
                cPedido.setEditable(true);
                cPreco.setEditable(true);
                cQtd.setEditable(true);
                cEntrega.setEditable(false);
            }
        }
    }
    
    private void btOkActionPerformed(String id) {
        Produto p = pedidoController.pesquisa(Integer.parseInt(id));
        if(p!=null){
            cPedido.setText(p.getNome());
            cPreco.setText(String.valueOf(p.getPreco()));
            cQtd.setText(String.valueOf(p.getQuantidade()));
        }
        configuraTela("ok");
    }

    private void btDeletarActionPerformed(String id) {
        pedidoController.delete(id);
        cConsulta.setText(pedidoController.mostraTudo());
        limpardados();
        configuraTela("inicio");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEntrega;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btnCozinhar1;
    private javax.swing.JButton btnCozinhar2;
    private javax.swing.JButton btnCozinhar3;
    private javax.swing.JButton btnPronto1;
    private javax.swing.JButton btnPronto2;
    private javax.swing.JButton btnPronto3;
    private javax.swing.JTextArea cConsulta;
    private javax.swing.JTextArea cCozinheiro1;
    private javax.swing.JTextArea cCozinheiro2;
    private javax.swing.JTextArea cCozinheiro3;
    private javax.swing.JTextArea cEntrega;
    private javax.swing.JTextField cId;
    private javax.swing.JTextField cPedido;
    private javax.swing.JTextField cPreco;
    private javax.swing.JTextField cQtd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelConsulta;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelTitulo;
    // End of variables declaration//GEN-END:variables

}
