/**
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package richtercloud.document.scanner.gui.storageconf;

import richtercloud.reflection.form.builder.jpa.storage.PostgresqlAutoPersistenceStorageConf;

/**
 *
 * @author richter
 */
public class PostgresqlAutoPersistenceStorageConfPanel extends StorageConfPanel<PostgresqlAutoPersistenceStorageConf> {
    private static final long serialVersionUID = 1L;
    private final PostgresqlAutoPersistenceStorageConf storageConf;

    public PostgresqlAutoPersistenceStorageConfPanel(PostgresqlAutoPersistenceStorageConf storageConf) {
        initComponents();
        if(storageConf == null) {
            throw new IllegalArgumentException("storageConf mustn't be null");
        }
        this.storageConf = storageConf;
        this.databaseNameTextField.setText(storageConf.getDatabaseName());
        this.databaseDirTextField.setText(storageConf.getDatabaseDir());
        this.hostnameTextField.setText(storageConf.getHostname());
        this.portSpinner.setValue(storageConf.getPort());
        this.usernameTextField.setText(storageConf.getUsername());
        this.initdbBinaryPathTextField.setText(storageConf.getInitdbBinaryPath());
        this.postgresBinaryPathTextField.setText(storageConf.getPostgresBinaryPath());
    }

    @Override
    public PostgresqlAutoPersistenceStorageConf getStorageConf() {
        return this.storageConf;
    }

    @Override
    public void save() {
        this.storageConf.setDatabaseName(this.databaseNameTextField.getText());
        this.storageConf.setDatabaseDir(this.databaseDirTextField.getText());
        this.storageConf.setHostname(this.hostnameTextField.getText());
        this.storageConf.setPort((int) this.portSpinner.getValue());
        String username = this.usernameTextField.getText();
        this.storageConf.setUsername(username);
        String password = String.valueOf(this.passwordPasswordField.getPassword());
        this.storageConf.setPassword(password);
        this.storageConf.setInitdbBinaryPath(this.initdbBinaryPathTextField.getText());
        this.storageConf.setPostgresBinaryPath(this.postgresBinaryPathTextField.getText());
    }

    @Override
    public void cancel() {
        //do nothing
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        databaseNameTextField = new javax.swing.JTextField();
        databaseNameTextFieldLabel = new javax.swing.JLabel();
        hostnameTextField = new javax.swing.JTextField();
        hostnameTextFieldLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordPasswordField = new javax.swing.JPasswordField();
        portSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        databaseDirTextField = new javax.swing.JTextField();
        databaseDirTextFieldLabel = new javax.swing.JLabel();
        initdbBinaryPathTextField = new javax.swing.JTextField();
        postgresBinaryPathTextField = new javax.swing.JTextField();
        initdbBinaryPathTextFieldLabel = new javax.swing.JLabel();
        postgresBinaryPathTextFieldLabel = new javax.swing.JLabel();

        databaseNameTextFieldLabel.setText("Database name");

        hostnameTextFieldLabel.setText("Hostname");

        usernameLabel.setText("Username");

        passwordLabel.setText("Password");

        passwordPasswordField.setText("jPasswordField1");

        jLabel1.setText("Port");

        databaseDirTextFieldLabel.setText("Database directory");

        initdbBinaryPathTextFieldLabel.setText("initdb binary path");

        postgresBinaryPathTextFieldLabel.setText("postgres binary path");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(databaseNameTextFieldLabel)
                    .addComponent(hostnameTextFieldLabel)
                    .addComponent(jLabel1)
                    .addComponent(usernameLabel)
                    .addComponent(passwordLabel)
                    .addComponent(databaseDirTextFieldLabel)
                    .addComponent(initdbBinaryPathTextFieldLabel)
                    .addComponent(postgresBinaryPathTextFieldLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(databaseDirTextField)
                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addComponent(usernameTextField)
                    .addComponent(portSpinner)
                    .addComponent(hostnameTextField)
                    .addComponent(databaseNameTextField)
                    .addComponent(initdbBinaryPathTextField)
                    .addComponent(postgresBinaryPathTextField))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(databaseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(databaseNameTextFieldLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(databaseDirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(databaseDirTextFieldLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostnameTextFieldLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initdbBinaryPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initdbBinaryPathTextFieldLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postgresBinaryPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postgresBinaryPathTextFieldLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField databaseDirTextField;
    private javax.swing.JLabel databaseDirTextFieldLabel;
    private javax.swing.JTextField databaseNameTextField;
    private javax.swing.JLabel databaseNameTextFieldLabel;
    private javax.swing.JTextField hostnameTextField;
    private javax.swing.JLabel hostnameTextFieldLabel;
    private javax.swing.JTextField initdbBinaryPathTextField;
    private javax.swing.JLabel initdbBinaryPathTextFieldLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordPasswordField;
    private javax.swing.JSpinner portSpinner;
    private javax.swing.JTextField postgresBinaryPathTextField;
    private javax.swing.JLabel postgresBinaryPathTextFieldLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
