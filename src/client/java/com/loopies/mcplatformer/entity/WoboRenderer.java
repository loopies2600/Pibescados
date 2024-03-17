package com.loopies.mcplatformer.entity;

import com.loopies.mcplatformer.Pibescados;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import com.loopies.mcplatformer.entity.custom.WoboEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class WoboRenderer extends MobEntityRenderer<WoboEntity, WoboEntityModel<WoboEntity>> {
    private static final Identifier TEXTURE = new Identifier(Pibescados.MOD_ID, "textures/entity/wobo.png");
    public WoboRenderer(EntityRendererFactory.Context context) {
        super(context, new WoboEntityModel<>(context.getPart(ModModelLayers.WOBO)), 0.5f);
    }

    @Override
    public Identifier getTexture(WoboEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(WoboEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
