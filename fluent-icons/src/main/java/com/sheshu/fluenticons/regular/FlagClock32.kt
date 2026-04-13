package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlagClock32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlagClock32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4.5f)
            curveTo(5f, 3.672f, 5.672f, 3f, 6.5f, 3f)
            horizontalLineTo(28f)
            curveToRelative(0.379f, 0f, 0.725f, 0.214f, 0.894f, 0.553f)
            curveToRelative(0.17f, 0.339f, 0.133f, 0.744f, -0.094f, 1.047f)
            lineTo(23.25f, 12f)
            lineToRelative(1.65f, 2.201f)
            curveTo(24.289f, 14.07f, 23.653f, 14f, 23f, 14f)
            curveToRelative(-0.245f, 0f, -0.488f, 0.01f, -0.728f, 0.029f)
            lineTo(21.2f, 12.6f)
            curveToRelative(-0.267f, -0.356f, -0.267f, -0.844f, 0f, -1.2f)
            lineTo(26f, 5f)
            horizontalLineTo(7f)
            verticalLineToRelative(14f)
            horizontalLineToRelative(7.935f)
            curveToRelative(-0.312f, 0.628f, -0.553f, 1.299f, -0.712f, 2f)
            horizontalLineTo(7f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineTo(4.5f)
            close()
            moveToRelative(18f, 26f)
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
