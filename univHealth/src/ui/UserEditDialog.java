package ui;

import health.User;
import health.UserMgr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class UserEditDialog extends JDialog {
	private JTextField nameField, heightField, genderField, weightField, targetWeightField;

	public UserEditDialog(User user) {
		setLayout(new GridLayout(6, 2));

		nameField = new JTextField(user.getName());
		heightField = new JTextField(String.valueOf(user.height));
		genderField = new JTextField(user.gender);
		weightField = new JTextField(String.valueOf(user.weight));
		targetWeightField = new JTextField(String.valueOf(user.goal));

		add(new JLabel("이름: "));
		add(nameField);
		add(new JLabel("키: "));
		add(heightField);
		add(new JLabel("성별: "));
		add(genderField);
		add(new JLabel("몸무게: "));
		add(weightField);
		add(new JLabel("목표체중: "));
		add(targetWeightField);

		JButton saveButton = new JButton("저장");
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				user.name = nameField.getText();
				user.height = Double.parseDouble(heightField.getText());
				user.gender = genderField.getText();
				user.weight = Double.parseDouble(weightField.getText());
				user.goal = Integer.parseInt(targetWeightField.getText());

				UserMgr.getInstance().updateUser(user);

				dispose();
			}
		});
		setLocationRelativeTo(null);
		add(new JLabel(""));
		add(saveButton);
	}
}
