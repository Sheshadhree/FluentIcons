package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cursor32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cursor32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.391f, 2.32f)
            curveTo(8.42f, 1.56f, 7f, 2.253f, 7f, 3.486f)
            verticalLineTo(28.41f)
            curveToRelative(0f, 1.538f, 1.966f, 2.18f, 2.874f, 0.938f)
            lineToRelative(6.225f, -8.523f)
            curveToRelative(0.376f, -0.515f, 0.976f, -0.82f, 1.615f, -0.82f)
            horizontalLineToRelative(9.69f)
            curveToRelative(1.512f, 0f, 2.17f, -1.912f, 0.978f, -2.844f)
            lineTo(9.392f, 2.32f)
            close()
        }
    }.build()
}
