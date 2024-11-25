package com.puc.trabalho1_n2_jogo_com_poo.domain.potion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Potion {
    private Integer quantity;

    public void usePotion() {
        if (this.quantity > 0) this.quantity--;
    }
}
