package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ReOrderVertical16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ReOrderVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 13.5f)
            verticalLineToRelative(-11f)
            curveTo(9f, 2.224f, 9.224f, 2f, 9.5f, 2f)
            curveToRelative(0.245f, 0f, 0.45f, 0.177f, 0.492f, 0.41f)
            lineTo(10f, 2.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            curveToRelative(-0.245f, 0f, -0.45f, -0.177f, -0.492f, -0.41f)
            lineTo(9f, 13.5f)
            close()
            moveToRelative(-3f, 0f)
            verticalLineToRelative(-11f)
            curveTo(6f, 2.224f, 6.224f, 2f, 6.5f, 2f)
            curveToRelative(0.245f, 0f, 0.45f, 0.177f, 0.492f, 0.41f)
            lineTo(7f, 2.5f)
            verticalLineToRelative(11f)
            curveTo(7f, 13.776f, 6.776f, 14f, 6.5f, 14f)
            curveToRelative(-0.245f, 0f, -0.45f, -0.177f, -0.492f, -0.41f)
            lineTo(6f, 13.5f)
            close()
        }
    }.build()
}
