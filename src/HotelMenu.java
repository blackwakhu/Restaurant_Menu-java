import javax.swing.*;
import java.awt.*;

public class HotelMenu {
    private final String quantity[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private String ordered_items = "ordered:\n=>";
    private int total_cost = 0;
    private int quantity_count = 0;

    public static void main(String[] args){
        new HotelMenu();
    }

    public HotelMenu(){
        JFrame frame = new JFrame("Nice Restaurant menu");

        JPanel mainPanel = new JPanel();
        JPanel panel = new JPanel();
        JPanel labelpanel = new JPanel();
        JPanel footerpanel = new JPanel();

        JLabel label = new JLabel("welcome to Nice Restaurant choose what you want?");

        JLabel label1 = new JLabel("item \t cost");
        JLabel label2 = new JLabel("quantity");

        JLabel label3 = new JLabel("breakfast");
        JLabel label4 = new JLabel("main dishes");
        JLabel label5 = new JLabel("refreshments and dessert");

        JLabel label6 = new JLabel("total:$ 0.00");

        JCheckBox tea = new JCheckBox("tea\t@$10");
        JCheckBox coffee = new JCheckBox("coffee\t@$15");
        JCheckBox capuccino = new JCheckBox("capuccino\t@$20");
        JCheckBox scones = new JCheckBox("scones\t@$5");
        JCheckBox cake = new JCheckBox("cake\t@$10");
        JCheckBox cupcakes = new JCheckBox("cupcakes\t@$5");

        JComboBox tea_combo = new JComboBox(quantity);
        JComboBox coffee_combo = new JComboBox(quantity);
        JComboBox capuccino_combo = new JComboBox(quantity);
        JComboBox scones_combo = new JComboBox(quantity);
        JComboBox cake_combo = new JComboBox(quantity);
        JComboBox cupcakes_combo = new JComboBox(quantity);

        JCheckBox pizza = new JCheckBox("pizza\t@$15");
        JCheckBox lobster = new JCheckBox("lobster\t@$15");
        JCheckBox fish = new JCheckBox("fish\t@$10");
        JCheckBox greens = new JCheckBox("greens\t@$5");
        JCheckBox cheese = new JCheckBox("cheese\t@$8");
        JCheckBox french_fries = new JCheckBox("french fries\t@$7");
        JCheckBox burger = new JCheckBox("burger\t@$5");
        JCheckBox hot_dog = new JCheckBox("hot dog\t@$7");
        JCheckBox kebab = new JCheckBox("kebab\t@$7");
        JCheckBox salad = new JCheckBox("salad\t@8");

        JComboBox pizza_combo = new JComboBox(quantity);
        JComboBox lobster_combo = new JComboBox(quantity);
        JComboBox fish_combo = new JComboBox(quantity);
        JComboBox greens_combo = new JComboBox(quantity);
        JComboBox cheese_combo = new JComboBox(quantity);
        JComboBox french_fries_combo = new JComboBox(quantity);
        JComboBox burger_combo = new JComboBox(quantity);
        JComboBox hot_dog_combo = new JComboBox(quantity);
        JComboBox kebab_combo = new JComboBox(quantity);
        JComboBox salad_combo = new JComboBox(quantity);

        JCheckBox chocolate = new JCheckBox("chocolate\t@$5");
        JCheckBox ice_cream = new JCheckBox("ice_cream\t@$4");
        JCheckBox coke = new JCheckBox("coke\t@$4");
        JCheckBox pepsi = new JCheckBox("pepsi\t@4");
        JCheckBox sprite = new JCheckBox("sprite\t@4");

        JComboBox chocolate_combo = new JComboBox(quantity);
        JComboBox ice_cream_combo = new JComboBox(quantity);
        JComboBox coke_combo = new JComboBox(quantity);
        JComboBox pepsi_combo = new JComboBox(quantity);
        JComboBox sprite_combo = new JComboBox(quantity);

        JButton total = new JButton("order");

        JTextArea ordered = new JTextArea("ordered:\n=>");

        labelpanel.add(label);

        panel.setLayout(new GridBagLayout());

        GridBagConstraints gridbag = new GridBagConstraints();

        gridbag.gridx = 1; gridbag.gridy = 0;
        panel.add(label1, gridbag);
        gridbag.gridx = 2; gridbag.gridy = 0;
        panel.add(label2, gridbag);

        gridbag.gridx = 0; gridbag.gridy = 1;
        panel.add(label3, gridbag);

        gridbag.gridx = 1; gridbag.gridy = 1;
        panel.add(tea, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 2;
        panel.add(coffee, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 3;
        panel.add(capuccino, gridbag);
        gridbag.gridx = 3; gridbag.gridy = 1;
        panel.add(cake, gridbag);
        gridbag.gridx = 3; gridbag.gridy = 2;
        panel.add(scones, gridbag);
        gridbag.gridx = 3; gridbag.gridy = 3;
        panel.add(cupcakes, gridbag);

        gridbag.gridx = 2; gridbag.gridy = 1;
        panel.add(tea_combo, gridbag);
        gridbag.gridx = 2; gridbag.gridy = 2;
        panel.add(coffee_combo, gridbag);
        gridbag.gridx = 2; gridbag.gridy = 3;
        panel.add(capuccino_combo, gridbag);
        gridbag.gridx = 4; gridbag.gridy = 1;
        panel.add(cake_combo, gridbag);
        gridbag.gridx = 4; gridbag.gridy = 2;
        panel.add(scones_combo, gridbag);
        gridbag.gridx = 4; gridbag.gridy = 3;
        panel.add(cupcakes_combo, gridbag);

        gridbag.gridx = 0; gridbag.gridy = 4;
        panel.add(label4, gridbag);

        gridbag.gridx = 1; gridbag.gridy = 5;
        panel.add(pizza, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 6;
        panel.add(lobster, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 7;
        panel.add(fish, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 8;
        panel.add(greens, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 9;
        panel.add(cheese, gridbag);
        gridbag.gridx = 3; gridbag.gridy = 5;
        panel.add(french_fries, gridbag);
        gridbag.gridx = 3; gridbag.gridy = 6;
        panel.add(burger, gridbag);
        gridbag.gridx = 3; gridbag.gridy = 7;
        panel.add(salad, gridbag);
        gridbag.gridx = 3; gridbag.gridy = 8;
        panel.add(hot_dog, gridbag);
        gridbag.gridx = 3; gridbag.gridy = 9;
        panel.add(kebab, gridbag);

        gridbag.gridx= 2; gridbag.gridy = 5;
        panel.add(pizza_combo, gridbag);
        gridbag.gridx= 2; gridbag.gridy = 6;
        panel.add(lobster_combo, gridbag);
        gridbag.gridx= 2; gridbag.gridy = 7;
        panel.add(fish_combo, gridbag);
        gridbag.gridx= 2; gridbag.gridy = 8;
        panel.add(greens_combo, gridbag);
        gridbag.gridx= 2; gridbag.gridy = 9;
        panel.add(cheese_combo, gridbag);
        gridbag.gridx= 4; gridbag.gridy = 5;
        panel.add(french_fries_combo, gridbag);
        gridbag.gridx= 4; gridbag.gridy = 6;
        panel.add(burger_combo, gridbag);
        gridbag.gridx= 4; gridbag.gridy = 7;
        panel.add(salad_combo, gridbag);
        gridbag.gridx= 4; gridbag.gridy = 8;
        panel.add(hot_dog_combo, gridbag);
        gridbag.gridx= 4; gridbag.gridy = 9;
        panel.add(kebab_combo, gridbag);

        gridbag.gridx = 0; gridbag.gridy = 10;
        panel.add(label5, gridbag);

        gridbag.gridx = 1; gridbag.gridy = 11;
        panel.add(chocolate, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 12;
        panel.add(ice_cream, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 13;
        panel.add(coke, gridbag);
        gridbag.gridx = 3; gridbag.gridy = 11;
        panel.add(pepsi, gridbag);
        gridbag.gridx = 3; gridbag.gridy = 12;
        panel.add(sprite, gridbag);

        gridbag.gridx = 2; gridbag.gridy = 11;
        panel.add(chocolate_combo, gridbag);
        gridbag.gridx = 2; gridbag.gridy = 12;
        panel.add(ice_cream_combo, gridbag);
        gridbag.gridx = 2; gridbag.gridy = 13;
        panel.add(coke_combo, gridbag);
        gridbag.gridx = 4; gridbag.gridy = 11;
        panel.add(pepsi_combo, gridbag);
        gridbag.gridx = 4; gridbag.gridy = 12;
        panel.add(sprite_combo, gridbag);

        gridbag.gridx = 1; gridbag.gridy = 14;
        panel.add(total, gridbag);

        footerpanel.setLayout(new BorderLayout());
        footerpanel.add(ordered, BorderLayout.CENTER);
        footerpanel.add(label6, BorderLayout.SOUTH);

        total.addActionListener(e -> {
//            JOptionPane.showConfirmDialog(frame,"do you want to order?");
            if (tea.isSelected()) {
                quantity_count = Integer.parseInt(tea_combo.getItemAt(tea_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items + " tea("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costTea(quantity_count);
            }if (pizza.isSelected()) {
                quantity_count = Integer.parseInt(pizza_combo.getItemAt(pizza_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " pizza("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costPizza(quantity_count);
            }if (coffee.isSelected()) {
                quantity_count = Integer.parseInt(coffee_combo.getItemAt(coffee_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " coffee("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costCoffee(quantity_count);
            }if (capuccino.isSelected()) {
                quantity_count = Integer.parseInt(capuccino_combo.getItemAt(capuccino_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " capuccino("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costCapuccino(quantity_count);
            }if (chocolate.isSelected()) {
                quantity_count = Integer.parseInt(chocolate_combo.getItemAt(chocolate_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " chocolate("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costChocolate(quantity_count);
            }if (cupcakes.isSelected()) {
                quantity_count = Integer.parseInt(cupcakes_combo.getItemAt(cupcakes_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " cupcake("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costCupcake(quantity_count);
            }if (scones.isSelected()) {
                quantity_count = Integer.parseInt(scones_combo.getItemAt(scones_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " scones("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costScones(quantity_count);
            }if (cake.isSelected()) {
                quantity_count = Integer.parseInt(cake_combo.getItemAt(cake_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " cake("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costCakes(quantity_count);
            }if (lobster.isSelected()) {
                quantity_count = Integer.parseInt(lobster_combo.getItemAt(lobster_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " lobster("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costLobster(quantity_count);
            }if (fish.isSelected()) {
                quantity_count = Integer.parseInt(fish_combo.getItemAt(fish_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " fish("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costFish(quantity_count);
            }if (greens.isSelected()) {
                quantity_count = Integer.parseInt(greens_combo.getItemAt(greens_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " greens("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costGreens(quantity_count);
            }if (cheese.isSelected()) {
                quantity_count = Integer.parseInt(cheese_combo.getItemAt(cheese_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " cheese("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costCheese(quantity_count);
            }if (french_fries.isSelected()) {
                quantity_count = Integer.parseInt(french_fries_combo.getItemAt(french_fries_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " french fries("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costFrenchFries(quantity_count);
            }if (burger.isSelected()) {
                quantity_count = Integer.parseInt(burger_combo.getItemAt(burger_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " burger("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costBurger(quantity_count);
            }if (salad.isSelected()) {
                quantity_count = Integer.parseInt(salad_combo.getItemAt(salad_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " salad("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costSalad(quantity_count);
            }if (ice_cream.isSelected()) {
                quantity_count = Integer.parseInt(ice_cream_combo.getItemAt(ice_cream_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " ice cream("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costIceCream(quantity_count);
            }if (coke.isSelected()) {
                quantity_count = Integer.parseInt(coke_combo.getItemAt(coke_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " coke("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costCoke(quantity_count);
            }if (pepsi.isSelected()) {
                quantity_count = Integer.parseInt(pepsi_combo.getItemAt(pepsi_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " pepsi("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costPepsi(quantity_count);
            }if (sprite.isSelected()) {
                quantity_count = Integer.parseInt(sprite_combo.getItemAt(sprite_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " sprite("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costSprite(quantity_count);
            }if (kebab.isSelected()) {
                quantity_count = Integer.parseInt(kebab_combo.getItemAt(kebab_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " kebab("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costKebab(quantity_count);
            }if (hot_dog.isSelected()) {
                quantity_count = Integer.parseInt(hot_dog_combo.getItemAt(hot_dog_combo.getSelectedIndex()).toString());
                ordered_items = ordered_items+ " hot dog("+quantity_count+") ";
                total_cost = total_cost + MenuItem.costHotDog(quantity_count);
            }
            ordered.setText(ordered_items);
            label6.setText("Total: $" + total_cost);
            ordered_items = "ordered:\n=>";
            total_cost = 0;
        });

        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(labelpanel, BorderLayout.NORTH);
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.add(footerpanel, BorderLayout.SOUTH);

        frame.add(mainPanel);

        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
