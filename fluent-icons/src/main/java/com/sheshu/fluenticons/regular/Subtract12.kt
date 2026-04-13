package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Subtract12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Subtract12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(7f)
            curveTo(9.776f, 5.5f, 10f, 5.724f, 10f, 6f)
            reflectiveCurveTo(9.776f, 6.5f, 9.5f, 6.5f)
            horizontalLineToRelative(-7f)
            curveTo(2.224f, 6.5f, 2f, 6.276f, 2f, 6f)
            close()
        }
    }.build()
}
