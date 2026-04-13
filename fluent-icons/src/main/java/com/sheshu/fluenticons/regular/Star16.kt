package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Star16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Star16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.194f, 2.101f)
            curveToRelative(0.33f, -0.669f, 1.284f, -0.669f, 1.614f, 0f)
            lineToRelative(1.521f, 3.082f)
            lineToRelative(3.401f, 0.495f)
            curveToRelative(0.739f, 0.107f, 1.033f, 1.014f, 0.5f, 1.535f)
            lineToRelative(-2.462f, 2.399f)
            lineToRelative(0.581f, 3.387f)
            curveToRelative(0.126f, 0.736f, -0.646f, 1.296f, -1.306f, 0.949f)
            lineToRelative(-3.042f, -1.6f)
            lineToRelative(-3.042f, 1.6f)
            curveToRelative(-0.66f, 0.347f, -1.432f, -0.213f, -1.306f, -0.949f)
            lineToRelative(0.58f, -3.387f)
            lineToRelative(-2.46f, -2.4f)
            curveToRelative(-0.534f, -0.52f, -0.24f, -1.427f, 0.499f, -1.534f)
            lineToRelative(3.4f, -0.495f)
            lineToRelative(1.522f, -3.082f)
            close()
            moveTo(8f, 2.726f)
            lineTo(6.546f, 5.673f)
            curveTo(6.416f, 5.94f, 6.162f, 6.123f, 5.87f, 6.165f)
            lineTo(2.616f, 6.638f)
            lineTo(4.97f, 8.932f)
            curveTo(5.182f, 9.14f, 5.279f, 9.437f, 5.228f, 9.73f)
            lineToRelative(-0.555f, 3.24f)
            lineToRelative(2.91f, -1.53f)
            curveToRelative(0.261f, -0.138f, 0.575f, -0.138f, 0.837f, 0f)
            lineToRelative(2.91f, 1.53f)
            lineToRelative(-0.556f, -3.24f)
            curveToRelative(-0.05f, -0.292f, 0.046f, -0.59f, 0.258f, -0.797f)
            lineToRelative(2.354f, -2.294f)
            lineToRelative(-3.253f, -0.473f)
            curveTo(9.84f, 6.123f, 9.587f, 5.94f, 9.456f, 5.673f)
            lineTo(8f, 2.726f)
            close()
        }
    }.build()
}
