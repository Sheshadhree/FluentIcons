package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Premium20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Premium20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 2.75f)
            curveToRelative(-0.274f, 0f, -0.525f, 0.149f, -0.657f, 0.389f)
            lineToRelative(-2.75f, 5f)
            curveToRelative(-0.149f, 0.27f, -0.117f, 0.602f, 0.08f, 0.84f)
            lineToRelative(7.25f, 8.75f)
            curveTo(9.564f, 17.9f, 9.776f, 18f, 10f, 18f)
            curveToRelative(0.223f, 0f, 0.435f, -0.1f, 0.578f, -0.271f)
            lineToRelative(7.25f, -8.75f)
            curveToRelative(0.196f, -0.238f, 0.228f, -0.57f, 0.08f, -0.84f)
            lineToRelative(-2.75f, -5f)
            curveTo(15.024f, 2.899f, 14.773f, 2.75f, 14.5f, 2.75f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(4.156f, 7.5f)
            lineToRelative(1.788f, -3.25f)
            horizontalLineToRelative(1.499f)
            lineTo(6.305f, 7.5f)
            horizontalLineTo(4.156f)
            close()
            moveTo(6.144f, 9f)
            lineToRelative(1.928f, 4.748f)
            lineTo(4.138f, 9f)
            horizontalLineToRelative(2.006f)
            close()
            moveToRelative(3.845f, 5.481f)
            lineTo(7.763f, 9f)
            horizontalLineToRelative(4.386f)
            lineToRelative(-2.16f, 5.481f)
            close()
            moveTo(7.895f, 7.5f)
            lineToRelative(1.137f, -3.25f)
            horizontalLineToRelative(1.945f)
            lineToRelative(1.197f, 3.25f)
            horizontalLineToRelative(-4.28f)
            close()
            moveToRelative(5.878f, 0f)
            lineToRelative(-1.197f, -3.25f)
            horizontalLineToRelative(1.48f)
            lineToRelative(1.788f, 3.25f)
            horizontalLineToRelative(-2.071f)
            close()
            moveTo(13.761f, 9f)
            horizontalLineToRelative(2.1f)
            lineToRelative(-4.005f, 4.834f)
            lineTo(13.761f, 9f)
            close()
        }
    }.build()
}
