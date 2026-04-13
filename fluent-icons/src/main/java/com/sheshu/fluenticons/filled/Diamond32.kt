package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Diamond32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Diamond32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.318f, 12.818f)
            curveToRelative(-1.757f, 1.757f, -1.757f, 4.606f, 0f, 6.364f)
            lineToRelative(9.5f, 9.5f)
            curveToRelative(1.757f, 1.757f, 4.606f, 1.757f, 6.364f, 0f)
            lineToRelative(9.5f, -9.5f)
            curveToRelative(1.757f, -1.758f, 1.757f, -4.607f, 0f, -6.364f)
            lineToRelative(-9.5f, -9.5f)
            curveToRelative(-1.758f, -1.757f, -4.607f, -1.757f, -6.364f, 0f)
            lineToRelative(-9.5f, 9.5f)
            close()
        }
    }.build()
}
