package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LeafOne16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LeafOne16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.275f, 4.536f)
            curveToRelative(2.075f, 1.874f, 2.156f, 5.104f, 0.18f, 7.08f)
            curveToRelative(-0.827f, 0.827f, -1.876f, 1.296f, -2.955f, 1.406f)
            verticalLineTo(14.5f)
            curveTo(8.5f, 14.776f, 8.276f, 15f, 8f, 15f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-1.478f)
            curveToRelative(-1.079f, -0.11f, -2.128f, -0.579f, -2.955f, -1.406f)
            curveTo(2.568f, 9.64f, 2.65f, 6.41f, 4.725f, 4.536f)
            lineToRelative(2.437f, -2.2f)
            curveToRelative(0.476f, -0.43f, 1.2f, -0.43f, 1.676f, 0f)
            lineToRelative(2.437f, 2.2f)
            close()
            moveTo(8.5f, 7.501f)
            curveTo(8.5f, 7.225f, 8.276f, 7f, 8f, 7f)
            reflectiveCurveTo(7.5f, 7.225f, 7.5f, 7.5f)
            verticalLineToRelative(4.514f)
            curveToRelative(0.332f, 0.043f, 0.668f, 0.043f, 1f, 0f)
            verticalLineTo(7.501f)
            close()
        }
    }.build()
}
