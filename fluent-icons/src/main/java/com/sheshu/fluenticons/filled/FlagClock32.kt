package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagClock32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagClock32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 3f)
            curveTo(5.672f, 3f, 5f, 3.672f, 5f, 4.5f)
            verticalLineTo(28f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-7f)
            horizontalLineToRelative(7.223f)
            curveToRelative(0.91f, -4.008f, 4.494f, -7f, 8.777f, -7f)
            curveToRelative(0.652f, 0f, 1.288f, 0.07f, 1.9f, 0.201f)
            lineTo(23.25f, 12f)
            lineToRelative(5.55f, -7.4f)
            curveToRelative(0.227f, -0.303f, 0.264f, -0.708f, 0.094f, -1.047f)
            curveTo(28.725f, 3.214f, 28.38f, 3f, 28f, 3f)
            horizontalLineTo(6.5f)
            close()
            moveTo(23f, 30.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            close()
            moveTo(22.75f, 18f)
            curveTo(22.336f, 18f, 22f, 18.336f, 22f, 18.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(23.5f)
            verticalLineToRelative(-3.75f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
