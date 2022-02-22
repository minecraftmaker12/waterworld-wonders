// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcyan_tipped_fanfish extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer fin0;
	private final ModelRenderer cube_r1;
	private final ModelRenderer fin1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer tail;

	public Modelcyan_tipped_fanfish() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 23.0F, 1.0F);
		body.setTextureOffset(10, 13).addBox(-2.0F, -8.0F, -8.0F, 4.0F, 6.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(0, 17).addBox(0.0F, -11.0F, -4.0F, 0.0F, 12.0F, 4.0F, 0.0F, false);

		fin0 = new ModelRenderer(this);
		fin0.setRotationPoint(-0.25F, 24.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.0F, -5.0F, -3.0F);
		fin0.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3054F, 0.0F, -0.5672F);
		cube_r1.setTextureOffset(4, 4).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);

		fin1 = new ModelRenderer(this);
		fin1.setRotationPoint(0.25F, 24.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, -5.0F, -3.0F);
		fin1.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3054F, 0.0F, 0.5672F);
		cube_r2.setTextureOffset(0, 4).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 23.0F, 1.0F);
		tail.setTextureOffset(0, 0).addBox(-1.0F, -6.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		tail.setTextureOffset(0, 0).addBox(0.0F, -11.0F, 0.0F, 0.0F, 12.0F, 9.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		fin0.render(matrixStack, buffer, packedLight, packedOverlay);
		fin1.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.tail.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}