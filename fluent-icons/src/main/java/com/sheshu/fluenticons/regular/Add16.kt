package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Add16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Add16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            curveTo(13.776f, 7.5f, 14f, 7.724f, 14f, 8f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            curveTo(8.5f, 13.776f, 8.276f, 14f, 8f, 14f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-5f)
            curveTo(2.224f, 8.5f, 2f, 8.276f, 2f, 8f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-5f)
            curveTo(7.5f, 2.224f, 7.724f, 2f, 8f, 2f)
            close()
        }
    }.build()
}
