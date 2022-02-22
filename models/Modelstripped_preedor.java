// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelstripped_preedor extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer fin0;
	private final ModelRenderer cube_r1;
	private final ModelRenderer tail;
	private final ModelRenderer fin_back0;
	private final ModelRenderer fin_back1;
	private final ModelRenderer fin1;
	private final ModelRenderer cube_r2;

	public Modelstripped_preedor() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(-1.0F, 21.0F, -2.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -8.0F, 8.0F, 6.0F, 12.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.95F, -8.0F);
		body.addChild(head);
		head.setTextureOffset(28, 0).addBox(-1.5F, 1.0F, -6.5F, 5.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 18).addBox(-2.0F, -2.0F, -8.0F, 6.0F, 3.0F, 8.0F, 0.0F, false);

		fin0 = new ModelRenderer(this);
		fin0.setRotationPoint(4.0F, 22.0F, -6.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.5F, -0.25F, -0.5F);
		fin0.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0289F, -0.2163F, 0.4831F);
		cube_r1.setTextureOffset(25, 8).addBox(0.0F, 0.0F, -1.5F, 5.0F, 0.0F, 3.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-1.0F, 21.5F, 2.0F);
		tail.setTextureOffset(20, 21).addBox(-1.5F, -2.0F, 0.0F, 5.0F, 4.0F, 8.0F, 0.0F, false);

		fin_back0 = new ModelRenderer(this);
		fin_back0.setRotationPoint(0.0F, 21.5F, 9.0F);
		fin_back0.setTextureOffset(0, 22).addBox(0.0F, -5.0F, -1.0F, 0.0F, 9.0F, 7.0F, 0.0F, false);

		fin_back1 = new ModelRenderer(this);
		fin_back1.setRotationPoint(0.0F, 0.0F, 5.0F);
		fin_back0.addChild(fin_back1);
		fin_back1.setTextureOffset(14, 29).addBox(0.0F, -5.0F, 1.0F, 0.0F, 9.0F, 4.0F, 0.0F, false);

		fin1 = new ModelRenderer(this);
		fin1.setRotationPoint(-4.0F, 22.0F, -6.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, -0.25F, -0.5F);
		fin1.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0289F, 0.2163F, -0.4831F);
		cube_r2.setTextureOffset(17, 18).addBox(-5.0F, 0.0F, -1.5F, 5.0F, 0.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		fin0.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		fin_back0.render(matrixStack, buffer, packedLight, packedOverlay);
		fin1.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.tail.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.fin_back0.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.fin_back1.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}