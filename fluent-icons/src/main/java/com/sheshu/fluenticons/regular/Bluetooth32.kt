package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Bluetooth32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bluetooth32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.6f, 2.083f)
            curveToRelative(0.365f, -0.159f, 0.789f, -0.086f, 1.08f, 0.184f)
            lineToRelative(7f, 6.5f)
            curveTo(23.884f, 8.957f, 24f, 9.222f, 24f, 9.5f)
            curveToRelative(0f, 0.278f, -0.116f, 0.544f, -0.32f, 0.733f)
            lineTo(17.47f, 16f)
            lineToRelative(6.21f, 5.767f)
            curveTo(23.884f, 21.957f, 24f, 22.222f, 24f, 22.5f)
            curveToRelative(0f, 0.278f, -0.116f, 0.544f, -0.32f, 0.733f)
            lineToRelative(-7f, 6.5f)
            curveToRelative(-0.291f, 0.27f, -0.715f, 0.343f, -1.08f, 0.184f)
            curveToRelative(-0.364f, -0.16f, -0.6f, -0.52f, -0.6f, -0.917f)
            verticalLineTo(18.293f)
            lineToRelative(-5.32f, 4.94f)
            curveToRelative(-0.404f, 0.376f, -1.037f, 0.352f, -1.413f, -0.053f)
            curveToRelative(-0.376f, -0.404f, -0.352f, -1.037f, 0.053f, -1.413f)
            lineTo(14.53f, 16f)
            lineToRelative(-6.21f, -5.767f)
            curveTo(7.914f, 9.857f, 7.89f, 9.224f, 8.266f, 8.819f)
            curveTo(8.642f, 8.415f, 9.275f, 8.391f, 9.68f, 8.767f)
            lineToRelative(5.32f, 4.94f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.398f, 0.236f, -0.758f, 0.6f, -0.917f)
            close()
            moveToRelative(1.4f, 16.21f)
            verticalLineToRelative(8.414f)
            lineToRelative(4.53f, -4.207f)
            lineTo(17f, 18.293f)
            close()
            moveToRelative(0f, -4.586f)
            lineTo(21.53f, 9.5f)
            lineTo(17f, 5.293f)
            verticalLineToRelative(8.414f)
            close()
        }
    }.build()
}
