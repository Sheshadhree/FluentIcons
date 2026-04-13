package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Subtract16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Subtract16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 8f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(9f)
            curveTo(12.776f, 7.5f, 13f, 7.724f, 13f, 8f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-9f)
            curveTo(3.224f, 8.5f, 3f, 8.276f, 3f, 8f)
            close()
        }
    }.build()
}
