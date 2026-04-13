package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextColor16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextColor16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.46f, 1.303f)
            curveTo(8.38f, 1.119f, 8.2f, 1f, 8f, 1f)
            reflectiveCurveTo(7.62f, 1.12f, 7.54f, 1.303f)
            lineToRelative(-3f, 7f)
            curveTo(4.433f, 8.557f, 4.55f, 8.851f, 4.804f, 8.96f)
            curveTo(5.057f, 9.068f, 5.351f, 8.95f, 5.46f, 8.697f)
            lineTo(6.187f, 7f)
            horizontalLineToRelative(3.626f)
            lineToRelative(0.728f, 1.697f)
            curveToRelative(0.108f, 0.254f, 0.402f, 0.371f, 0.656f, 0.263f)
            curveToRelative(0.254f, -0.11f, 0.372f, -0.403f, 0.263f, -0.657f)
            lineToRelative(-3f, -7f)
            close()
            moveTo(9.385f, 6f)
            horizontalLineToRelative(-2.77f)
            lineTo(8f, 2.77f)
            lineTo(9.385f, 6f)
            close()
            moveTo(3.5f, 10f)
            curveTo(2.672f, 10f, 2f, 10.672f, 2f, 11.5f)
            verticalLineToRelative(2f)
            curveTo(2f, 14.328f, 2.672f, 15f, 3.5f, 15f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(3f, 11.5f)
            curveTo(3f, 11.224f, 3.224f, 11f, 3.5f, 11f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-9f)
            curveTo(3.224f, 14f, 3f, 13.776f, 3f, 13.5f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
