package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleDown32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleDown32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.15f, 27.319f)
            curveToRelative(1.236f, 2.242f, 4.457f, 2.242f, 5.693f, 0f)
            lineToRelative(10.75f, -19.498f)
            curveToRelative(1.194f, -2.166f, -0.373f, -4.819f, -2.846f, -4.819f)
            horizontalLineTo(5.255f)
            curveToRelative(-2.473f, 0f, -4.04f, 2.652f, -2.847f, 4.818f)
            lineToRelative(10.742f, 19.5f)
            close()
        }
    }.build()
}
