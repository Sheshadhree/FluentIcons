package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleRight48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(40.773f, 20.471f)
            curveToRelative(2.99f, 1.617f, 2.966f, 5.916f, -0.041f, 7.5f)
            lineTo(11.23f, 43.503f)
            curveTo(8.4f, 44.994f, 5f, 42.942f, 5f, 39.744f)
            verticalLineTo(8.255f)
            curveToRelative(0f, -3.22f, 3.44f, -5.27f, 6.272f, -3.738f)
            lineTo(40.773f, 20.47f)
            close()
        }
    }.build()
}
