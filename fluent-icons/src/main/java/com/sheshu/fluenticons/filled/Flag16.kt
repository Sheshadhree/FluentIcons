package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flag16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flag16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 10f)
            horizontalLineToRelative(9f)
            curveToRelative(0.407f, 0f, 0.643f, -0.46f, 0.407f, -0.79f)
            lineTo(11.114f, 6f)
            lineToRelative(2.293f, -3.21f)
            curveTo(13.643f, 2.46f, 13.407f, 2f, 13f, 2f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 2f, 3f, 2.224f, 3f, 2.5f)
            verticalLineToRelative(11f)
            curveTo(3f, 13.776f, 3.224f, 14f, 3.5f, 14f)
            reflectiveCurveTo(4f, 13.776f, 4f, 13.5f)
            verticalLineTo(10f)
            close()
        }
    }.build()
}
