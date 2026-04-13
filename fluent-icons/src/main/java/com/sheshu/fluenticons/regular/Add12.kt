package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Add12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Add12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            curveTo(9.776f, 5.5f, 10f, 5.724f, 10f, 6f)
            reflectiveCurveTo(9.776f, 6.5f, 9.5f, 6.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            curveTo(6.5f, 9.776f, 6.276f, 10f, 6f, 10f)
            reflectiveCurveTo(5.5f, 9.776f, 5.5f, 9.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(-3f)
            curveTo(2.224f, 6.5f, 2f, 6.276f, 2f, 6f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-3f)
            curveTo(5.5f, 2.224f, 5.724f, 2f, 6f, 2f)
            close()
        }
    }.build()
}
