package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Diamond32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Diamond32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.319f, 19.182f)
            curveToRelative(-1.757f, -1.758f, -1.757f, -4.607f, 0f, -6.364f)
            lineToRelative(9.5f, -9.5f)
            curveToRelative(1.757f, -1.757f, 4.606f, -1.757f, 6.364f, 0f)
            lineToRelative(9.5f, 9.5f)
            curveToRelative(1.757f, 1.757f, 1.757f, 4.606f, 0f, 6.364f)
            lineToRelative(-9.5f, 9.5f)
            curveToRelative(-1.758f, 1.757f, -4.607f, 1.757f, -6.364f, 0f)
            lineToRelative(-9.5f, -9.5f)
            close()
            moveToRelative(1.414f, -4.95f)
            curveToRelative(-0.976f, 0.976f, -0.976f, 2.56f, 0f, 3.535f)
            lineToRelative(9.5f, 9.5f)
            curveToRelative(0.976f, 0.976f, 2.56f, 0.976f, 3.535f, 0f)
            lineToRelative(9.5f, -9.5f)
            curveToRelative(0.976f, -0.976f, 0.976f, -2.559f, 0f, -3.535f)
            lineToRelative(-9.5f, -9.5f)
            curveToRelative(-0.976f, -0.976f, -2.559f, -0.976f, -3.535f, 0f)
            lineToRelative(-9.5f, 9.5f)
            close()
        }
    }.build()
}
