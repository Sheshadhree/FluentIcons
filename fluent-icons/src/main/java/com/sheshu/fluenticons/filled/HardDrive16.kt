package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HardDrive16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HardDrive16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 8f)
            curveTo(13.328f, 8f, 14f, 8.672f, 14f, 9.5f)
            verticalLineToRelative(1.002f)
            curveToRelative(0f, 0.397f, -0.158f, 0.778f, -0.44f, 1.059f)
            curveTo(13.28f, 11.842f, 12.899f, 12f, 12.5f, 12f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.398f, 0f, -0.78f, -0.159f, -1.06f, -0.44f)
            curveTo(2.157f, 11.279f, 2f, 10.898f, 2f, 10.5f)
            verticalLineToRelative(-1f)
            curveTo(2f, 8.67f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(9f)
            close()
            moveToRelative(1.058f, -0.766f)
            lineToRelative(-1.673f, -3.507f)
            verticalLineTo(3.72f)
            curveToRelative(-0.1f, -0.217f, -0.26f, -0.4f, -0.46f, -0.528f)
            curveTo(11.222f, 3.064f, 10.987f, 2.997f, 10.75f, 3f)
            horizontalLineToRelative(-5.5f)
            curveTo(5.012f, 2.998f, 4.778f, 3.064f, 4.576f, 3.192f)
            curveToRelative(-0.2f, 0.128f, -0.36f, 0.311f, -0.46f, 0.528f)
            verticalLineToRelative(0.007f)
            lineTo(2.442f, 7.234f)
            curveTo(2.763f, 7.084f, 3.122f, 7f, 3.5f, 7f)
            horizontalLineToRelative(9f)
            curveToRelative(0.378f, 0f, 0.737f, 0.084f, 1.058f, 0.234f)
            close()
            moveTo(12f, 10.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.276f, 9.5f, 12f, 9.5f)
            reflectiveCurveToRelative(-0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            close()
        }
    }.build()
}
