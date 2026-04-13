package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Next16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Next16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.002f)
            curveTo(2f, 2.19f, 2.916f, 1.717f, 3.58f, 2.186f)
            lineToRelative(7f, 4.963f)
            curveToRelative(0.56f, 0.397f, 0.563f, 1.227f, 0.006f, 1.628f)
            lineToRelative(-7f, 5.037f)
            curveTo(2.922f, 14.29f, 2f, 13.818f, 2f, 13.003f)
            verticalLineTo(3.002f)
            close()
            moveTo(14f, 2.5f)
            curveTo(14f, 2.224f, 13.776f, 2f, 13.5f, 2f)
            reflectiveCurveTo(13f, 2.224f, 13f, 2.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-11f)
            close()
        }
    }.build()
}
