package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.682f, 13.15f)
            curveToRelative(-2.242f, 1.236f, -2.243f, 4.457f, -0.001f, 5.693f)
            lineToRelative(19.498f, 10.75f)
            curveTo(26.345f, 30.787f, 29f, 29.22f, 29f, 26.747f)
            verticalLineTo(5.255f)
            curveToRelative(0f, -2.473f, -2.653f, -4.04f, -4.819f, -2.847f)
            lineTo(4.682f, 13.15f)
            close()
        }
    }.build()
}
