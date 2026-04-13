package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoOff32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoOff32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.923f, 22.337f)
            lineToRelative(7.37f, 7.37f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-26f, -26f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineTo(4.884f, 6.3f)
            curveTo(3.197f, 6.949f, 2f, 8.584f, 2f, 10.5f)
            verticalLineToRelative(11f)
            curveTo(2f, 23.985f, 4.015f, 26f, 6.5f, 26f)
            horizontalLineToRelative(10f)
            curveToRelative(2.2f, 0f, 4.03f, -1.578f, 4.423f, -3.663f)
            close()
            moveToRelative(1.577f, -3.374f)
            lineToRelative(5.52f, 5.519f)
            curveToRelative(1.056f, -0.134f, 1.976f, -1.017f, 1.976f, -2.236f)
            verticalLineTo(9.754f)
            curveToRelative(0f, -1.814f, -2.036f, -2.882f, -3.528f, -1.852f)
            lineToRelative(-3.968f, 2.74f)
            verticalLineToRelative(8.321f)
            close()
            moveTo(9.537f, 6f)
            lineTo(21f, 17.463f)
            verticalLineTo(10.5f)
            curveTo(21f, 8.015f, 18.986f, 6f, 16.5f, 6f)
            horizontalLineTo(9.537f)
            close()
        }
    }.build()
}
