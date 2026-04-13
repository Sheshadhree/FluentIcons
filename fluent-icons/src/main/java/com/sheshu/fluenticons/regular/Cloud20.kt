package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cloud20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cloud20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 4f)
            curveToRelative(2.817f, 0f, 4.415f, 1.923f, 4.647f, 4.246f)
            horizontalLineToRelative(0.07f)
            curveToRelative(1.814f, 0f, 3.283f, 1.512f, 3.283f, 3.377f)
            curveTo(18f, 13.488f, 16.53f, 15f, 14.718f, 15f)
            horizontalLineTo(5.282f)
            curveTo(3.47f, 15f, 2f, 13.488f, 2f, 11.623f)
            curveTo(2f, 9.82f, 3.373f, 8.347f, 5.102f, 8.251f)
            lineToRelative(0.251f, -0.005f)
            curveTo(5.587f, 5.908f, 7.183f, 4f, 10f, 4f)
            close()
            moveToRelative(0f, 1f)
            curveTo(7.886f, 5f, 6.551f, 6.316f, 6.348f, 8.345f)
            curveToRelative(-0.05f, 0.512f, -0.481f, 0.901f, -0.995f, 0.901f)
            horizontalLineToRelative(-0.07f)
            curveTo(4.027f, 9.246f, 3f, 10.304f, 3f, 11.623f)
            curveTo(3f, 12.943f, 4.028f, 14f, 5.282f, 14f)
            horizontalLineToRelative(9.436f)
            curveTo(15.972f, 14f, 17f, 12.942f, 17f, 11.623f)
            curveToRelative(0f, -1.32f, -1.028f, -2.377f, -2.282f, -2.377f)
            horizontalLineToRelative(-0.071f)
            curveToRelative(-0.514f, 0f, -0.944f, -0.39f, -0.995f, -0.9f)
            curveTo(13.45f, 6.324f, 12.109f, 5f, 10f, 5f)
            close()
        }
    }.build()
}
