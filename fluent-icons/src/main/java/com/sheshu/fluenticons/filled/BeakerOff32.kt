package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BeakerOff32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BeakerOff32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26.329f, 27.743f)
            lineToRelative(1.964f, 1.964f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-26f, -26f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(9.705f, 9.705f)
            verticalLineToRelative(0.026f)
            curveToRelative(0f, 0.813f, -0.248f, 1.608f, -0.712f, 2.277f)
            lineTo(9.704f, 18f)
            horizontalLineToRelative(6.882f)
            lineToRelative(2f, 2f)
            horizontalLineTo(8.32f)
            lineToRelative(-2.744f, 3.962f)
            curveTo(4.103f, 26.092f, 5.626f, 29f, 8.216f, 29f)
            horizontalLineTo(23.78f)
            curveToRelative(1.083f, 0f, 1.98f, -0.51f, 2.549f, -1.257f)
            close()
            moveTo(21.538f, 18f)
            lineToRelative(-9.54f, -9.54f)
            verticalLineTo(5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            curveToRelative(0f, -0.553f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, 0.447f, 1f, 1f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(8.438f)
            curveToRelative(0f, 0.813f, 0.248f, 1.608f, 0.71f, 2.277f)
            lineTo(22.292f, 18f)
            horizontalLineToRelative(-0.753f)
            close()
        }
    }.build()
}
