package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.StarHalf20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarHalf20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.104f, 2.9f)
            curveToRelative(0.184f, -0.373f, 0.541f, -0.558f, 0.898f, -0.558f)
            curveToRelative(0.356f, 0f, 0.712f, 0.186f, 0.896f, 0.557f)
            lineToRelative(1.93f, 3.912f)
            lineToRelative(4.317f, 0.627f)
            curveToRelative(0.82f, 0.12f, 1.148f, 1.127f, 0.554f, 1.706f)
            lineToRelative(-3.124f, 3.044f)
            lineToRelative(0.738f, 4.3f)
            curveToRelative(0.14f, 0.816f, -0.717f, 1.44f, -1.451f, 1.054f)
            lineToRelative(-3.86f, -2.03f)
            lineToRelative(-3.862f, 2.03f)
            curveToRelative(-0.733f, 0.385f, -1.59f, -0.238f, -1.45f, -1.055f)
            lineToRelative(0.737f, -4.299f)
            lineToRelative(-3.124f, -3.044f)
            curveTo(1.71f, 8.565f, 2.037f, 7.557f, 2.857f, 7.438f)
            lineToRelative(4.317f, -0.627f)
            lineToRelative(1.93f, -3.912f)
            close()
            moveToRelative(0.898f, 11.612f)
            curveToRelative(0.16f, 0f, 0.319f, 0.038f, 0.464f, 0.115f)
            lineToRelative(3.861f, 2.03f)
            lineToRelative(-0.737f, -4.3f)
            curveToRelative(-0.056f, -0.324f, 0.052f, -0.655f, 0.287f, -0.885f)
            lineToRelative(3.124f, -3.044f)
            lineTo(12.684f, 7.8f)
            curveToRelative(-0.325f, -0.047f, -0.607f, -0.252f, -0.752f, -0.547f)
            lineToRelative(-1.93f, -3.91f)
            verticalLineToRelative(11.169f)
            close()
        }
    }.build()
}
