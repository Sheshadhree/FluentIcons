package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Box20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Box20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 7.96f)
            lineToRelative(3.029f, -1.21f)
            lineToRelative(-7.5f, -3f)
            lineToRelative(-2.586f, 1.034f)
            curveTo(2.81f, 4.837f, 2.688f, 4.907f, 2.579f, 4.992f)
            lineTo(10f, 7.961f)
            close()
            moveTo(2.035f, 5.853f)
            curveTo(2.012f, 5.957f, 2f, 6.066f, 2f, 6.176f)
            verticalLineToRelative(7.646f)
            curveToRelative(0f, 0.614f, 0.373f, 1.165f, 0.943f, 1.393f)
            lineTo(8.7f, 17.518f)
            curveToRelative(0.26f, 0.104f, 0.528f, 0.175f, 0.8f, 0.214f)
            verticalLineTo(8.838f)
            lineTo(2.035f, 5.852f)
            close()
            moveToRelative(8.465f, 11.88f)
            curveToRelative(0.272f, -0.039f, 0.54f, -0.11f, 0.8f, -0.214f)
            lineToRelative(5.757f, -2.303f)
            curveToRelative(0.57f, -0.228f, 0.943f, -0.78f, 0.943f, -1.393f)
            verticalLineTo(6.176f)
            curveToRelative(0f, -0.11f, -0.012f, -0.219f, -0.035f, -0.324f)
            lineTo(10.5f, 8.838f)
            verticalLineToRelative(8.894f)
            close()
            moveToRelative(6.921f, -12.74f)
            lineToRelative(-3.046f, 1.219f)
            lineToRelative(-7.5f, -3f)
            lineTo(8.7f, 2.48f)
            curveToRelative(0.835f, -0.334f, 1.765f, -0.334f, 2.6f, 0f)
            lineToRelative(5.757f, 2.303f)
            curveToRelative(0.133f, 0.053f, 0.255f, 0.123f, 0.364f, 0.208f)
            close()
        }
    }.build()
}
