package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Alert12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Alert12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveTo(3.79f, 1f, 2f, 2.79f, 2f, 5f)
            verticalLineToRelative(1.382f)
            lineTo(1.053f, 8.276f)
            curveToRelative(-0.078f, 0.155f, -0.07f, 0.34f, 0.022f, 0.487f)
            curveTo(1.165f, 8.91f, 1.327f, 9f, 1.5f, 9f)
            horizontalLineToRelative(9f)
            curveToRelative(0.173f, 0f, 0.334f, -0.09f, 0.425f, -0.237f)
            curveToRelative(0.091f, -0.147f, 0.1f, -0.332f, 0.022f, -0.487f)
            lineTo(10f, 6.382f)
            verticalLineTo(5f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(0f, 10.5f)
            curveToRelative(-0.932f, 0f, -1.715f, -0.637f, -1.937f, -1.5f)
            horizontalLineToRelative(3.874f)
            curveTo(7.715f, 10.863f, 6.932f, 11.5f, 6f, 11.5f)
            close()
        }
    }.build()
}
