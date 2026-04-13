package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.StarThreeQuarter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarThreeQuarter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.898f, 2.9f)
            lineToRelative(1.93f, 3.91f)
            lineToRelative(4.317f, 0.628f)
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
            curveToRelative(0.367f, -0.743f, 1.427f, -0.743f, 1.794f, 0f)
            close()
            moveToRelative(1.104f, 4.474f)
            verticalLineToRelative(8.06f)
            lineToRelative(2.325f, 1.223f)
            lineToRelative(-0.737f, -4.3f)
            curveToRelative(-0.056f, -0.324f, 0.052f, -0.655f, 0.287f, -0.885f)
            lineToRelative(3.124f, -3.044f)
            lineTo(12.684f, 7.8f)
            curveToRelative(-0.279f, -0.04f, -0.525f, -0.196f, -0.682f, -0.426f)
            close()
        }
    }.build()
}
