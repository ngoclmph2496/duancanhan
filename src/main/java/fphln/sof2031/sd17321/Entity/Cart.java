package fphln.sof2031.sd17321.Entity;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cart {
    private ArrayList<Item> items;
}
